package School_Thread;

public class Waiter implements Runnable{
    private String waiterName;
    private String drinkName;



    //构造方法，服务名字+饮料名称
    public Waiter(String waiterName,String drinkName){
        this.waiterName=waiterName;
        this.drinkName=drinkName;

        System.out.println(waiterName+drinkName);
    }

    public void work(){
        System.out.println("通知服务员"+this.waiterName+"为"+this.drinkName+"服务完成");
        Thread thread = null;
        if(thread==null){
            thread=new Thread(this.waiterName);
            thread.start();
        }
    }

    @Override
    public void run() {
        System.out.println("服务"+this.waiterName+"为"+this.drinkName);
        for (int i = 0; i < 4; i++) {
            System.out.println(this.waiterName+"为"+this.drinkName+"服务"+i+"次");
            //模拟耗时
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Waiter waiter = new Waiter("服务员1","饮料1");
        waiter.work();

        Waiter waiter1 = new Waiter("服务员2","饮料2");
        waiter1.work();
    }
}
