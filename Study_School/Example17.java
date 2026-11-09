package Study_School;

import java.io.File;
import java.util.Arrays;

public class Example17 {
    public static void main(String[] args) {
//        File file=new File("E:/java_example/IdeaProjects/java_st/src/Study_School/Example17.java");
//        System.out.println("文件名："+file.getName());
//        System.out.println("文件路径："+file.getPath());
//        System.out.println("文件是否存在："+file.exists());
//        System.out.println("文件绝对路径："+file.getAbsolutePath());
//        System.out.println(file.isDirectory()?"是一个目录":"是一个文件");

        //遍历目录下的文件
        File file=new File("E:/java_example/IdeaProjects/java_st/src/Study_School");
        if(file.isDirectory()){
            String[] fileList = file.list();
            //遍历获取目录下的每一个文件名称
            Arrays.stream(fileList).forEach(System.out::println);
        }
    }
}
