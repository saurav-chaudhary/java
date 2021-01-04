public class TravelSavers {
    public static void main(String[] args) {
        System.out.println("  Enter the amount invested by the company : ");
        int amountInUsd = 1000;
          System.out.println(amountInUsd);
        System.out.println();
        // given that 1998 1usd= 40rs
        int amountInInr= 40*1000;
        System.out.println("   Enter the share price of the company :");
        int sharePriceInInr =100;
        
          System.out.println(sharePriceInInr);
        System.out.println();
        int shareCompany = amountInInr/100;
        System.out.println("so total share is ");
          System.out.println(shareCompany);
        System.out.println();
        System.out.println("Investment amount after increase in exchange rate :");
        // persent time 1us = 74.3
        double persentInvestPrice = 74.3 *1000;
          System.out.println(persentInvestPrice);
        System.out.println();
        System.out.println("The new price of the stock :");
        double newPriceStock = (100*74.3)/400;
          System.out.println(newPriceStock);
        System.out.println();
        System.out.println("  The tax to be paid on the total shares at 10% :");
           double tax = (persentInvestPrice*10)/100;
           System.out.println();
        System.out.println("The total profit in INR :");
           double profit = persentInvestPrice-tax;

           System.out.println(profit);
           System.out.println();
        System.out.println("The total profit converted to dollars :");

           double profitInDollars = profit/74.3;

           System.out.println(profitInDollars);




        
    }
}
