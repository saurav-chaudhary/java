import java.io.IOException;

public class Impl {
    public static void main(String[] args) throws IOException {
        Analyzer a = new Analyzer();
        int noOfData=a.noOfData();
        System.out.println(noOfData);
        Information[] list=a.getInformation(noOfData);
        // a.display(list,noOfData);
        a.productCategory(list);

    }
}
