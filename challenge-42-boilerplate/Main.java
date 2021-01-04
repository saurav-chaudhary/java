import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        LinkedListImp lb = new LinkedListImp();
        LinkedList<Word> word = lb.inserData();
       
       LinkedList<Word> ocur= lb.noOfwordsOcur(word);
        lb.sortAlpha(ocur);
        Collections.reverse(ocur);
       lb.display(word);
       
    }
}
