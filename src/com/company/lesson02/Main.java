package com.company.lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User user1 = new User(19,"Alexandr","3415 172055");
        System.out.println(user1.getName());
        user1.setAge(Integer.parseInt(reader.readLine()));
        System.out.println(user1.getAge());
        User user2 = new User(20, "Vlad","7777 777777");
        System.out.println(user2.getAge());

        User user3 = new User(12, "Kolya");
        System.out.println(user3.getName());

        user1.talkabout("Vsem privet");
        user2.talkabout("I tebe privet");
    }

}



