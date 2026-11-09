package Study_School;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example18 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile =
                new RandomAccessFile("E:/java_example/IdeaProjects/java_st/src/Study_School/test.txt","rw");
        int s = Integer.parseInt(randomAccessFile.readLine());
        //Integer.parseInt()方法将字符串转换为整数
        System.out.println(s);

        if(s>0){
            randomAccessFile.seek(0);//将文件指针定位到文件开头
            int s1=Integer.parseInt(randomAccessFile.readLine());
        }
    }
}
