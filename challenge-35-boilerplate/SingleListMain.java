import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class SingleListMain {
    static SingleLinkedList readFile(String fileName) throws IOException
    {
        File file= new File(fileName);
        SingleLinkedList sl=null;
        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line=null;
            String[] words=null;
            sl= new SingleLinkedList();
            while((line=br.readLine())!=null)
            {
                line=line.toLowerCase().replaceAll("[,':;.?]","");
                words=line.split(" ");
                for(String word:words)
                {
                    sl.addWordNode(word);
                }
            }
        }catch(FileNotFoundException e){}
        catch(IOException e){}
        return sl;
        
    }
    public static void main(String[] args) throws IOException {
        SingleLinkedList list= readFile("data/daffodils.txt");
        // SingleLinkedList list2 = new SingleLinkedList();
         list.shorting();
         System.out.println("*****************frequent words********");

         list.showFrequentWords();
        list.traversal();
        
       
        
    }
}
