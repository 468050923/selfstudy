package thread;

public class Sleep {
    public static void main(String[] args)  {
        Thread thread = new Thread(new Example());
        thread.setName("t");
        thread.start();

        try {
            Thread.sleep(5*100);
            System.out.println("122");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();  //5秒后终止执行
    }
}


class Example implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000*60*60*24);
        } catch (InterruptedException e) {
        }
    }
}