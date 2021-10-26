package com.company.ifelse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        first();
        second();
        third();
        four();
        five();
    }
    public static void first() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 2 числа для сравнения");
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        max(num1,num2);
    }
    public static void second() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 числа для нахождения минимального среди них");
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());
        min(num3,num4,num5);
    }
    public static void third() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 числа для нахождения среднего среди них");
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());
        srednee(num3,num4,num5);
    }
    public static void four() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число для сравнения с 5");
        int num = Integer.parseInt(reader.readLine());
        compare(num);
    }
    public static void five() throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число для сравнения преображения");
        int num = Integer.parseInt(reader.readLine());
        reloading(num);
    }
    public static void max(int num1,int num2) {
        if (num1 > num2) {
            System.out.println("max = " + num1);
        } else if (num2 > num1) {
            System.out.println("max = " + num2);
        } else{
            System.out.println("num1 == num2");
        }
    }
    public static void min(int num3,int num4,int num5){
        if(num3<num4 && num3<num5){
            System.out.println("min = "+num3);
        }else if(num3==num4 && num3<5){
            System.out.println("min = "+num3);
        }else if(num3==num5 && num3<4){
            System.out.println("min = "+num3);
        }else if(num4<num3 && num4<num5){
            System.out.println("min = "+num4);
        }else if(num5<num3 && num5<num4){
            System.out.println("min = "+num5);
        }
    }
    public static void srednee(int num3,int num4,int num5){
        if((num3<num4 && num3>num5)||(num3>num4&&num3<5)){
            System.out.println("среднее = "+num3);
        }else if((num4<num3 && num4>num5)||(num4>num3 && num4<num5)){
            System.out.println("среднее = "+num4);
        }else if((num5<num3 && num5>num4)||(num5>num3 && num5<num4)){
            System.out.println("среднее = "+num5);
        }else{
            System.out.println("Невозможно найти среднее,т.к какие то из чисел равны");
        }
    }
    public static void compare(int num){
        if (num>5) {
            System.out.println("Число больше 5");
        }else if(num<5){
            System.out.println("Число меньше 5");
        }else{
            System.out.println("Число = 5");
        }
    }
    public static void reloading(int num){
        int res=0;
        if (num<0){
            System.out.println("Число отрицательное, прибавляем 10");
            res=num+10;
        }else if(num>=0){
            res=num*2;
            System.out.println("Число положительное, умножаем на 2");
        }
        System.out.println("Число после преобразования = "+ res);
    }

}

