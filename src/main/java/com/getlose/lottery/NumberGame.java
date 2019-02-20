package com.getlose.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    //Set(集合)：
    //
    //Set 是最簡單的一種集合。集合中的物件不按特定的方式排序，並且沒有重復物件。
    //
    //Set 介面主要實現了兩個實現類：
    //HashSet 按照哈希算法來存取集合中的物件，存取速度比較快。
    //TreeSet 實現了 SortedSet 介面，能夠對集合中的物件進行排序。
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    public abstract void generate();
    public boolean validate(){
        if(numberCount == numbers.size()){
            return true;
        }else{
            return false;
        }
    }
}
