

public class Direction {
    MusicNode startPtr;
    public void backwordTraversal(DoubleLinkedList a) {
       
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
            System.out.println("hii");
            current = current.prev;
            System.out.println("hello");
        }
    
}
public void forwordTraversal(DoubleLinkedList a) {
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
}
