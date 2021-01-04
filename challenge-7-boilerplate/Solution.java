import java.util.Scanner;

public class Solution {
    // convert Inr currency to another currency 
    public static void fromInr()
    {
       int[] inr = new int[]{1,10,20,50,100};
       System.out.println("Denominations(INR)     USD    JPY    GBP|");
       System.out.println("_________________________________________");
       for(int i =0;i<inr.length;i++)
       {
          double usd = inr[i]*74.3;
          double jpy = inr[i]* 0.67;
          double gbp = inr[i]* 94.5;
       
        System.out.format("%d %15.2f %20.2f %25.2f \n",inr[i],usd,jpy,gbp);

           
       }
    }
    // convert Usd currency to another currency 
    public static void fromUsd()
    {
       Scanner sc = new Scanner(System.in);
       int usd = sc.nextInt();
       System.out.println("Denominations(usd)     euro    JPY    GBP|");
       System.out.println("_________________________________________");
      
          double euro = (usd*74.3)/84.5;
          double jpy = (usd* 0.67)/0.67;
          double gbp = (usd* 94.5)/74.3;
       
        System.out.format("%d %15.2f %20.2f %25.2f \n",usd,euro,jpy,gbp);

           
       
    }
    // convert Euro currency to another currency 
    public static void fromEuro()
    {
      Scanner sc = new Scanner(System.in);
      int euro = sc.nextInt();
       System.out.println("Denominations(INR)     USD    JPY    GBP|");
       System.out.println("_________________________________________");
       double usd = (euro*84.5)/74.3;
       double jpy = (euro* 84.5)/0.67;
       double gbp = (euro* 84.5)/74.3;
       
        System.out.format("%d %15.2f %20.2f %25.2f \n",euro,usd,jpy,gbp);

           
       
    }
    // convert Gbp currency to another currency 
    public static void fromGbp()
    {
      Scanner sc = new Scanner(System.in);
      int gbp = sc.nextInt();
       System.out.println("Denominations(INR)     USD    JPY    GBP|");
       System.out.println("_________________________________________");
       double usd = (gbp*94.5)/74.3;
       double jpy = (gbp* 94.5)/0.67;
       double euro = (gbp* 94.5)/84.5;
       
        System.out.format("%d %15.2f %20.2f %25.2f \n",gbp,usd,jpy,euro);

           
       
    }
    
    public static void main(String[] args) {
        System.out.println("enter currency name you want to convert into another currency and please select following one of them 1. inr , 2. usd , 3. euro , 4. gbp");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine().toLowerCase();
         System.out.println(choice.length());
        
        if(choice .equals("inr"))
        {
        
          fromInr();   //calling inr method
        }
        else if(choice == "usd")
        {
           fromUsd(); // calling usd method
        }
        else if(choice =="euro")
        {
           fromEuro(); // calling Euro method
        }
        else if(choice =="gbp")
        {
           fromGbp();  // calling gbp method
        }
        else 
        {
           System.out.println(" invalid currency");
        }



    }
}
