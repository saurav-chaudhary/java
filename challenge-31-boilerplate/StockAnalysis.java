import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StockAnalysis {
    //static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public int lengthCount() throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("data/CIPLA.NS.csv"))) {
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

    public Information[] read(int length) throws IOException {
        Information[] informations = new Information[length];
        try (BufferedReader br1 = new BufferedReader(new FileReader("data/CIPLA.NS.csv"))) {
            String line;
            int index = 0;
            while ((line = br1.readLine()) != null) {
                String[] arr = line.split(",");
                Information io = new Information();
                io.setDate(arr[0]);
                io.setOpen(arr[1]);
                io.setHigh(arr[2]);
                io.setLow(arr[3]);
                io.setClose(arr[4]);
                io.setAdjClose(arr[5]);
                io.setVolume(arr[6]);
                informations[index] = io;
                index++;

            }
            return informations;
        }

    }

    // public void display(Information[] list,int length)
    // {

    // for(int i=1;i<list.length;i++)
    // {
    // System.out.print(i +" ");
    // System.out.println(list[i].getDate()+" "+list[i].getOpen()+" "
    // +list[i].getHigh()+" "+list[i].getLow()+" "+list[i].getClose()+" "
    // +list[i].getAdjClose()+" "+list[i].getVolume());
    // System.out.println();
    // }

    // }

    public void absolutefirstLast(Information[] list) throws NumberFormatException, ParseException {
     
        String num2 = list[list.length - 1].getClose();
        String num1 = list[1].getClose();

        double number2 = Double.parseDouble(num2);
        double number1 = Double.parseDouble(num1);
        double absolutefirstLast = ((number2 - number1) / number1) * 100;
        System.out.println(absolutefirstLast);

    }

    public void absoluteDate(Information[] list) {
        System.out.println("enter first date");
        int count1=0;
        int count2=0;
        Scanner sc = new Scanner(System.in);
        String firstDate= sc.next();
        System.out.println("enter second date");
        String secondDate=sc.next();
        double firstNumber =0.0;
        
        double secondNumber=0.0;
        for(int i=1;i<list.length;i++)
        {
            if(list[i].getDate().equals(firstDate))
            {
                String num1 = list[i].getClose();
                System.out.println(i);
                 firstNumber = Double.parseDouble(num1);
                count1++;

            }
        }
        for(int i=1;i<list.length;i++)
        {
            if(list[i].getDate().equals(secondDate))
            {
                String num1 = list[i].getClose();
                System.out.println(i);
                 secondNumber = Double.parseDouble(num1);
                count2++;

            }
        }
        if(count1==0)
        {
            System.out.println("Date does not exit");
        }
        if(count2==0)
        {
            System.out.println("Date does not exit");
        }
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        double absoluteDate=((secondNumber-firstNumber)/firstNumber)*100;
        System.out.println(absoluteDate);

	}

	public void setValue(Information[] list) {
        for(int i=1;i<list.length;i++)
        {
            if(list[i].getOpen().equals("null"))
            {
                list[i].setOpen("0.0");
            }
            if(list[i].getHigh().equals("null"))
            {
                list[i].setHigh("0.0");
            }
            if(list[i].getLow().equals("null"))
            {
                list[i].setLow("0.0");
            }
            if(list[i].getClose().equals("null"))
            {
                list[i].setClose("0.0");
            }
            if(list[i].getAdjClose().equals("null"))
            {
                list[i].setAdjClose("0.0");
            }
            if(list[i].getVolume().equals("null"))
            {
                list[i].setVolume("0.0");
            }
        }
	}

	public void highestStock(Information[] list) {
        double max=0.0;
        int counter =0;
        for(int i=1;i<list.length;i++)
        {
        if(max<Double.parseDouble(list[i].getClose()))
        {
            max=Double.parseDouble(list[i].getClose());
            counter =i;
        }
    }
        System.out.println(list[counter].getDate()+" "+list[counter].getClose()+" "+list[counter].getVolume());
	}

	public void lowestStock(Information[] list) {
        double max=1000000000;
        int counter =0;
        for(int i=1;i<list.length;i++)
        {
        if(max>Double.parseDouble(list[i].getClose()))
        {
            max=Double.parseDouble(list[i].getClose());
            counter =i;
        }
    }
        System.out.println(list[counter].getDate()+" "+list[counter].getClose()+" "+list[counter].getVolume());

	}

	public void average(Information[] list) {
        for(int i=1;i<list.length;i++)
        {
            System.out.print(i+" ");
            double open=Double.parseDouble(list[i].getOpen());
            double high = Double.parseDouble(list[i].getHigh());
            double low = Double.parseDouble(list[i].getLow());
            double close = Double.parseDouble(list[i].getClose());
            double adjClose =Double.parseDouble(list[i].getAdjClose());
            double average= (open+high+low+close+adjClose)/5;
            System.out.println(average);
        }
        System.out.println();
	}
    


    

    
}
