public class Main {
    public static void main(String[] args) {
        Instrument w = new WindInstrument("Wind1", 100);
        w.play();

        Instrument s = new StringInstrument("String1", 200);
        s.play();

        Instrument p = new PercussionInstrument("Percussion1", 60);
        p.play();
    }
}
