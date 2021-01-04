import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        TicketImpl ti = new TicketImpl();
        List<TicketData> list=  ti.addData();
        ti.sort(list);
        ti.amountAverage(list);
    }
}
