import java.util.*;
public class BankInfo {
    Scanner sc = new Scanner(System.in);
    public Customer[] information(int noOfCustomer)
    {  
        Customer[] info  = new Customer[noOfCustomer];
        for(int i =0;i<noOfCustomer;i++)
        {
            Customer cs = new Customer();
            System.out.println("Enter first name of customer");
            String firstName = sc.next();
            cs.setFirstName(firstName);
            System.out.println("Enter last name");
            String lastName = sc.next();
            cs.setLastName(lastName);
            System.out.println("enter adhar card number");
            int adhr =sc.nextInt();
            cs.setAdharNo(adhr);
            
            System.out.println("enter dob dd-mm-yy");
            String dob = sc.next();
            cs.setDob(dob);
            System.out.println("Enter mobile number ");
            String mobileNo = sc.next();
            String regex = "(0/91)?[7-9][0-9]{9}";
            if(mobileNo.matches(regex))
          {System.out.println("correct");
          cs.setMobileNo(mobileNo);
            }
          else
          System.out.println("incorrect number");
          


            Address ad = new Address();

            System.out.println("enter house number");
            int houseNo = sc.nextInt();
            ad.setHousenumber(houseNo);
            System.out.println("enter street name");
            String streetName = sc.next();
            ad.setStreetName(streetName);
            System.out.println("enter city name");
            String city = sc.next();
            ad.setCity(city);
            System.out.println("enter pincode");
            int pinCode = sc.nextInt();
            ad.setPincode(pinCode);
            cs.setAdrs(ad);
            System.out.println("customer id is");
            Random rand = new Random(); 
          int customerId = (int)(Math.floor(Math.random()*1000)+1);
        //   System.out.println(cus);
         
          cs.setCustomerId(customerId);

            info[i]=cs;

        }
        return info;
    }

    public void display(Customer[] customer,int noOfCustomer)
    {
        System.out.format("%s %10s %10s %10s %10s %10s %10s %10s %10s %10s ","id","First Name","Last Name", "Adhar NO" ,"Dob","Mobile No","House No","StreatName","city","Pincode");
        System.out.println();
        for(int i=0;i<noOfCustomer;i++)
        {
            System.out.format("%d %10s %10s %10d %10s %10s %10d %10s %10s  %10d",customer[i].getCustomerId(),customer[i].getFirstName(),customer[i].getLastName(),customer[i].getAdharNo(),customer[i].getDob(),customer[i].getMobileNo(),customer[i].getAdrs().getHousenumber(),customer[i].getAdrs().getCity(),customer[i].getAdrs().getStreetName(),customer[i].getAdrs().getPincode());
            System.out.println();
        }
    }
    public void lastName(Customer[] customer,int noOfCustomer)
    {   
        System.out.println("enter last name of customer ");
        String last = sc.next();
        int counter =0;
        for(int i=0;i<noOfCustomer;i++)
        { 
           
            if(customer[i].getLastName().equals(last))
            { 
                System.out.format("%d %10s %10s %10d %10s %10s %10d %10s %10s  %10d",customer[i].getCustomerId(),customer[i].getFirstName(),customer[i].getLastName(),customer[i].getAdharNo(),customer[i].getDob(),customer[i].getMobileNo(),customer[i].getAdrs().getHousenumber(),customer[i].getAdrs().getCity(),customer[i].getAdrs().getStreetName(),customer[i].getAdrs().getPincode());
                counter++;
                System.out.println();
            }
            
        }
        if(counter==0)
        {
            System.out.println("user does not exist");
        }
       
    }
    public void taluk(Customer[] customer,int noOfCustomer)
    {   
        System.out.println("enter  villge of customer ");
        String taluk = sc.next();
        int counter =0;
        for(int i=0;i<noOfCustomer;i++)
        { 
           
            if(customer[i].getAdrs().getCity().equals(taluk))
            { 
                System.out.format("%d %10s %10s %10d %10s %10s %10d %10s %10s  %10d",customer[i].getCustomerId(),customer[i].getFirstName(),customer[i].getLastName(),customer[i].getAdharNo(),customer[i].getDob(),customer[i].getMobileNo(),customer[i].getAdrs().getHousenumber(),customer[i].getAdrs().getCity(),customer[i].getAdrs().getStreetName(),customer[i].getAdrs().getPincode());
                counter++;
                System.out.println();
            }
            
        }
        if(counter==0)
        {
            System.out.println("user does not exist");
        }
       
    }

}

