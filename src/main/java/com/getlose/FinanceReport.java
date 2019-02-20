package com.getlose;

public class FinanceReport implements Report{

    @Override
    public void load() {
        System.out.println("finance loading data");
    }

    @Override
    public void print() {
        System.out.println("finace print data");
    }

}
