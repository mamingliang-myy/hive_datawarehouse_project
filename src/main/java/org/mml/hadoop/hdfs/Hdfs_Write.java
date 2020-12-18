package org.mml.hadoop.hdfs;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.File;
import java.io.IOException;

/**
 * @Package: org.mml.hadoop.hdfs
 * @ClassName: Hdfs_Write
 * @Author: maml
 * @CreateTime: 2020/12/17 17:39
 * @Description:
 */
public class Hdfs_Write {
    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defauleFS","hdfs://acrm-hadoop");
        System.setProperty("HADOOP_USER_NAME","hdfs");
        FileSystem fileSystem = FileSystem.get(conf);
        FSDataOutputStream fsDataOutputStream = fileSystem.create(new Path("/user/root/tmp/11.log"));
        for (int i = 0; i < 100; i++) {
            fsDataOutputStream.writeChars("dadfs"+Integer.toString(i));
        }
        fileSystem.close();
        fsDataOutputStream.close();
    }
}
