package Thread;

public class ThreadTest2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread6 t = new MyThread6();
        t.start(); //// 启动
        Thread.sleep(1000); //暂停一毫秒
        t.isInterrupted(); // 中断t程序
        t.join(); //等待t程序结束
        System.out.println("end");

    }
}

class MyThread6 extends Thread{
    public void run(){
        int n = 0;
        while (! isInterrupted()){
            n++;
            System.out.println(n + "hello");
        }
    }

}