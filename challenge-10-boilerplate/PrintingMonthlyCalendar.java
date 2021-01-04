import java.util.Scanner;
public class PrintingMonthlyCalendar {
    
    public static void main(String[] args) {
        int[] leapMonths ={-1,31,29,31,30,31,30,31,31,30,31,30,31};
        int[] months ={-1,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec......):");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        System.out.println("Enter Year:");
        int year = sc.nextInt();
        System.out.println("Enter Day of week(Press 1 for Mon, 2 for Tue, 7 for Sun......):");
        int days = sc.nextInt();
        boolean leap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
           {
               System.out.println("hello");
               System.out.println("S M T W T F S");
               int position =0;
            while(position<days)
            {
                System.out.printf("  ");
                position++;
            }
             int i=1;
            while( i<=leapMonths[month])
            {
                 while(position<=6 && i<=leapMonths[month])
                 {
                   System.out.printf(i+" ");
                   position++;
                   i++;
                 }
                 position=0;
                 System.out.println();
            }
           }
        else
            {
               System.out.println("non");
                System.out.println("S M T W T F S");
                int position =0;
                while(position<days)
                {
                    System.out.printf("  ");
                    position++;
                }
                 int i=1;
                while( i<=months[month])
                {
                     while(position<=6 && i<=months[month])
                     {
                       System.out.printf(i+" ");
                       position++;
                       i++;
                     }
                     position=0;
                     System.out.println();
               }
            }

      




      
      

    }
}
