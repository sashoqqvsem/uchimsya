package com.company.vvod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
        public static void main(String[] args) throws IOException {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

            String name = reader.readLine();
            String summa = reader.readLine();
            String years = reader.readLine();
            System.out.println(name +" будет зарабатывать "+summa+"$ в час через "+years+" лет");
        }

}
