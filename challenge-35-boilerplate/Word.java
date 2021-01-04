public class Word {
    public String word;
    public int ocurrence;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getOcurrence() {
        return ocurrence;
    }

    public void setOcurrence(int ocurrence) {
        this.ocurrence = ocurrence;
    }

    @Override
    public String toString() {
        return "Word [ocurrence=" + ocurrence + ", word=" + word + "]";
    }
    

}
