public class WindInstrument extends Instrument{

    @Override
    void play() {
        System.out.println("Wind instrument playing...");
    }

    public WindInstrument(String name, int price){
        super.name = name;
        super.price = price;
    }
}
