import java.util.Scanner;
public class StringProblem {

    public static String[] words(int noOfWords)
    {
        Scanner sc = new Scanner(System.in);
        String[] word = new String[noOfWords];
        for(int i=0; i<noOfWords;i++){
         word[i] = sc.next();
        }
       
        return word;

    }
    public static void shortest(String[] word,int noOfWords)
    {    int[] length = new int[noOfWords];
        for(int i=0;i<noOfWords;i++)
        {
            length[i] = word[i].length();
            
        }
        

        int shortNumber= 500;
        int index =0;
        for(int i=0;i<length.length;i++)
        {
            if(length[i]<shortNumber)
            {
                shortNumber =length[i];
                index =i;
            }
           
        }
        System.out.println("the shortest word is: " + word[index]);
    }
        public static void searching(String[] word , int noOfWords)
        {   
            
            System.out.println("enter a word you want to search");
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            String givenWord = sc.next();
            for(int i=0;i<noOfWords;i++)
            {
                if(givenWord.equals(word[i]))
                {
                  flag=1;
                }
              
            }
            if(flag==1){
                System.out.println(" The word is present in the list");
            }
            else
            {
            System.out.println(" The word is not present in the list");
            }
        }
        public static void sorting(String[] word, int noOfWords)
        {  
            String temp;
            System.out.println("sorting orders are:");
            for(int i=0;i<noOfWords;i++)
            {
                for(int j=0;j<noOfWords;j++)
                {
                    if(word[i].compareTo(word[j])<0)
                    {
                        temp = word[i];
                        word[i]=word[j];
                        word[j]= temp;
                    }
                }
            }
            System.out.println("the sorting order is:");
            for(int i=0;i<noOfWords;i++)
            {
                System.out.println(word[i]+" ");
            }
            
        }
        public static void pallindrome(String[] word , int noOfWords)
        {
            int counter =0;
            for(int i=0;i<word.length;i++)
            {  
                String newWord="" ;

                for(int j=word[i].length()-1;j>=0;j--)
                {
                
                    newWord = newWord + word[i].charAt(j);
                }
                if(newWord.equals(word[i]))
                {
                    counter++;
                    
                }
            }
            System.out.println("the number of palindrome words are:");
            System.out.println(counter);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many word you want enter");
        int noOfWords = sc.nextInt();
        System.out.println("the words given by user are following");
        String[] word =words(noOfWords);
        shortest(word,noOfWords);
        searching(word,noOfWords);
        sorting(word,noOfWords);
        pallindrome(word, noOfWords);
        
        
        
    }
}

