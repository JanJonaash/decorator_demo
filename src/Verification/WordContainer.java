package Verification;

public class WordContainer implements Word{
    @Override
    public boolean verify() {
        return true;
    }


   private String text;
    public WordContainer(String text) {
        this.text = text;
    }

    @Override
    public String getWord() {
        return text;
    }
}
