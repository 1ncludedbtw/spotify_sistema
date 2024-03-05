import java.util.ArrayList;

public class MusicAlbums extends AudioContent{
    private int TrackAmount;
    private String urlToCover;
    private String NameOfLabel;
    private ArrayList<Song> songsInAlbum;

    public MusicAlbums(String name, String author, int yearOfCreating, String urlToCover, String NameOfLabel, ArrayList<Song> songsInAlbum) {
        super(name, author, yearOfCreating);
        this.urlToCover = urlToCover;
        this.NameOfLabel = NameOfLabel;
        this.songsInAlbum = songsInAlbum;
    }


    public int getTrackAmount() {
        return TrackAmount;
    }

    public void setTrackAmount(int trackAmount) {
        TrackAmount = trackAmount;
    }

    public String getUrlToCover() {
        return urlToCover;
    }

    public void setUrlToCover(String urlToCover) {
        this.urlToCover = urlToCover;
    }

    public String getNameOfLabel() {
        return NameOfLabel;
    }

    public void setNameOfLabel(String nameOfLabel) {
        NameOfLabel = nameOfLabel;
    }

    public ArrayList<Song> getSongsInAlbum() {
        return songsInAlbum;
    }

    public void setSongsInAlbum(ArrayList<Song> songsInAlbum) {
        this.songsInAlbum = songsInAlbum;
    }

    public double calculateDurationOfAlbum() {
        int temp = 0;
        int min = 0;
        int tempSec = 0;
        for (Song i : songsInAlbum) {
             min += (int) i.getDuration();
             tempSec += (int) ((i.getDuration()*100)%100);
        }
        int minInTempSec = tempSec/60;
        return min+minInTempSec+((tempSec-minInTempSec*60)/100.);
    }

    public String returnInfo () {
        String songs = "";
        int a = 1;
        for (Song i: songsInAlbum) {
            songs += "\t"+a+++") "+i.getName() +" "+i.getDuration()+" \n";

        }
        return ("Name = "+ getName()+"\n" +
                "Author = "+ getAuthor()+"\n" +
                "Year of creating = "+ getYearOfCreating()+"\n" +
                "Covers url = "+urlToCover+"\n" +
                "Name of Label: "+NameOfLabel+"\n" +
                "Duration of album: "+calculateDurationOfAlbum()+" min\n"+
                "Songs in album: \n") + songs;
    }
}
