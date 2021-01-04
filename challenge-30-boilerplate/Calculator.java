import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Mathematics {
        System.out.println("Enter the operation you wish to perform : ");
        System.out.println("   1. Mathematical Calculation ");
        System.out.println("   2. Scientific Calculation");
        System.out.println("   3. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        char ch =' ';
        do{
            if(choice ==1)
            {
                MathematicalOperation mo = new MathematicalOperation();
                mo.calcution();
            }
            else if(choice ==2)
            {
                ScientificCalculation s =new ScientificCalculation();
                s.calculation();
            }
            else if(choice ==3)
            {
            System.out.println("exit");

            
            }
            System.out.println("do you want continue y/n");
            ch = sc.next().charAt(0);
        }while(ch=='y');
    }
}