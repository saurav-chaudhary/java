import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class  Analyzer {
    public   int noOfData()
    {
        int count =0;

       try(BufferedReader br = new BufferedReader(new FileReader("data/purchase_details.csv"))){
          
       while(br.readLine()!=null)
       {
           count++;
       }
    }
    catch( FileNotFoundException e)
    {
        e.printStackTrace();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
    return count;
    }
  
    public Information[] getInformation(int noOfData) throws IOException
        {
                  Information[] inf = new Information[noOfData-1];
                  try(BufferedReader br1 = new BufferedReader(new FileReader("data/purchase_details.csv")))
                  {
                      br1.readLine();
                    String line ;
                    int index=0;
                    while((line = br1.readLine())!=null)
                    {
                        //  String[] arr = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                         String[] arr = line.split(",");
                        
                        Information in = new Information();
                        in.setDate(arr[0]);
                       
                        in.setCustomer_id(arr[1]);
                        
                        in.setProduct_category(arr[2]);
                        in.setPayment_method(arr[3]);
                        in.setValue(arr[4]);
                        in.setValue(arr[5]);
                        in.setClicks_in_site(arr[6]);
                        inf[index]=in;
                        index++;

                    }
                    return inf;
                  }
                  
        }

	public void display(Information[] list, int noOfData) {
        for(int i=0;i<list.length;i++)
        {
            System.out.print(i+" ");
            System.out.print(list[i].getDate()+" "+list[i].getCustomer_id()+" "+list[i].getProduct_category()+" "+list[i].getPayment_method()+" "+list[i].getValue()+" "+list[i].getClicks_in_site());
            System.out.println();
        }
     
	}

	public void productCategory(Information[] list) {
       
      for(int i=0;i<list.length;i++)
      {
          int count=0;
          for(int j=0;j<list.length;j++)
          {
            
              if((list[i].getProduct_category()).equals(list[j].getProduct_category()))
              {
                //   System.out.println("hii");
                  count++;
              }
          }
          System.out.println(count);
          if(count==1)
          {
            // System.out.print(i+" ");
            System.out.print(list[i].getDate()+" "+list[i].getCustomer_id()+" "+list[i].getProduct_category()+" "+list[i].getPayment_method()+" "+list[i].getValue()+" "+list[i].getClicks_in_site());
            System.out.println();
          }
      }
    
    
}
}
