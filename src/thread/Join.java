package thread;

public class Join {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Run());
        thread.start();


        for (int i = 0; i < 1000; i++) {
            System.out.println("主线线程"+i);
        }

        thread.join();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线线程1"+i);
        }

    }
}

class Run implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("支线线程:"+i);
        }
    }
}
