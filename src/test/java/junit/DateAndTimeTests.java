package junit;

import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeTests {

    @Test
    public void dateTest() {
        Date date1 = new Date();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date(System.currentTimeMillis());
        System.out.println(String.format("First date is %s, and second date is %s",date1, date2));
    }

    @Test
    public void secondDAteTest(){
        Date currentDate = new Date();
        System.out.println(currentDate);

        long currentTime = currentDate.getTime();
        long oneWeekFRomNow = currentTime + (7*24*60*60*1000);
        Date oneWeekFromNowDate = new Date(oneWeekFRomNow);
        System.out.println("One week from now is "+oneWeekFromNowDate);
        Assert.assertTrue(currentDate.before(oneWeekFromNowDate));
        Assert.assertTrue(oneWeekFromNowDate.after(currentDate));

        long andreeasBirthdayTime = currentTime + (10*24*60*60*1000);
        Date andreeasBirthdayDate = new Date(andreeasBirthdayTime);
        System.out.println(andreeasBirthdayDate);
    }

    @Test
    public void simpleadteFormatTest(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd,MMM,yyyy HH:mm");
        System.out.println(simpleDateFormat.format(date));
    }
}
