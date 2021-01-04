import java.util.Scanner;

public class ScientificCalculation {
    public void calculation() throws Mathematics {
        System.out.println("  Select a scientific operation : ");
        System.out.println("  1. Ceil" + " 2. Floor " + " 3. Square Root " + " 4. Power Of " + " 5. Back to Main Menu");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice ==1)
        {   
            System.out.println("Enter a non negative integer : ");
            double ceil = sc.nextDouble();
            if(ceil==0&&ceil<0)
            {
                throw new Mathematics("number is zero or number m be negative plz add positive  integer value");
            }
            else
            {   
                System.out.println("ceil value of given number is");
                System.out.println(Math.ceil(ceil));
            }
        }
        else if(choice ==2 )
        {
            System.out.println("Enter a non negative integer : ");
            double flor = sc.nextDouble();
            if(flor==0&&flor<0)
            {
                throw new Mathematics("number is zero or number m be negative plz add positive  integer value");
            }
            else
            {   
                System.out.println("floor value of given number is");
                System.out.println(Math.ceil(flor));
            }
        }
        else if(choice ==3)
        {
            System.out.println("Enter a non negative integer : ");
            int squareRoot = sc.nextInt();
            if(squareRoot==0&&squareRoot<0)
            {
                throw new Mathematics("number is zero or number m be negative plz add positive  integer value");
            }
            else
            {   
                System.out.println("square root of a given number is");
                System.out.println(squareRoot*squareRoot);
            }
        }
        else if(choice ==4)
        {
            System.out.println("enter base");
            int powerNumber1 =sc.nextInt();
            System.out.println("enter power");
            int powerNumber2 =sc.nextInt();

            if(powerNumber1==0&&powerNumber1<0&&powerNumber2<0&&powerNumber2==0)
            {
                throw new Mathematics("number is zero or number may be negative plz add positive  integer value");
            }
            else
            {   int result =1;
                while(powerNumber2!=0)
                {
                    result*=powerNumber1;
                    powerNumber2--;
                }
                System.out.println("square root of a given number is");
                System.out.println(result);
                
            }

        }
        else if(choice ==5)
                 {
                     System.out.println("back to the menu");
                 }
    }
}
