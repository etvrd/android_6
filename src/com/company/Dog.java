package com.company;

public class Dog extends Animal {

    public Dog() {

    }

    @Override
    public void run(int run) {
        if (run > 500)
            System.out.print(" не может пробежать больше 500 м,");
        else
            super.run(run);
    }

    @Override
    public void swim(int swim) {
        if (swim > 10)
            System.out.println(" проплыть больше 10 м. не может.");
        else
            super.swim(swim);

    }

}