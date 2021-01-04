

public class SingleLinkedList {
    WordNode startPtr;
    
	
    public void addWordNode(String element)
    {
        // System.out.println(startPtr);
        if(!updateOccurance(element))
        {
            Word word = new Word();
            word.setWord(element);
            word.setOcurrence(1);
            WordNode newWordNode = new WordNode(word);
            if(startPtr==null)
            {
                startPtr=newWordNode;
                startPtr.next=null;

            }   
            else{
                newWordNode.next=startPtr;
                startPtr=newWordNode;

            } 
        }
        
    }

    private boolean updateOccurance(String element) {
        if(startPtr==null)
        {
            return false;
        }
        WordNode current=startPtr;
        while(current!=null)
        {
            if(current.data.getWord().equals(element))
            {
                current.data.setOcurrence((current.data.getOcurrence()+1));
                return true;
            }
            current=current.next;
        }


        return false;
    }

	public void traversal() {
        WordNode current = startPtr;
        while(current!=null)
        {

            System.out.println(current.data+" ");
            current = current.next;
        }
    }
    public void shorting()
    {
        WordNode current = startPtr;
        WordNode index;
       
        Word temp;
        int n;
        if(startPtr==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            while(current!=null)
            {
                index=current.next;
                while(index!=null)
                {
                    if(current.data.getWord().compareTo(index.data.getWord())>0)
                    {
                        // temp=current.data.getWord();
                        // current.data.setWord(index.data.getWord());
                        // index.data.setWord(temp);

                        // n=current.data.getOcurrence();
                        // current.data.setOcurrence(index.data.getOcurrence());
                        // index.data.setOcurrence(n);
                        temp=current.data;
                        current.data=index.data;
                        index.data=temp;


                    }
                    index=index.next;
                }
                current=current.next;
            }
        }
    }

	public void showFrequentWords() {
        Word temp;
        int n;
        WordNode current=startPtr;
        WordNode index;
        if(startPtr==null)
        {
            System.out.println("list is empty");
        }
        else
        {
        while(current!=null)
        {
            index=current.next;
            while(index!=null)
            {
                if(current.data.getOcurrence()>index.data.getOcurrence())
                {
                    
                  if(current.data.getOcurrence()==index.data.getOcurrence())
                  {
                    
                   
                    n=current.data.getOcurrence();
                    current.data.setOcurrence(index.data.getOcurrence());
                    index.data.setOcurrence(n);
                  }
                 if(current.data.getOcurrence()==index.data.getOcurrence())
                 {
                     if(current.data.getWord().compareTo(index.data.getWord())>0)
                     {
                        temp=current.data;
                        current.data=index.data;
                        index.data=temp;
                     }
                 }


                   
                }
                index=index.next;
            }
            current=current.next;

        }
    }
}

	

}




	


	
