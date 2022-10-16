package com.aor.numbers;

import com.aor.numbers.DivisibleByFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {

    @Test
    public void multiples_of_5(){
        DivisibleByFilter filter = new DivisibleByFilter(5);
        Integer i1 = 1102491455;
        Integer i2 = 1726278924;

        Assertions.assertTrue(filter.accept(i1));
        Assertions.assertFalse(filter.accept(i2));
    }
}
