public class Song extends MusicAlbums{
    private String urlToText;
    private boolean IfExplicitContent;

    public String getUrlToText() {
        return urlToText;
    }

    public void setUrlToText(String urlToText) {
        this.urlToText = urlToText;
    }

    public boolean isIfExplicitContent() {
        return IfExplicitContent;
    }

    public void setIfExplicitContent(boolean ifExplicitContent) {
        IfExplicitContent = ifExplicitContent;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    private double duration;

    public Song(String name, String author, int yearOfCreating, String urlToCover, String NameOfLabel, String urlToText, boolean ifExplicitContent, double duration) {
        super(name, author, yearOfCreating,urlToCover,NameOfLabel, null);
        this.urlToText = urlToText;
        this.IfExplicitContent = ifExplicitContent;
        this.duration = duration;
    }
    public String returnInfo() {
        return ("Name = "+ getName()+"\n" +
                "Author = "+ getAuthor()+"\n" +
                "Year of creating = "+ getYearOfCreating()+"\n" +
                "Covers url = "+getUrlToCover()+"\n" +
                "Name of Label = "+getNameOfLabel()+"\n" +
                "Url to text = "+urlToText+"\n" +
                "Explicit Content = "+IfExplicitContent+"\n" +
                "Duration = "+duration);
    }
}
