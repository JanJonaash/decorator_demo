package Verification;

public class LowerVerifier extends WordVerifier{
    public LowerVerifier(Word w) {
        super(w);
    }

    @Override
    public boolean verify() {
        return w.verify() && w.getWord().matches("(.*)[a-z]+(.*)");
    }
}
