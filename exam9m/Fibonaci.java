package exam9m;
//4.使用递归方法计算斐波那契数列（Fibonacci）的第n项，其中斐波那契数列定义为：F(1)=1，F(2)=1，F(n)=F(n-1)+F(n-2)（n>2）。要求：
// (1) 使用递归实现fibonacci方法；
// (2) 在main方法中输出斐波那契数列前20项；
// (3) 简述该递归算法的时间复杂度，并说明如何优化可以降低时间复杂度。
public class Fibonaci {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(getf(i));
        }
    }
    public static int getf(int n){
        if(n==1||n==2){
            return 1;
        }
        return getf(n-1)+getf(n-2);
    }
}


