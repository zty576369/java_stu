package Study_School;

import java.io.*;

public class Example14 {
    public static void main(String[] args) throws FileNotFoundException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/1.jpg"))) {

            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:/java_example/IdeaProjects/java_st/src/Study_School/2.jpg"))) {
                int len = 0;
                while ((len = bis.read()) != -1) {
                    bos.write(len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
