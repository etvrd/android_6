package com.company;

public abstract class Animal {

    public Animal() {
    }

    public void name(String name){
        System.out.print(name);
    };

    public void run(int run){
        System.out.print(" пробежал(а) " + run + " м,");
    };

    public void swim(int swim){
        System.out.println(" и проплыл(а) " + swim + " м,");
    };
}
