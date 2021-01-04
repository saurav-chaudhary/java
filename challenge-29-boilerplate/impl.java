import java.util.*;
public class impl {
    public static void main(String[] args) {
        System.out.println("enter type of engine you want Manual(m) AMT(a) CVT(c) DCT (d)");
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        if(choice =='m')
        {
        Manual m = new Manual("MP4");
        m.showSpecs();
        }
        else if(choice =='a')
        {
        AMT a = new AMT("AMTP4");
        a.showSpecs();
        }
        else if(choice=='c')
        {
        CVT c = new CVT("CVT6");
        c.showSpecs();
        }
        else if(choice=='d')
        {
        DCT d= new DCT("DCT8");
        }
    }
}
