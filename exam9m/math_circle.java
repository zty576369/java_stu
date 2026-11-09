package exam9m;
//3.编写一个Java程序，实现一个Circle类，包含私有属性radius（半径），提供有参构造方法和计算面积的方法getArea()。
// 再定义一个测试类，创建一个半径为5的圆对象，输出其面积（面积公式：π×r²，π取3.14）。
public class math_circle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
    }
}
class Circle{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        double s=0;
        s=3.14*radius*radius;
        return s;
    }
}
