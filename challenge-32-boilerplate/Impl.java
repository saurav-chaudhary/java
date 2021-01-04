import java.io.IOException;

public class Impl {
    public static void main(String[] args) throws IOException {
        Analyzer a = new Analyzer();
        int n=a.noOfData();
        System.out.println(n);
        Information[] list= a.info(n);
         a.display(list);
     
         a.rating(list);
         a.sortPrice(list);
         a.sortRating(list);
       
    }
}
