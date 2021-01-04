import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TicketImpl {
    List<TicketData> arrayList = new ArrayList<>();

    public List<TicketData> addData() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("ticketingdata.csv"))) {
            br.readLine();
            String line;
            String[] arr;
            while ((line = br.readLine()) != null) {
                arr = line.split(",");
                TicketData td = new TicketData();
                td.setScheduleNo(arr[0]);
                td.setRouteNo(arr[1]);
                td.setFromStopId(arr[2]);
                td.setFromStopSeqNo(arr[3]);
                td.setTillStopId(arr[4]);
                td.setTillStopSeqNo(arr[5]);
                td.settDate(arr[6]);
                td.settTime(arr[7]);
                td.settAmount(arr[8]);
                td.setDistance(arr[9]);
                arrayList.add(td);
            }
        }
        // int i=1;
        // for(TicketData r : arrayList)
        // {
        // System.out.println(i+ " "+r);
        // i++;
        // }
        return arrayList;
    }

    public void sort(List<TicketData> list) {
        Comparator<TicketData> c= (l1,l2)->{
            return (l1.getRouteNo().compareTo(l2.getRouteNo()));
            
            
        };
        Collections.sort(list,c);
        System.out.println(list);
        
	}

	public void amountAverage(List<TicketData> list) {
        double sum =0;

        for(int i=0;i<list.size();i++)
        {
            sum+=Double.parseDouble(list.get(i).gettAmount());
        }
        System.out.println("Sum of total amount"+sum);
        double average = sum/list.size();
        System.out.println("Average are: "+average);

	}
}
