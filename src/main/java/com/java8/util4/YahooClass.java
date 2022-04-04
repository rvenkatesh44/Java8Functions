package com.java8.util4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class YahooClass {
    public static void main(String[] args) throws  Exception {

        URL url = new URL("https://ichart.yahoo.com/table.csv?s=" + "GOOG");
        URLConnection hc = url.openConnection();
        hc.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 4.10; rv:52.0) Gecko/20100101 Firefox/52.0");
        BufferedReader br = new BufferedReader(new InputStreamReader(hc.getInputStream()));
        try(br){
        br.readLine();
        //Read File Line By Line
        String strLine;
        while ((strLine = br.readLine()) != null) {
            System.out.println(strLine);
        }
        br.close();


        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
