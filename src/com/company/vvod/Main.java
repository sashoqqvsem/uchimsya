package com.company.vvod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String vvod = reader.readLine();
        System.out.println(vvod);
        String i=reader.readLine();
        int num = Integer.parseInt(i);
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println(num);
        System.out.println(num1);
        System.out.println(sum(num,num1));
    }
    public static int sum(int number1, int number2)
    {
        int result = number1+number2;
        return result;
    }
}
