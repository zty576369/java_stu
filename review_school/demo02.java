package review_school;
//面向对象上:[修饰符]数据类型 变量名 [=值]
/*
* 对象创建的语法：类名 对象名称 =new 类名（）
* 调用：1.通过对象的引用来访问对象所有的成员：对象引用.对象成员
* 2.直接使用创建的对象本身来引用对象成员
* new 类名（）.对象成员
* */
public class demo02 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("ty");
        person.speak();
    }
}
class Person{
    private String name;
    private int age;
    //定义的两个类被设置为私有属性，无法直接进行访问，需要制作一个封装，从特定的窗口进行访问，这就是封装
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){//java的get和set方法，用于访问和修改私有属性的值
        return age;
    }
    public void setAge(int age){
        if(age<=0){
            System.out.println("输入的年龄不正确");
        }else{
            this.age=age;
        }
    }
    public void speak(){
        System.out.println(name+age);
    }
}
