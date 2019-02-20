package com.getlose;

public class HealthReport implements Report{

    @Override
    public void load() {
        System.out.println("health loading data");
    }

    @Override
    public void print() {
        System.out.println("health print data");
    }
}
