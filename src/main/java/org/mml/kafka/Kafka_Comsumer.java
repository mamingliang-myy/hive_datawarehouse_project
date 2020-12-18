package org.mml.kafka;

import com.sun.corba.se.internal.CosNaming.BootstrapServer;
import kafka.server.KafkaConfig;
import net.sf.json.JSONObject;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import scala.io.Source;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;

/**
 * @Package: org.mml.kafka
 * @ClassName: Kafka_comsumer
 * @Author: maml
 * @CreateTime: 2020/12/16 15:49
 * @Description:
 */
public class Kafka_Comsumer {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //配置集群信息
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "10.157.0.51:9092");
        //配置消费者组
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, "test14");
        //K V 反序列化
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        //自动提交
        properties.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        properties.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        //
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
        consumer.subscribe(Arrays.asList("P008_South_PG_PROD_19.cpzxdb.public.cpzx_drisk_dep"));
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File("src\\out\\1.log");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        //hdfs
        Configuration configuration = new Configuration();
        configuration.set("fs.defauleFS","hdfs://acrm-hadoop");
        System.setProperty("HADOOP_USER_NAME","hdfs");
        FileSystem fileSystem = FileSystem.get(configuration);
        fileSystem.create(new Path(""));
        while (true) {
            ConsumerRecords<String, String> poll = consumer.poll(1000);
            for (ConsumerRecord<String, String> stringStringConsumerRecord : poll) {
                JSONObject values = JSONObject.fromObject(stringStringConsumerRecord.value());
                //System.out.println(values.get("payload"));
                JSONObject values1 = JSONObject.fromObject(values.get("payload"));
                JSONObject after = JSONObject.fromObject(values1.getString("after"));
                System.out.println(after.toString());

                Iterator keys = after.keys();
                while (keys.hasNext()) {
                    for (int i = 0; i < 72; i++) {
                        String key = keys.next().toString();
                        String value = after.get(key).toString();
                        stringBuilder.append(value.replaceAll("\r|\n",""));
                        if (i < 71) {
                            stringBuilder.append(">|");
                        }
                        if (i == 71) {
                            stringBuilder.append("\r\n");
                        }
                        writer.write(stringBuilder.toString());
                        writer.flush();
                        stringBuilder=new StringBuilder();
                    }
                    //System.out.println(value);
                    //System.out.println();
                    //System.out.print(value);
                }

                //System.out.println(stringStringConsumerRecord.key()+":"+stringStringConsumerRecord.value());
            }

        }
    }
}
