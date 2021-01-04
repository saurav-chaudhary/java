import java.util.Scanner;

import java.util.Scanner;
public class AgSchoolResult {
    public static int[] rollNumber(int noOfStudent)
    {   Scanner sc = new Scanner(System.in);
       System.out.println(" enter studen roll number "); 
       int[]  rollNumber = new int[noOfStudent];
       for(int i=0;i<noOfStudent;i++)
       {
            rollNumber[i] = sc.nextInt();
           
       }
       System.out.println("roll number is ");
       for(int i=0;i<noOfStudent;i++)
       {
          
            System.out.println(rollNumber[i]);
       }
       return rollNumber;
    }
    public static String[] name(int noOfStudent)
    {   Scanner sc = new Scanner(System.in);
       System.out.println(" enter student name number "); 
       String[]  name = new String[noOfStudent];
       for(int i=0;i<noOfStudent;i++)
       {
        name[i] = sc.next();
            //System.out.println(rollNumber[i]);
       }
       System.out.println("name is ");
       for(int i=0;i<noOfStudent;i++)
       {
            // rollNumber[i] = sc.nextInt();
            System.out.println(name[i]);
       }
       return name;
    }

    // maths marks
    public static int[] math(int noOfStudent)
    {  
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter each student maths mark number acc to roll no "); 
        int[]  maths = new int[noOfStudent];
        for(int i=0;i<noOfStudent;i++)
        {
             maths[i] = sc.nextInt();
             //System.out.println(rollNumber[i]);
        }
        System.out.println("the marks of math of each student is:");
        for(int i=0;i<noOfStudent;i++)
        {
             // rollNumber[i] = sc.nextInt();
             System.out.println(maths[i]);
        }
        return maths;
     }
     
     // Science marks

     public static int[] science(int noOfStudent)
     {
         
         Scanner sc = new Scanner(System.in);
         System.out.println(" enter each student science mark number acc to roll number acc to roll no "); 
         int[]  science = new int[noOfStudent];
         for(int i=0;i<noOfStudent;i++)
         {
            science[i] = sc.nextInt();
              //System.out.println(rollNumber[i]);
         }
        System.out.println("the mark is");
         for(int i=0;i<noOfStudent;i++)
         {
              // rollNumber[i] = sc.nextInt();
              System.out.println(science[i]);
         }
         return science;
      }

      // english marks 
      public static int[] english(int noOfStudent)
      {
          System.out.println("enter english marks  for each student acc to roll no");
          Scanner sc = new Scanner(System.in);
          
          int[]  english = new int[noOfStudent];
          for(int i=0;i<noOfStudent;i++)
          {
            english[i] = sc.nextInt();
               //System.out.println(rollNumber[i]);
          }
         System.out.println("the mark is");
          for(int i=0;i<noOfStudent;i++)
          {
               // rollNumber[i] = sc.nextInt();
               System.out.println(english[i]);
          }
          return english;
       }
       // language marks

       public static int[] language(int noOfStudent)
       {
           Scanner sc = new Scanner(System.in);
           System.out.println(" enter each student language mark number "); 
           int[]  language = new int[noOfStudent];
           for(int i=0;i<noOfStudent;i++)
           {
            language [i] = sc.nextInt();
                //System.out.println(rollNumber[i]);
           }
          System.out.println("the mark is");
           for(int i=0;i<noOfStudent;i++)
           {
                // rollNumber[i] = sc.nextInt();
                System.out.println( language [i]);
           }
           return language;
        }
        // Social Studies marks
        public static int[] socialStudies(int noOfStudent)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter each student social studies mark number acc to roll no "); 
            int[]  socialStudies = new int[noOfStudent];
            for(int i=0;i<noOfStudent;i++)
            {
                socialStudies [i] = sc.nextInt();
                 //System.out.println(rollNumber[i]);
            }
            System.out.println("the marks is");
    
            for(int i=0;i<noOfStudent;i++)
            {
                 // rollNumber[i] = sc.nextInt();
                 System.out.println( socialStudies [i]);
            }
            return socialStudies;
         }
         
         

    public static int[] totalMarks(int[] mathMarks,int[] scienceMarks, int[] englishMarks,int[] languageMarks, int[]socialStudiesMarks,int noOfStudent
    )
    {
        
        int[] total = new  int[noOfStudent]; 
        for(int i=0;i<noOfStudent;i++)
        {
            total[i] = total[i] +mathMarks[i]+scienceMarks[i]+englishMarks[i]+languageMarks[i]+socialStudiesMarks[i];
            System.out.println(total[i]);
        }
        return total;

    }      
    public static void average(int[] allMarks, int noOfStudent)
    {
       double[] average  = new double[noOfStudent];
       for(int i=0;i<noOfStudent;i++)
       {
           average[i] = allMarks[i]/5;
           System.out.println(average[i]);


       }
    }
    
    public static void topScorer(int[] allMarks,int[]roll, String[] nameOfStudent ,int noOfStudent)
    {
        int max = 0;
        int index=0;
        for(int i=0;i<noOfStudent;i++)
        {
            if(allMarks[i]>max)
            {
                max= allMarks[i];
                index =i;
            }
           

        }
         
        System.out.println("the maximum marks is"+max);
        System.out.println("maximum marks sudent roll no is "+roll[index]);
        System.out.println("maximum marks sudent name is "+nameOfStudent[index]);
    }
    
    
 public static void main(String[] args) {
     System.out.println("how many student is in your class");
     Scanner sc = new Scanner(System.in);
     int noOfStudent = sc.nextInt();
    //  rollNumber(noOfStudent);
     int[] roll = rollNumber(noOfStudent);
     String[] nameOfStudent = name(noOfStudent);
    int[] mathMarks= math(noOfStudent);
     int[] scienceMarks=science(noOfStudent);
     int[] englishMarks=english(noOfStudent);
     int[] languageMarks=language(noOfStudent);
     int[] socialStudiesMarks =socialStudies(noOfStudent);
     System.out.println("total marks of each student");
     int[] allMarks=totalMarks(mathMarks,scienceMarks,englishMarks,languageMarks,socialStudiesMarks,noOfStudent);
     System.out.println("avergae of each student is");
     average(allMarks,noOfStudent);
     System.out.println("the topper name and roll number is :");
     topScorer(allMarks,roll,nameOfStudent,noOfStudent);
 }   
}
