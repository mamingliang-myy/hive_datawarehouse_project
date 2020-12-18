package org.mml.hadoop.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Package: org.mml.hadoop.hdfs
 * @ClassName: Hdfs_Write
 * @Author: maml
 * @CreateTime: 2020/12/17 15:59
 * @Description:
 */
public class Hdfs_Read {
    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        //配置hdfs集群信息，fs.defaultFS 值与 core-site.xml 里的匹配
        conf.set("fs.defauleFS","hdfs://acrmhadoop");
        System.setProperty("HADOOP_USER_NAME","hadoop");
        FileSystem fileSystem = FileSystem.get(conf);
        FSDataInputStream open = fileSystem.open(new Path("/user/root/tmp/1.json"));
        InputStreamReader inputStreamReader = new InputStreamReader(open);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String in = null;
        while(null != (in = bufferedReader.readLine())){
            System.out.println(in);
        }
        open.close();
        fileSystem.close();


    }
}
