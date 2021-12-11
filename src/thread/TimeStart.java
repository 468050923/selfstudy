package thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeStart {
    public static void main(String[] args) throws ParseException, InterruptedException {
        Timer timer = new Timer(true);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse("2021-07-10 18:30:50");
        timer.schedule(new Copy(),parse,1000);

        for (int i = 0; i < 10; i++) {
            System.out.println("用户线程");
            Thread.sleep(1000);
        }
    }
}


class Copy extends TimerTask {

    @Override
    public void run() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format+"备份成功");
    }
}