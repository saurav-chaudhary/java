import java.util.*;
public class Imp {
    public static void main(String[] args) {
        System.out.println("enter type of engine you want Petrol(p) Disel(d) CNG(c) Electric Engine (a)");
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        if(choice =='p')
        {
           
        Petrol p = new Petrol("P1000"); 
        p.showSpecs();
        }
        else if(choice == 'd')
        {
        Disel d = new Disel("D1300");
        d.showSpecs();
        }
        else if(choice=='c')
        {
        CNG c = new CNG("C1000");
        c.showSpecs();
       }
        else if(choice=='a')
        {
        ElectricalEngine ee = new ElectricalEngine("88");
        ee.showSpecs();
        }
    }

   
}
