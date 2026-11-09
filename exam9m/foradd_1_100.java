package exam9m;
//编写一个Java程序，使用for循环计算1到100之间所有整数之和，并输出结果。
public class foradd_1_100 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
