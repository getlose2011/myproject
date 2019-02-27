package com.getlose.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {

    public static void main(String[] args) {
        try {
            URL url = url = new URL("https://api.myjson.com/bins/1ftany");
            HttpURLConnection connection =(HttpURLConnection) url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = in.readLine();
            StringBuffer sb = new StringBuffer();
            while(line !=null){
                System.out.println(line);
                sb.append(line);
                line = in.readLine();
            }
            System.out.println(sb.toString());
        }catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
