package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {

    private List<Integer> list;

    @Test
    public void even_numbers(){
        list = Arrays.asList(2,3,4,5,6,7,8,9,10);
        DivisibleByFilter filter = new DivisibleByFilter(2);
        ListFilterer filterer = new ListFilterer(filter);

        Assertions.assertEquals(Arrays.asList(2,4,6,8,10), filterer.filter(list));
    }

    @Test
    public void even_repeated_numbers(){
        list = Arrays.asList(2,2,3,4,5,5,7,9,6,6,7,6,8,9,2,3,10);
        DivisibleByFilter filter = new DivisibleByFilter(2);
        ListFilterer filterer = new ListFilterer(filter);

        Assertions.assertEquals(Arrays.asList(2,2,4,6,6,6,8,2,10), filterer.filter(list));
    }

    @Test
    public void positive_numbers(){
        list = Arrays.asList(-1,-4,5,27,-124874,128781489,0,-2,2,-2,3);
        PositiveFilter filter = new PositiveFilter();
        ListFilterer filterer = new ListFilterer(filter);

        Assertions.assertEquals(Arrays.asList(5,27,128781489,0,2,3), filterer.filter(list));
    }

    @Test
    public void positive_repeated_numbers(){
        list = Arrays.asList(-1,-4,5,27,-124874,128781489,0,-2,2,-2,3,-1,-4,5,27,-124874,128781489,0,-2,2,-2,3);
        PositiveFilter filter = new PositiveFilter();
        ListFilterer filterer = new ListFilterer(filter);

        Assertions.assertEquals(Arrays.asList(5,27,128781489,0,2,3,5,27,128781489,0,2,3), filterer.filter(list));
    }
}
