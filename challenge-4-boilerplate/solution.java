import java.util.Scanner;
public class solution {
    public void celsiusToFahrenheit()
    {
       char yes ;
       do{
          System.out.println(" enter the value of temperature in celsius");
          Scanner sc = new Scanner(System.in);
          int tc = sc.nextInt();
          double tf = (tc*1.8)+32;
          System.out.format("Temperature(Fahrenheit) = %.2f \n", tf);
          System.out.println("Do you wish to continue(y/n)?");
          yes = sc.next().charAt(0);
       }
       while(yes=='y');

    }
    public static void main(String[] args) {
        solution s = new solution();
        s.celsiusToFahrenheit();
    }
}
