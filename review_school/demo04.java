package review_school;
class Studeng{
    static String name;
}
public class demo04 {

    static{
        System.out.println("测试类的静态代码块");
    }
    public static void main(String[] args) {
        Studeng studeng = new Studeng();
        Studeng studeng1 = new Studeng();
        studeng.name="学生1";
        studeng1.name="学生2";
        System.out.println(studeng.name);
        System.out.println(studeng1.name);
    }
        Person3 person3 = new Person3();
        Person3 person4 = new Person3();
}
class Person3{
    static{
        System.out.println("类的静态代码块");
    }
}
