package Study_School;

import jdk.jfr.Recording;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example12 {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/test.txt",true)) {
            //fileoutputstream.write()一次写入1个字节自定义输出数据
            //可以使用boolean.append来追加数据
           // fileOutputStream.write("hello world".getBytes());
            //下面是第二种写法
            String data="hello";
            fileOutputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //Recording作用：关闭流
            Recording fileOutputStream = null;
            fileOutputStream.close();
        }
        //关闭流
    }
}
