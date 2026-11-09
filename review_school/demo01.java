package review_school;

public class demo01 {
    public static void main(String[] args) {
        System.out.println("这是第一个java程序");
        byte b=3;
        short s=4;
        char c=5;
        //将byte，short，char类型数值相加，再赋给byte类型
        byte b2=(byte)(b+s+c);
        System.out.println("b2="+b2);

        //变量的作用域
        int x=12;{
            int y=96;
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
        System.out.println("x="+x);
        System.out.println("···········if分支语句···············");
        int age=17;
        if(age<18){
            System.out.println("此人是未成年人");
        }
        System.out.println("``````````if,else`````````````");
        int num=19;
        if(num%2==0){
            System.out.println(num+"是一个整数");
        }
        else{
            System.out.println(num+"是一个奇数");
        }
        System.out.println("``````````多分支结构案例············");
        int grade=75;
        if(grade>80){
            System.out.println("该成绩为优");
        } else if (grade>70) {
            System.out.println("该成绩为良");
        }else{
            System.out.println("该成绩一般");
        }
        System.out.println("·············switch语句案例··················");
        int month=5;
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("cold");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("hot");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
        }

    }
}
