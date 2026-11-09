package review_school;
//方法重载，一个方法可以有多个实现，但是方法名必须相同，参数列表不同
public class demo03 {
    public static int add01(int x,int y){
        return x+y;
    }

    public static int add02(int x,int y,int z){
        return x+y+z;
    }

    public static double add03(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(add01(1,2));
        System.out.println(add02(1,2,3));
        System.out.println(add03(1.1,2.2));

        //方法的递归
        System.out.println("------------");
        int sum=getsum(5);
        System.out.println(sum);

        //方法构造
        Person person = new Person();
        Person1 person1 = new Person1(18);
    }

    //方法的递归
    public static int getsum(int n){
        if(n==1){
            return 1;
        }
        int digui=getsum(n-1);
        return n+digui;
    }

    //构造方法的定义
    static class Person{
        public Person(){
            System.out.println("无参构造");
        }
    }
    static class Person1{
        public Person1(int age){
            System.out.println("有参构造"+age);
        }
        int age=10;
    }
}
