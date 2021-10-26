package com.company.lesson02;

public class User {
    private int age;
    private String name;
    private String document;

    public User(int i, String kolya){
        this.age = age;
        this.name = name;
    }
    public User(int age, String name, String document){
        this.age = age;
        this.name = name;
        this.document = document;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAge(int age)
    {
      this.age = age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void talkabout(String str)
    {
        System.out.println(str);
    }
}
