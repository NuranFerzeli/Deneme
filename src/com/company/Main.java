package com.company;

import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
       // File f = new File("D:\\Iran Baza\\Iran Baza_split\\1_split\\1000.json");
        File f = new File("1000.json");
        FileReader fileReader = new FileReader(f);
        BufferedReader reader = new BufferedReader(fileReader);
        List<String> s = new ArrayList<>();
        int k = 0;
        while (reader.read() != -1) {
            k++;
            if (k < 1000) {
                String fade= reader.readLine();
                s.add(fade);
            } else {
                break;
            }
        }
        System.out.println(s.size());
        for(String ss:s){
            int i=ss.indexOf("first_name");
             int i1=ss.indexOf("phone");
             i1=i1+24;
            if(i>-1){
                String aa=ss.substring(i,i1);
                System.out.println(aa);
            }
        }
        }
    }


