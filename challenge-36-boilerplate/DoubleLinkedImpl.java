import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DoubleLinkedImpl {
    public static DoubleLinkedList readFile(String fileName) {
       // File file = new File(fileName);
        DoubleLinkedList   dl=new DoubleLinkedList();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            String[] arr;
         
            
                    while ((line = br.readLine()) != null) {
                    arr = line.split(", ");
                    MusicItem mn = new MusicItem();
                    for (int i = 0; i < 9; i++) {
                    mn.setReleaseType(arr[0]);
                 
                    mn.setArtist(arr[1]);
                    mn.setMusicItemName(arr[2]);
                    mn.setGenre(arr[3]);
                    mn.setYearOfRelease(arr[4]);
                    mn.setNumberOfSongs(arr[5]);
                    mn.setTotalPlayingTime(arr[6]);
                
                }
                    dl.insertData(mn);
              

            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return dl;
    }

    public static void main(String[] args) {
        DoubleLinkedList list = readFile("data/music-catalog.csv");
       
        list.isAssendingOrder();
      
       

        System.out.println("enter choice of direction 1. forward , 2.backword");
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1)
        {
            list.forwordTraversal();
        }
        else if(choice==2)
        {
            list.backwordTraversal();
        }
        else
        {
            System.out.println("invalid choice");
        }
      
        list.searchArtist();


    }

}
