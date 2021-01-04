import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



public class Analyzer {
    public int noOfData() throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("data/flipkart_product_sample.csv"))) {
            while (br.readLine() != null) {
                count++;
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;

}
public Information[] info(int length) throws IOException
{
    Information[] informations = new Information[length];
    try (BufferedReader br1 = new BufferedReader(new FileReader("data/flipkart_product_sample.csv"))) {
        br1.readLine();
        String line;
        int index = 0;
        while ((line = br1.readLine()) != null) {
            String[] arr = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            Information io = new Information();
            io.setPid(arr[0]);
            io.setProduct_name(arr[1]);
            io.setBrand(arr[2]);
            io.setProduct_url(arr[3]);
            io.setRetail_price((arr[4]));
            io.setDiscounted_price((arr[5]));
      
            
                 io.setProduct_rating(arr[6]);
            
           
            informations[index] = io;
            index++;

        }
        return informations;
    }
}

    public void display(Information[] list)
    {

    for(int i=1;i<list.length;i++)
    {
    System.out.print(i +" ");
    System.out.println(list[i].getPid()+" "+list[i].getProduct_name()+" "
    +list[i].getBrand()+" "+list[i].getProduct_url()+" "+list[i].getRetail_price()+" "
    +list[i].getDiscounted_price()+" "+list[i].getProduct_rating());
    System.out.println();
    }

    }
   
	public void sortPrice(Information[] list) {
        Information temp;
        
        for(int i=0;i<list.length;i++)
        {
            for(int j=1;j<list.length-i-1;j++)
            {
                if(Double.parseDouble(list[j-1].getRetail_price())>Double.parseDouble(list[j].getRetail_price()))
                {
                    temp=list[j-1];
                    list[j-1]=list[j];
                    list[j]=(temp);

                  
                }
            }
        }
        for(int i=0;i<list.length;i++)
        {
            System.out.print(i +" ");
            System.out.println(list[i].getPid()+" "+list[i].getProduct_name()+" "
            +list[i].getBrand()+" "+list[i].getProduct_url()+" "+list[i].getRetail_price()+" "
            +list[i].getDiscounted_price()+" "+list[i].getProduct_rating());
            System.out.println();
            }
            try{
            FileWriter fw = new FileWriter("data/Sorting.");
            for(int i=0;i<list.length;i++)
            {
                fw.write("\n" +list[i].getPid()+ " "+list[i].getProduct_name()+" "+list[i].getBrand()+" "+list[i].getProduct_url()+" "+list[i].getRetail_price()+" "+list[i].getDiscounted_price()+" "+list[i].getProduct_rating());
            }
            }catch(IOException e)
            {
                e.printStackTrace();
            }
            
        }
	public void rating(Information[] list) {
        for(int i=0;i<list.length;i++)
        {
            // System.out.print(i+" ");
            // (list[i].getProduct_rating().equals("No rating available")))
            if(list[i]!=null &&list[i].getProduct_rating().equals("No rating available"))
            {
                
                //  System.out.println("hi");
                 list[i].setProduct_rating("0.0");
            }
          
        }
	}
	public void sortRating(Information[] list) {
        Information temp;
        
        for(int i=0;i<list.length;i++)
        {
            for(int j=1;j<list.length-i-1;j++)
            {
                if(Double.parseDouble(list[j-1].getProduct_rating())<Double.parseDouble(list[j].getProduct_rating()))
                {
                    temp=list[j];
                    list[j]=list[j-1];
                    list[j-1]=(temp);

                  
                }
            }
        }
      
        for(int i=0;i<list.length;i++)
        {
            System.out.print(i +" ");
            System.out.println(list[i].getPid()+" "+list[i].getProduct_name()+" "
            +list[i].getBrand()+" "+list[i].getProduct_url()+" "+list[i].getRetail_price()+" "
            +list[i].getDiscounted_price()+" "+list[i].getProduct_rating());
            System.out.println();
            }
            try{
                FileWriter fw = new FileWriter("RatingSorting.txt");
                for(int i=0;i<list.length;i++)
                {
                    fw.write("\n" +list[i].getPid()+ " "+list[i].getProduct_name()+" "+list[i].getBrand()+" "+list[i].getProduct_url()+" "+list[i].getRetail_price()+" "+list[i].getDiscounted_price()+" "+list[i].getProduct_rating());
                }
                }catch(IOException e)
                {
                    e.printStackTrace();
                }
         }
       
	}





