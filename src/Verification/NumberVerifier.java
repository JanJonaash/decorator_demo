package Verification;

public class NumberVerifier extends WordVerifier{
    public NumberVerifier(Word w) {
        super(w);
    }

    @Override
    public boolean verify() {
        return w.verify() && w.getWord().matches("(.*)[0-9]+(.*)");
    }
}
