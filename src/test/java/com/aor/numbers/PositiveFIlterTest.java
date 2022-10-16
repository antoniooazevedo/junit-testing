package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositiveFIlterTest {
    private Integer n;

    @Test
    public void negative_number(){
        n = -872641982;
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertFalse(filter.accept(n));
    }

    @Test
    public void positive_number(){
        n = 872641982;
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertTrue(filter.accept(n));
    }

    @Test
    public void min_int_value(){
        n = Integer.MIN_VALUE;
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertFalse(filter.accept(n));
    }

    @Test
    public void max_int_value(){
        n = Integer.MAX_VALUE;
        PositiveFilter filter = new PositiveFilter();
        Assertions.assertTrue(filter.accept(n));
    }
}
