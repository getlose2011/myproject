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

    public int higher(){

        if(english > math){
            return english;
        }
        return (english > math)?english:math;
    }

    public void print(){
        char grading = 'F';
        System.out.print(name+"\t"+english+"\t"+math);
        System.out.println("\t"+(getAverage()<60?"fail":"pass"));
        //二個int相除不會有小數點
        switch(getAverage()/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("\t"+grading);
    }

    public int getAverage(){
        return (math+english)/2;
    }

}
