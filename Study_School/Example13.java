package Study_School;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example13 {
    public static void main(String[] args) throws IOException {
        //1.创建输入流对象
        FileInputStream fis = new FileInputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/1.jpg");
        //2.创建输出流对象
        FileOutputStream fos = new FileOutputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/2.jpg");
        //3.往指定位置输出数据
        int len=0;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }
        //4.关闭流
        fis.close();
        fos.close();
    }
}
