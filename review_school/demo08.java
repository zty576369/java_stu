package review_school;

public class demo08 {
    public static void main(String[] args) {
        Animal4 a4 = new Dog4();
        if (a4 instanceof Cat1) {//判断a4本质类型
            Cat1 cat1 = (Cat1) a4;
            cat1.shout();
            cat1.catchMouse();
        }else{
            System.out.println("该类型的对象不是cat类");
        }
    }


    interface Animal4 {
        void shout();//定义抽象方法
    }

    //定义cat实现animal接口
    class Cat1 implements Animal4 {
        //实现接口shout方法
        public void shout() {
            System.out.println("喵喵");
        }

        //定义cat类特有的抓老鼠方法
        public void catchMouse() {
            System.out.println("猫抓老鼠");
        }
    }

    //定义dog类实现animal接口
    static class Dog4 implements Animal4 {
        public void shout() {
            System.out.println("旺旺大叫");
        }
    }
}
