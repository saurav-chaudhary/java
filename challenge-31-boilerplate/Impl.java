import java.io.IOException;
import java.text.ParseException;

public class Impl {
    public static void main(String[] args) throws IOException, ParseException {
        StockAnalysis sa = new StockAnalysis();
        int length=sa.lengthCount();
        Information[] list=sa.read(length);
        sa.setValue(list);
        // sa.display(list,length);
        //  sa.absolutefirstLast(list);
        // sa.absoluteDate(list);
        System.out.println("highest stock is");
        sa.highestStock(list);
        System.out.println("lowest stock is");
        sa.lowestStock(list);
        System.out.println("Average are:");
        sa.average(list);

       
    }
}
