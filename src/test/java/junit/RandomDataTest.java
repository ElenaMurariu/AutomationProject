package junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RandomDataTest {


    @Test
    public void doubleRandomTest() {
        double ramdomvalue = Math.random();
        Assert.assertTrue(ramdomvalue > 0.0d && ramdomvalue < 1.0);
        System.out.println(ramdomvalue);
    }

    @Test
    public void integerRandomTest() {
        Random random = new Random();
        int randomInt = random.nextInt();
        Assert.assertTrue(randomInt >= Integer.MIN_VALUE && randomInt <= Integer.MAX_VALUE);
        System.out.println(randomInt);
    }

    @Test
    public void booleanRandomTest() {
        Random random = new Random();
        int numberoftrue = 0;
        int numberoffalse = 0;
        for (int i = 0; i < 1000; i++) {
            boolean randomBoolean = random.nextBoolean();
            if (randomBoolean) {
                numberoftrue++;
            } else {
                numberoffalse++;
            }
        }
        System.out.println(String.format("Generated nr of TRUE = %s and nr of FALSE = %s", numberoftrue, numberoffalse));
        Assert.assertEquals(1000, numberoffalse + numberoftrue);
    }

    @Test
    public void rangeRandomTest() {
        Random random = new Random();
        int randomInt = random.nextInt(89);
        Assert.assertTrue(randomInt <= 89 && randomInt >= 0);
        int minvalue = 10;
        int maxvalue = 60;

        int randomIntegerWithBounds = random.nextInt(maxvalue - minvalue + 1) + minvalue;
        System.out.println(randomIntegerWithBounds);
        Assert.assertTrue(randomIntegerWithBounds <= maxvalue && randomIntegerWithBounds > minvalue);
    }
}
