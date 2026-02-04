public class Main {
    public static void main(String[] args) {
        Instrument w = new WindInstrument();
        w.play();

        Instrument s = new StringInstrument();
        s.play();

        Instrument p = new PercussionInstrument();
        p.play();
    }
}
