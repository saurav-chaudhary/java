import java.util.Scanner;

public class TSImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter invested amount");
        double amount = sc.nextDouble();
        double sharePrice = 100;
      

        TravelSavers ts = new TravelSavers(){

            @Override
            public double exchangeRate(double amount) {
                System.out.println(amount);
                // TODO Auto-generated method stub
                return oldUsd*amount;
            }
            
        };
       double amountInvestInr= ts.exchangeRate(amount);
       System.out.println("the total amount in inr :"+amountInvestInr);
       int totalShare = (int)(amountInvestInr/sharePrice);
       System.out.println("Total share are : "+totalShare);
       TravelSavers ts1 = new TravelSavers(){

           @Override
           public double exchangeRate(double amount) {
               // TODO Auto-generated method stub
               return amount*newUsd;
           }
           
       };
       double currentInvest = ts1.exchangeRate(amount);
       System.out.println("the current invest : "+currentInvest);
      
       double newPriceStock = (sharePrice*ts1.newUsd)/totalShare;
       System.out.println("The new price of the stock :"+newPriceStock);
       System.out.println("  The tax to be paid on the total shares at 10% :");
       double tax = (currentInvest*10)/100;
       System.out.println("The total profit in INR :");
       double profit = currentInvest-tax;
       System.out.println(profit);
       System.out.println();
    System.out.println("The total profit converted to dollars :");

       double profitInDollars = profit/ts1.newUsd;

       System.out.println(profitInDollars);
    }
}
