package com.company.whilefor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        while(i<100){
            i++;
            System.out.println(i);
        }
    }
}
