package com.getlose.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        //map key不重覆,value
        HashMap<String,String> stock = new HashMap<>();
        stock.put("2330","台積電");
        stock.put("2002","中剛");
        stock.put("2330","TSMC");//會被蓋版
        System.out.println(stock);
        System.out.println(stock.get("2330"));

        for(String key:stock.keySet()){
            System.out.println(stock.get(key));
        }

        //set();
        //list();
        //arraytest();
    }

    private static void set() {
        //set=>不重覆性的，無排序
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(3);
        set.add(4);
        set.add(3);
        System.out.println(set);
        for (Integer n : set) {
            System.out.println(n);
        }
    }

    private static void list() {
        //collection
        //List 的特性 => 1.順序，2.索引值，3.可重覆性的
        ArrayList<Integer> list = new ArrayList();
        list.add(4);//Integer
        list.add(123);
        list.add(456);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());

        List<Integer> lists = Arrays.asList(2,3);
        for (Integer i : lists) {
            System.out.println(i);
        }
    }

    private static void arraytest() {
        int[] numbers = new int[5];
        numbers[0] = 12;
        numbers[4] = 88;

        int[] scores = {22,42,44,33};
        for (int score : scores) {
            System.out.println(score);
        }
    }
}
