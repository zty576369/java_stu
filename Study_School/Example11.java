package Study_School;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example11 {
    public static void main(String[] args) throws IOException {
        //file input stream对文件进行读取操作,使用new关键字进行操作
        FileInputStream fis = new FileInputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/test.txt");
        int b=0;
        //fileinputstream.read()一次读取1个字节，返回的是这个字节所对应的ascll值
        while((b=fis.read())!=-1){
            System.out.print((char)b);
        }
        fis.close();
    }
}
