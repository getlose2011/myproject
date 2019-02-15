package com.getlose.student;

public class GraduateStudent extends Students{
    int thesis;
    static int pass = 70;
    public GraduateStudent(String name, int english, int math, int thesis){
        super(name,english,math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        //super.print();
        char grading = 'F';
        System.out.print(name+"\t"+english+"\t"+math+"\t"+thesis);
        System.out.print("\t"+(getAverage()<pass?"fail":"pass"));
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
}
