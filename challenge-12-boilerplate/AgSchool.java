import java.util.Scanner;
public class AgSchool {
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
          
         public static void passingStudent(int[] mathMarks , int[] scienceMarks, int[] englishMarks, int[] languageMarks,int[] socialStudiesMarks,int[] roll,String[] nameOfStudent,int noOfStudent)
         {
            int cutOff = 35;
            int countPassing =0;
            int countFail =0;

            for(int i=0;i<noOfStudent;i++)
            {
                if(mathMarks[i]>=35 && scienceMarks[i]>=35 && englishMarks[i]>=35 && languageMarks[i]>=35&&socialStudiesMarks[i]>=35)
                {
                    
                System.out.printf("the passing student are %d %s" ,roll[i],nameOfStudent[i]);
                    countPassing++;
                 
                    System.out.println();

                }
                else{
                  
                    System.out.printf("the fail student are %d %s",roll[i],nameOfStudent[i])
                    ;
                    countFail++;
                    System.out.println();
                       
                }


            }
            System.out.println("the number of student pass are "+countPassing);
            System.out.println("the no student fails are "+countFail); 
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
     
    //  int[] allMarks=totalMarks(mathMarks,scienceMarks,englishMarks,languageMarks,socialStudiesMarks,noOfStudent);
    passingStudent(mathMarks, scienceMarks, englishMarks, languageMarks, socialStudiesMarks, roll,nameOfStudent,noOfStudent);
    }
}
