package e2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class NumberFilterTest {
    private NumberFilter filter = new NumberFilter();
    private List<Integer> numbers = Arrays.asList(
            12,47,654,5145,311,20,98,10,27);



    @Test
    void getEven() {
        Predicate<Integer> condition = name -> name % 2 == 0;
        List<Integer>filtred = filter.filter(numbers, condition);
        List<Integer>expected = Arrays.asList(12,654,20,98,10);
        Assertions.assertEquals(expected, filtred);
        System.out.println(filtred);
    }

    @Test
    void getOdd() {
        Predicate<Integer> condition = name -> name % 2 != 0;
        List<Integer>filtred = filter.filter(numbers, condition);
        List<Integer>expected = Arrays.asList(47,5145,311,27);
        Assertions.assertEquals(expected, filtred);
        System.out.println(filtred);
    }
}