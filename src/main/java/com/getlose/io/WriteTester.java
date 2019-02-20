package com.getlose.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException{
        //File jkdir = new File("d:\\test");
        //jkdir.mkdir();
        //FileWriter fw = new FileWriter("d:\\test\\output.txt");
        FileWriter fw = new FileWriter("output.txt");
        fw.write("ddddd");
        fw.flush();
        fw.close();
    }
}
