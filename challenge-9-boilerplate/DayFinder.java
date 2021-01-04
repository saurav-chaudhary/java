import java.util.Scanner;
import java.lang.Math;
public class DayFinder {
    public static void main(String[] args) {
    String[] days ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    int theDay;
    System.out.println("enter the current day of the week Enter 1. Monday, Enter 2.Tuesday ,Enter 3. Wednesday , Enter 4.Thursday , Enter 5. Friday, Enter 6.Saturday, Enter 7 Sunday ");
    System.out.println("enter current day");
    Scanner sc = new Scanner(System.in);
    int selectDay = sc.nextInt();
    System.out.println("current day of user is:"+days[selectDay]);
    
    System.out.println("Enter the no. of days from today:");
    int daysFromToday = sc.nextInt();
    
             theDay =(7+(daysFromToday+selectDay)%7)%7;
    System.out.format("Its %s",days[theDay]);
        
      


    }
    
}
