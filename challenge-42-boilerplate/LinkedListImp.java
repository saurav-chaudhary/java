import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListImp {
    LinkedList<Word> li= new LinkedList<>();
    public LinkedList<Word> inserData() throws FileNotFoundException, IOException
    {
        try(BufferedReader br = new BufferedReader(new FileReader("data/daffodils.txt")))
        {
           
            String line=null;
            String[] arr=null;
            
            while((line=br.readLine())!=null)
            {
               
                line=line.toLowerCase().replaceAll("[,':;.?]","");
                arr=line.split(" ");
                for(int i=0;i<arr.length;i++)
                {
                System.out.println(arr[i]);
                }
                
                for(String word : arr)
                {
                    Word w= new Word();
                    // System.out.println("hello "+word);
                    w.setWord(word);
                    w.setNoOfOcur(1);
                   
                    li.add(w);
                    

                    
                }
            }
            return li;
           
        }
    }
	public void display(LinkedList<Word> word) {
        System.out.println(word);
        System.out.println(word.size());
      
	}
	public LinkedList<Word> noOfwordsOcur(LinkedList<Word> word) {
     // LinkedList<Word> newWord= new LinkedList<>();
        for(int i=0;i<word.size();i++)
        {
            int counter =0;
           // newWord.add(word.get(i));
            for(int j=i;j<word.size();j++)
            {
                if(word.get(i).getWord().equals(word.get(j).getWord()))
                {
                   
                    counter+=1;
                }
              
                word.get(i).setNoOfOcur(counter);
            }
        
        }
        return word;
        // Collections.sort(word);
	}
	public void sortAlpha(LinkedList<Word> words) {
        Collections.sort(words,new NameComperator());
     System.out.println();
     System.out.println(words);
	}

   
}
