package org.example;

public class StringInstrument extends Instrument{
    @Override
    void play() {
        System.out.println("String instrument playing...");
    }

    public StringInstrument(String name, int price){
        super.name = name;
        super.price = price;
    }
}