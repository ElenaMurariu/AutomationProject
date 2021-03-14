package junit;

import org.junit.Test;

public class ExceptionClass {

    @Test
    public void nullPointerException() {
        try {
            Integer x = null;
            String age = x.toString();
            String showAge = "You are " + age + " years old";
            System.out.println(showAge);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exeption catch");
            e.getStackTrace();
            String y =e.getMessage();
            System.out.println(y);
        }
    }
}
