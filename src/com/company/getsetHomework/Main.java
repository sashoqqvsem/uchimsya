package com.company.getsetHomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Поочередно введите Имя, возраст, мощность первого робота");
        Robot robot = new Robot(reader.readLine(),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));
        System.out.println("Поочередно введите Имя, возраст, мощность второго робота");
        Robot anotherrobot = new Robot(reader.readLine(),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()));
        System.out.println("Раунд 1");
        if(robot.fight(anotherrobot)){
            System.out.println("В первом бою победил первый");
        }else{
            System.out.println("В первом бою победил второй");
        }
        System.out.println("Раунд 2");
        if(anotherrobot.fight(robot)){
            System.out.println("Во втором бою победил второй");
        }else{
            System.out.println("Во втором бою победил первый");
        }
    }
}