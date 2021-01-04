import java.util.Scanner;

public class MathematicalOperation {

    public void calcution() throws Mathematics {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select an arithmetic operation :" + "1. Add " + " 2. Subtract" + " 3. Multiply"
                + "4. Divide" + "5. Modulo" + "6. Back to Main Menu");
              
                int choice = sc.nextInt();
                if(choice ==1)
                {
                    System.out.println("enter both the number");
                    int firstNumber = sc.nextInt();
                    double secondNumber = sc.nextDouble();
                    System.out.println("the addition of two number is");
                    double sum = firstNumber+secondNumber;
                    System.out.println(sum);
                }
                else if(choice==2)
                {
                    System.out.println("enter both the number");
                    int firstNumber = sc.nextInt();
                    double secondNumber = sc.nextDouble();
                    System.out.println("the subtract of two number is");
                    double sub = firstNumber-secondNumber;
                    System.out.println(sub);
                }
                else if(choice ==3)
                {
                    System.out.println("enter both the number");
                    int firstNumber = sc.nextInt();
                    double secondNumber = sc.nextDouble();
                    System.out.println("the multiplication of two number is");
                    double mul = firstNumber*secondNumber;
                    System.out.println(mul);
                }
                else if(choice ==4)
                {
                    System.out.println("enter both the number");
                    int firstNumber = sc.nextInt();
                    double secondNumber = sc.nextDouble();
                  
                    if(secondNumber==0)
                    {
                        throw new Mathematics("invalid number or number cant be divided by zero");
                    }
                    else
                    {
                        System.out.println("the divide of two number is");
                    double div = firstNumber/secondNumber;
                    System.out.println(div);
                    }
                    
                    
                 }
                 else if(choice ==5)
                {
                    System.out.println("enter both the number");
                    int firstNumber = sc.nextInt();
                    double secondNumber = sc.nextDouble();
                   
                    if(secondNumber==0)
                    {
                        throw new Mathematics("invalid number or number cant be divided by zero");
                    }
                    else
                    {
                        System.out.println("the modulo of two number is");
                    double mod = firstNumber/secondNumber;
                    System.out.println(mod);
                    }
                    
                    
                 }
                 else if(choice ==6)
                 {
                     System.out.println("back to the menu");
                 }
                }
}
