package Verification;

public class CapitalVerifier extends WordVerifier {


    public CapitalVerifier(Word w) {
        super(w);
    }


    @Override
    public boolean verify() {
        return w.verify() && w.getWord().matches("(.*)[A-Z]+(.*)");
    }
}
