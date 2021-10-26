package com.company.object;

public class Human {
    private String name;
    private boolean sex;
    private int age;
    private Human mother;
    private Human father;

    public Human (String name, boolean sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Human (String name, boolean sex,int age,Human mother,Human father){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        String sex1 =" ";
        if (sex==true){
            sex1="Мужской";
        } else {sex1="Женский";}
        return "Human{" +
                "Имя='" + name + '\'' +
                ", Пол=" + sex1 +
                ", Возраст=" + age +
                ((mother!=null)?", Мама=" + mother.name: " ") +
                ((father!=null)?", Папа=" + father.name: " ") +
                '}';
    }
}
