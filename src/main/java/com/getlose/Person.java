package com.getlose;

public class Person{
    String name;
    float weight;
    float height;

   //如果沒有設計建構子時預設會有下面的建構子
   //public Person(){
   //   super();
   //}

    public Person(float weight, float height){
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, float weight, float height){
        this(weight,height);//呼叫其它建構子要放在第一行
        this.name = name;
    }

    public void hello(){
        System.out.println("hello world");
    }
    public float Bmi(){
        return weight/height*height;
    }
}
