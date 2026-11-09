package exam9m;
//编写一个Java程序，定义一个Student类，包含name（姓名）和score（成绩）两个私有属性，并提供相应的getter/setter方法以及一个有参构造方法。
// 然后在main方法中创建一个Student数组，存储5名学生的信息，遍历数组找出成绩最高的学生并输出其姓名和成绩。
public class forarr_max_and_min {
    public static void main(String[] args) {
        Student1[] s1 = new Student1[5];
        s1[0]=new Student1("11",99);
        s1[1]=new Student1("22",88);
        s1[2]=new Student1("33",77);
        s1[3]=new Student1("44",66);
        s1[4]=new Student1("55",55);
        int max=0;
        for (int i = 0; i <=4; i++) {
            if (s1[i].getScore()>max){
                max=s1[i].getScore();
                System.out.println("遍历出来成绩最高的学生是："+s1[i].getName()+"成绩是："+s1[i].getScore());
            }
        }
    }
}
class Student1{
    private String name;
    private int score;

    public Student1(String name ,int score){
        this.name=name;
        this.score=score;
    }

    public int getScore() {
        return score;
    }
    public int setScore() {
        return score;
    }
    public String getName(){
        return name;
    }
    public String setName(){
        return name;
    }
}