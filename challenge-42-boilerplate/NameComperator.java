
import java.util.Comparator;

public class NameComperator implements Comparator<Word> {

    @Override
    public int compare(Word o1, Word o2) {
        // TODO Auto-generated method stub
       
        return (o1.word.compareTo(o2.word));
    }


}
