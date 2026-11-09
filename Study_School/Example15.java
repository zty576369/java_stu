package Study_School;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example15 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/1.jpg");
        FileOutputStream out = new FileOutputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/2.jpg");
        int len = 0;
        byte[] buff = new byte[1024];
        long beginTime = System.currentTimeMillis();
             while ((len = in.read(buff)) != -1) {
                   out.write(buff,0,len);
             }
                 long endTime = System.currentTimeMillis();
                   System.out.println("花费时间为："+(endTime-beginTime) +"毫秒");

        in.close();
        out.close();
    }
}

