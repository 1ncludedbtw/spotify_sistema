public class Podcasts extends AudioContent{
    private double duration;
    private String infoAbout;
    private char Type; // (i - Interwiev, b - books;

    public Podcasts(String Name, String Author, int YearOfCreating, double duration, String infoAbout, char type) {
        super(Name, Author, YearOfCreating);
        this.duration = duration;
        this.infoAbout = infoAbout;
        this.Type = type;
    }

    public String returnInfo() {
        String str = "Podcasts" +
                "Name: " + getName() + '\n' +
                "Author: " + getAuthor() + '\n' +
                "YearOfCreating: " + getYearOfCreating() + " year\n"+
                "Duration: " + duration + " min\n"+
                "Information about: " + infoAbout + '\n' +
                "Type: ";
                if (Type == 'a') str += "Ablum podcast";
                else if (Type == 'b') str += "Books podcast";
                else if (Type == 'i') str += "Interview podcast";
        return str + "\n";
    }
}
