import java.util.Scanner;
public class solution {
    public static void celsiusToFahrenheit(int temp)
    {
      double tf = (temp*1.8)+32;
      System.out.format("Temperature(Fahrenheit)%.2f =" ,+tf);
    }
    public static void fahrenheitToCelsius(int temp)
    {
       double tc = ((temp - 32)*5)/9;
       System.out.format("Temperature(Celsius)%.2f=",+ tc);
    }
    public static void main(String[] args) {
        char yes;
        do{
        System.out.println("enter the temperature");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        System.out.println("Enter the source scale(celcius(c)/fahrenheit(f))?");
        char choice = sc.next().charAt(0);

        switch(choice)
        {
            case 'c':
            celsiusToFahrenheit(temp);
            break;
            case 'f':
            fahrenheitToCelsius(temp);
            System.out.println();
        }
        System.out.println("Do you wish to continue(y/n)?");
          yes = sc.next().charAt(0);

    }
    while(yes=='y');
}
}
