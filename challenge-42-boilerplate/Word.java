public class Word
{
    

	String word;
    int noOfOcur;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNoOfOcur() {
        return noOfOcur;
    }

    public void setNoOfOcur(int noOfOcur) {
        this.noOfOcur = noOfOcur;
    }

    @Override
    public String toString() {
        return "Word [noOfOcur=" + noOfOcur + ", word=" + word + "]\n";
    }
}