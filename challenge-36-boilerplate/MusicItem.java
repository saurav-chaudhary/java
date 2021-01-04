public class MusicItem
{
   String releaseType;
   String  artist;
   String  musicItemName;
   String genre;
   String yearOfRelease;
   String numberOfSongs;
    String totalPlayingTime;

    public String getReleaseType() {
        return releaseType;
    }

    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMusicItemName() {
        return musicItemName;
    }

    public void setMusicItemName(String musicItemName) {
        this.musicItemName = musicItemName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(String numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public String getTotalPlayingTime() {
        return totalPlayingTime;
    }

    public void setTotalPlayingTime(String totalPlayingTime) {
        this.totalPlayingTime = totalPlayingTime;
    }

    @Override
    public String toString() {
        return "MusicItem [artist=" + artist + ", genre=" + genre + ", musicItemName=" + musicItemName
                + ", numberOfSongs=" + numberOfSongs + ", releaseType=" + releaseType + ", totalPlayingTime="
                + totalPlayingTime + ", yearOfRelease=" + yearOfRelease + "]";
    }
    
}