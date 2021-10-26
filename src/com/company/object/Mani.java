package com.company.object;

import com.company.lesson02.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Mani {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Human ded1 = new Human("Sasha",true,75);
        Human baba1 = new Human("Yulya",false,73);
        Human ded2 = new Human("Timur",true,86);
        Human baba2 = new Human("Anya",false, 83);
        Human papa = new Human("Artem",true,50,baba1,ded1);
        Human mama = new Human("Nastya",false,46,baba2,ded2);
        Human sin = new Human("Lesha",true,26,mama,papa);
        Human doch = new Human("Olya",false,24,mama,papa);
        System.out.println(ded1.toString());
        System.out.println(baba1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba2.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(sin.toString());
        System.out.println(doch.toString());
    }
}
