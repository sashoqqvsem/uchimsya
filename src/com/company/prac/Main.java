package com.company.prac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User[] userrepository = new User[10];
        int num;
        int flag = 0;
        while(flag ==0){
            System.out.println("Меню: " +
                    "1 - добавить пользователя;  " +
                    "2 - вывести пользователя по Id;  " +
                    "3 - выход;");
            switch (Integer.parseInt(reader.readLine())){
                case 1: User user1=adduser();
                        addusertorep(user1,userrepository);
                        break;
                case 2: System.out.println("Введите id пользователя которого хотите вывести");
                        num = Integer.parseInt(reader.readLine());
                        checkusers(num,userrepository);
                        break;
                case 3: flag = 1;
            }
        }
    }
    public static User adduser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int id;
        int age;
        String name;
        String secondname;
        System.out.println("Введите id нового пользователя");
        id=Integer.parseInt(reader.readLine());
        System.out.println("Введите возраст нового пользователя");
        age=Integer.parseInt(reader.readLine());
        System.out.println("Введите Имя нового пользователя");
        name=reader.readLine();
        System.out.println("Введите Фамилию нового пользователя");
        secondname=reader.readLine();
        User user = new User(id, age,name,secondname);
        return user;
    }
    public static void addusertorep(User user, User[] userrepository) throws IOException {
        userrepository[user.id]=user;
    }
    public static void checkusers(int num,User[] userrepository){
        System.out.println(userrepository[num].id+", "+userrepository[num].age+", "+userrepository[num].name+", "+userrepository[num].secondname+";");
    }
}
