package review_school;
//接口：[修饰符] class 类名 [extends 父类名] [implements 接口1,2,3...]
public class demo07 {
    public static void main(String[] args) {
        System.out.println(Animal3.getId());//通过接口名调用类方法
        Dog3 dog = new Dog3();
        System.out.println(dog.Id);//在实现类中获取接口全局常量
        dog.breathe();
        //通过接口实现类Dog的实例化对象，调用接口默认方法
        dog.getType("犬科");
    }
}
interface Animal3{
    int Id=1;//定义全局常量
    void breathe(); //定义抽象方法
    //定义一个默认方法
    default void getType(String type){
        System.out.println("该动物属于"+type);
    }
    //定义一个静态方法
    static int getId(){  //static属于接口本身，只能 接口名.方法()调用
        return Animal3.Id;
    }
}
//Dog实现了animal接口
class Dog3 implements Animal3{
    public void breathe(){
        System.out.println("狗在呼吸");
    }
}
