package Verification;

public class WordVerifier implements Word {



    Word w;

    public WordVerifier(Word w) {
        this.w = w;
    }

    @Override
    public boolean verify() {

        return true;
    }

    @Override
    public String getWord() {
      return   w.getWord();
    }
}
