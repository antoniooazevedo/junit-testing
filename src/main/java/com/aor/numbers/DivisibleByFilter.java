package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    Integer n;
    DivisibleByFilter(Integer number){
        n = number;
    }

    public boolean accept(Integer number) throws ArithmeticException{
        try {
            return (number % n == 0);
        }
        catch (ArithmeticException exception){
            return false;
        }
    }
}
