package com.company.ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваш возраст");
        String ageuser = reader.readLine();
        if(Integer.parseInt(ageuser)>=18){
            dontdothis();
        }else if(Integer.parseInt(ageuser)<=0 ){
            System.out.println("Такого не может быть");
        }else{
            dothis();
        }
    }
    public static void dontdothis(){
        System.out.println("Тебе доступен контент");
    }
    public static void dothis(){
        System.out.println("Доступ запрещен");
    }
}
