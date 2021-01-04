import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class example {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br= new BufferedReader(new FileReader("data/daffodils.txt")))
        {
            String line=null;
            String[] words=null;
            SingleLinkedList sl= new SingleLinkedList();
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
        }
    }

