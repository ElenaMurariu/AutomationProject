package junit;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class JunitassertTests {


    @Test
    public void assertUsingHamcrestMatchersTest() {

        assertThat(1 + 1, is(2));
        assertThat(false, is(false));
        assertThat("err", false, equalTo(false));
        assertThat(2, is(2));

        String[] list1 = {"a", "b", "c", "d", "e"};
        String[] list2 = {"b", "a", "d", "e", "c"};
        Arrays.sort(list2);
        assertThat(list1, equalTo(list2));
        assertThat("Empty string is not null", "", is(not(nullValue())));
        assertThat("Only null is null", null, is(nullValue()));
        assertThat(null, nullValue());
        assertThat("abc".contains("x"), is(false));

    }

    @Test
    public void assertUsingHamcrestListMatchersTest() {
        List<Integer> list = Arrays.asList(10, 20, 30);

        assertThat("The list does not have the expected size", list, hasSize(3));
        assertThat("The list does not have the expected value", list, hasItem(10));
        assertThat("The list does not contain expected values", list, contains(10, 20, 30));
        assertThat("The list does not contain specified elements", list, containsInAnyOrder(10, 30, 20));
        assertThat("The contains elements smaller than expected value", list, everyItem(greaterThan(2)));
        assertThat("The size of the list is not less than expected value", list, hasSize(lessThan(4)));
    }

}
