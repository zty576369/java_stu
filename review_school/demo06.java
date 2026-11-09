package review_school;

public class demo06 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
        dog.printname();
    }
}
class Animal2{
void shout(){
    System.out.println("动物在叫");
    }
}

class Dog extends Animal2{
    String name="父类";
    void shout(){
        super.shout();
        System.out.println("狗在叫");
    }
    void printname(){
        System.out.println(name);
    }
}