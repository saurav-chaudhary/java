import java.util.*;
public class BankImpl {
    public static void main(String[] args) {
        System.out.println(" Enter no of Customer ");
        Scanner sc = new Scanner(System.in);
        int noOfCustomer = sc.nextInt();
        BankInfo inf = new BankInfo();
       Customer[] customerInfo= inf.information(noOfCustomer);
        inf.display(customerInfo,noOfCustomer);
        inf.lastName(customerInfo,noOfCustomer);
        inf.taluk(customerInfo, noOfCustomer);
    }
}
