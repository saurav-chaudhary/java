import java.util.Scanner;

public class DoubleLinkedList {

    MusicNode startPtr;
	public void insertData(MusicItem data) {
     
        MusicNode current;
        MusicNode newNode=new MusicNode(data);
        if(startPtr==null)
        {
            startPtr=newNode;
            newNode.prev=null;
            // startPtr=newNode;
            // startPtr.prev=null;
        }
        else{
            newNode.next=startPtr;
            startPtr=newNode;
            startPtr.prev=null;
            // newNode.next=startPtr;
            // startPtr.prev=newNode;
            // startPtr=newNode;

        }
        
	}
	
	public void isAssendingOrder() {
        MusicItem temp;
        MusicNode current=startPtr;
        MusicNode index=null;
        if(startPtr==null)
        {
            System.out.println("list is empty");
        }
        else
        {
            while(current!=null)
        {
            index=current.next;
            while(index!=null)
            {
                if(current.musicList.getArtist().compareTo(index.musicList.getArtist())>0)
                {
                    temp=current.musicList;
                    current.musicList=index.musicList;
                    index.musicList=temp;
                }
                  index=index.next;
            }
            current=current.next;

        }
        }
	}
	public void backwordTraversal() {
       
            MusicNode current = startPtr;
            if(current == null)
                return;
            while(current.next!=null)
            {
                current = current.next;
            }
            while(current!=null)
            {
                System.out.print(current.musicList+" ");
               
                current = current.prev;
            
            }
        
	}
	public void forwordTraversal() {
        MusicNode current=startPtr;
        if(startPtr==null)
        {
            return;
        }
        while(current!=null)
        {
            // System.out.println(current.musicList.getReleaseType()+" "+current.musicList.getArtist()+" "+current.musicList.getMusicItemName()+" "+current.musicList.getGenre()+" "+current.musicList.getYearOfRelease()+" "+current.musicList.getNumberOfSongs()+" "+current.musicList.getTotalPlayingTime());
            System.out.println(current.musicList);
            current = current.next;
        }
    }

	public void searchArtist() {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your artist name ");
        String artist=sc.nextLine();
        MusicNode current=startPtr;
        MusicNode next;
        while(current!=null)
        {
        
           if(current.musicList.getArtist().equals(artist))
           {
           
            System.out.println(current.musicList);
     
           }
           current = current.next;
	}
   
    
}
public void searchGenere() {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your artist name ");
    String genere=sc.nextLine();
    MusicNode current=startPtr;
    MusicNode next;
    while(current!=null)
    {
    
       if(current.musicList.getArtist().equals(genere))
       {
       
        System.out.println(current.musicList);
 
       }
       current = current.next;
}


}
public void searchAlbum() {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your artist name ");
    String album=sc.nextLine();
    MusicNode current=startPtr;
    MusicNode next;
    while(current!=null)
    {
    
       if(current.musicList.getArtist().equals(album))
       {
       
        System.out.println(current.musicList);
 
       }
       current = current.next;
}


}
}
