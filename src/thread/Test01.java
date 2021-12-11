package thread;

public class Test01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("当前是主线程---->"+i);
        }
    }
}



class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("当前是分支线程---->"+i);
        }
    }
}