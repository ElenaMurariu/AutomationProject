package junit;

import org.junit.Test;

import java.util.Arrays;

public class ArraysTests {

    @Test
    public void sortDesc() {
        int num = 59843;
        String number = Integer.toString(num);
        int[] nrArray = new int[number.length()];
        int x;
        for (int i = 0; i < number.length(); i++) {
            x = Character.getNumericValue(number.charAt(i));
            nrArray[i] = x;
        }
        String y;
        String word = "";
        Arrays.sort(nrArray);
        for (int j = nrArray.length - 1; j >= 0; j--) {
            y = Integer.toString(nrArray[j]);
            word = word.concat(y);
        }
        int decendentnumber;
        decendentnumber = Integer.parseInt(word);
        System.out.println(decendentnumber);
    }

    @Test
    public void camelcase() {
        String str = "say hello ";
        str = str.trim();
        Character a;
        String word = "";
        if (str.length() > 0) {
            String[] array = new String[str.length()];
            for (int i = 0; i < str.length(); i++) {
                a = str.charAt(i);
                if (a != ' ')
                    array[i] = a.toString();
                else {
                    while (a == ' ') {
                        array[i] = a.toString();
                        i++;
                        a = str.charAt(i);
                    }
                    array[i] = a.toString().toUpperCase();
                }
            }
            if (!array[0].contentEquals(" "))
                word = word.concat(array[0].toUpperCase());
            for (int i = 1; i < array.length; i++) {
                if (!array[i].contentEquals(" ")) word = word.concat(array[i]);
            }
        }
        System.out.println(word);
    }

    @Test
    public void createPhoneNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String number = "(";
        for (int i = 0; i < array.length; i++) {
            number = number + array[i];
            if (i == 2) number = number.concat(") ");
            if (i == 5) number = number.concat("-");
        }
        System.out.println(number);
    }

    @Test
    public void time() {
        int seconds = 86399;
        int HH = seconds / 3600;
        int MM = (seconds % 3600) / 60;
        int SS = (((seconds % 3600) % 60));
        String ret = String.format("%02d:%02d:%02d", HH, MM, SS);
        System.out.println(ret);
    }

}
