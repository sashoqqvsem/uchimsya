package com.company.getsethomework2;

public class Fish {
    private String name;
    private int age;
    private Woman owner;

    public Fish(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void setOwner(Woman owner){
        this.owner=owner;
    }
    public Woman getOwner(){
        return this.owner;
    }
}
