package com.getlose.student;

public class Students {
    //屬性，字串沒給值預設為null，int沒給值預設為0
    String id;
    String name;
    int english;
    int math;

    public Students(String name, int english, int math){
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print(){
        System.out.println(name+"\t"+english+"\t"+math);
    }

}
