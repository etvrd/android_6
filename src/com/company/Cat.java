package com.company;

public class Cat extends Animal {

    public Cat() {

    }

    @Override
    public void run(int run) {
        if (run > 200)
            System.out.print(" не может пробежать больше 200 м,");
        else
            super.run(run);
    }

    @Override
    public void swim(int swim) {
        System.out.println(" плавать кот не умеет :(");

    }

}
