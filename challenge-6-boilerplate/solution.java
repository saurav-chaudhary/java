import java.util.Scanner;
public class solution {
    public static void main(String[] args) {
        System.out.println("Enter the source currency: ");
        
        Scanner sc = new Scanner(System.in);
        
          String choice = sc.nextLine().toUpperCase();
          System.out.println(choice);
          System.out.println("Enter the amount : ");
          int amount = sc.nextInt();
          System.out.println(amount);
          double rs;
          switch (choice)
          {
              case "USD":
               rs = 74.3*amount;
              System.out.println("The Exchange rate for" +amount+ " "+choice+ "is : "+rs );
              break;
              case "GBP":
               rs = 94.5*amount;
              System.out.println("The Exchange rate for" +amount+ " "+choice+ "is :" +rs );
              break;
              case "JPY":
               rs = 0.67*amount;
              System.out.println("The Exchange rate for" +amount+ " "+choice+ "is :" +rs );
              break;
              case "EUR":
               rs = 85.37*amount;
              System.out.println("The Exchange rate for" +amount+ " "+choice+ "is :" +rs );
              break;
              case "AED":
               rs = 20.25*amount;
              System.out.println("The Exchange rate for" +amount+ " "+choice+ "is :" +rs );
              break;
              default:
              System.out.println("invalid currency");




          }

    }
}
