package Thread;

//多线程
public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();


    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("你好");
    }
}


class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("世界");
    }
}
