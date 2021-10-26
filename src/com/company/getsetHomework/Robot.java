package com.company.getsetHomework;

public class Robot {
    private String name;
    private int age;
    private int power;
    public Robot(String name,int age,int power){
        this.name=name;
        this.age=age;
        this.power=power;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPower(int power){
        this.power = power;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getPower(){
        return this.power;
    }
    public boolean fight(Robot robot){
        if (robot.getPower()<this.getPower()){
            return true;
        }else{
            return false;}
    }
}
