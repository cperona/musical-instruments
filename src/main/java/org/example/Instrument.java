package org.example;
public abstract class Instrument {
    public String name;
    public int price;

    static {
        System.out.println("Instruments playing: \n");
    }

    abstract void play();
}
