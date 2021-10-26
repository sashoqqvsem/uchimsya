package com.company.getsethomework2;

import com.company.getsetHomework.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Woman woman = new Woman("Olya",43);
        Cat cat = new Cat("Masya",5);
        cat.setOwner(woman);
        System.out.println("Хозяйка кота " + cat.getOwner());
        Dog dog = new Dog("Anchar",4);
        dog.setOwner(woman);
        System.out.println("Хозяйка собаки " + dog.getOwner());
        Fish fish = new Fish("Nemo",3);
        fish.setOwner(woman);
        System.out.println("Хозяйка кота " + fish.getOwner());
    }

}

