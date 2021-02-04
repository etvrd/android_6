package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int sCat = 0;
        Cat cat = new Cat();
        Dog dog = new Dog();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество животных: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int flag, run, swim;
            String name;
            System.out.println("Какое животное вы хотите ввести? 1 - кот, 2 - собака: ");
            flag = sc.nextInt();
            if (flag == 1 || flag == 2) {
                System.out.println("Введите имя: ");
                sc.nextLine();
                name = sc.nextLine();
                System.out.println("Введите дистанцию для бега: ");
                run = sc.nextInt();
                System.out.println("Введите дистанцию для плавания: ");
                swim = sc.nextInt();
                if (flag == 1) {
                    cat.name(name);
                    cat.run(run);
                    cat.swim(swim);
                    sCat++;
                } else {
                    dog.name(name);
                    dog.run(run);
                    dog.swim(swim);
                }
            } else
                i--;
        }
        System.out.println("Количество введенных котов: " + sCat);
        System.out.println("Количество введенных собак: " + (n-sCat));
        System.out.println("Общее количество введенных животных: " + n);
    }
}
