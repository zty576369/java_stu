package review_school;

public class demo05 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name="旺财";
        cat.printname();
    }
}

class Animal{
    String name;
    void shout(){
        System.out.println("动物在叫");
    }
}
class Cat extends Animal{
    public void printname(){
        System.out.println("猫"+name+"在叫");
    }
}