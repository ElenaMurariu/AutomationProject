package junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CollectionsTests {
    @Test
    public void simpleCollectionTest() {
        Collection<String> workingdays = new ArrayList<>();
        Collection<String> wholeweek = new ArrayList<>();
        workingdays.add("Monday");
        workingdays.add("Tuesday");
        workingdays.add("Wednesday");
        workingdays.add("Thursday");
        workingdays.add("Friday");

        Assert.assertEquals(5, workingdays.size());
        Assert.assertEquals(0, wholeweek.size());
        Assert.assertEquals(0, wholeweek.size());
        Assert.assertTrue(wholeweek.isEmpty());

        wholeweek.addAll(workingdays);
        Assert.assertEquals(5, wholeweek.size());
        wholeweek.add("Saturday");
        wholeweek.add("Sunday");
        Assert.assertEquals(7, wholeweek.size());


        wholeweek.remove("Sunday");
        ((ArrayList<String>) wholeweek).remove(5);
        Assert.assertEquals(5, wholeweek.size());

        for (int i = 0; i < workingdays.size(); i++) {
            System.out.println(((ArrayList<String>) workingdays).get(i) + " is the same as " + ((ArrayList<String>) wholeweek).get(i));
        }
    }

    @Test
    public void mapTest(){
        Map<Integer, String> carMakes = new HashMap<>();

        carMakes.put(1, "Audi");
        carMakes.put(2, "Mercedes");
        carMakes.put(3, "BMW");
        carMakes.put(4, "Tesla");
        carMakes.put(5, "Volksvagen");
        carMakes.put(6, "Hyunday");

        Assert.assertEquals(6, carMakes.size());
        Assert.assertTrue(carMakes.containsValue("Audi"));
        Assert.assertTrue(carMakes.containsKey(5));
        Assert.assertEquals("Tesla", carMakes.get(4));

        System.out.println("Iterating by using Map.Entry:\n");
        for (Map.Entry carEntry: carMakes.entrySet()) {
            System.out.println(carEntry.getKey()+" = "+carEntry.getValue());
        }

        System.out.println("-----");
        carMakes.remove(3);
        Assert.assertEquals(5, carMakes.size());

        System.out.println("Iterating by using iterator:\n");
        Iterator<Map.Entry<Integer, String>> iterator=carMakes.entrySet().iterator();


        do {Map.Entry<Integer,String> entrySet = iterator.next();
            System.out.println(entrySet.getKey()+" = "+ entrySet.getValue());
        }
        while (iterator.hasNext());

        carMakes.clear();
        Assert.assertTrue(carMakes.isEmpty());
        Assert.assertEquals(0, carMakes.size());

    }

}
