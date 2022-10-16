package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    Integer n;
    DivisibleByFilter(Integer number){
        n = number;
    }

    public boolean accept(Integer number){
        return (number % n == 0);
    }
}
