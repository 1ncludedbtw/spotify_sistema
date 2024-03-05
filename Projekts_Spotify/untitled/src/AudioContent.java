public class AudioContent {
    public AudioContent(String Name, String Author, int YearOfCreating) {
        this.Name = Name;
        this.Author = Author;
        this.YearOfCreating = YearOfCreating;
    }
    private String Name;
    private String Author;
    private int YearOfCreating;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getYearOfCreating() {
        return YearOfCreating;
    }

    public void setYearOfCreating(int yearOfCreating) {
        YearOfCreating = yearOfCreating;
    }
}
