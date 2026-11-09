package Study_School;

import java.io.*;

public class Example16 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/1.jpg"));
        //创建缓冲输入流：包装文件字节输入流，用来读取jpg
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/2.jpg"));
        //创建缓冲输出流：包装文件字节输出流，用来写入jpg
        byte[] buff = new byte[1024];   //字节数组，作为缓冲区一次最多读取1024字节
        int len = 0;        //读取到的字节数
        long beginTime = System.currentTimeMillis();
        while ((len = bis.read(buff)) != -1) {
            bos.write(buff, 0, len);  //将读取到的字节数组写入缓冲输出流
        }
        long endTime = System.currentTimeMillis(); //获取当前时间，单位毫秒，毫秒
        System.out.println("花费时间为："+(endTime-beginTime) +"毫秒");
        bis.close();
        bos.close();
    }
}
