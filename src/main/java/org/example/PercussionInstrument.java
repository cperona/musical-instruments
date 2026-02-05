package org.example;

public class PercussionInstrument extends Instrument{
    @Override
    void play() {
        System.out.println("Percussion instrument playing...");
    }

    public PercussionInstrument(String name, int price){
        super.name = name;
        super.price = price;
    }
}
