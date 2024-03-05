import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url11 = "https://t2.genius.com/unsafe/655x0/https%3A%2F%2Fimages.genius.com%2F13982da7e2d5a31c47f43728144abe40.1000x1000x1.png";
        String url12 = "https://genius.com/Yeat-psycho-ceo-lyrics";
        String url22 = "https://genius.com/Yeat-power-trip-lyrics";
        String url32 = "https://genius.com/Yeat-breathe-lyrics";
        String url42 = "https://genius.com/Yeat-more-lyrics";
        String url52 = "https://genius.com/Yeat-bought-the-earth-lyrics";
        String url62 = "https://genius.com/Yeat-nothing-change-lyrics";
        ArrayList<Song> songs = new ArrayList<>();
        Song song1  = new Song("Psycho CEO", "Yeat", 2024, url11, "Lyfestyle Corporation", url12,true, 3.46);
        Song song2 = new Song("Power Trip", "Yeat", 2024, url11, "Lyfestyle Corporation", url22,true, 2.46);
        Song song3 = new Song("Breathe", "Yeat", 2024, url11, "Lyfestyle Corporation", url32,true, 2.51);
        Song song4 = new Song("Morë", "Yeat", 2024, url11, "Lyfestyle Corporation", url42,true, 2.46);
        Song song5 = new Song("Bought The Earth", "Yeat", 2024, url11, "Lyfestyle Corporation", url52,true, 2.59);
        Song song6 = new Song("Nothing Changë", "Yeat", 2024, url11, "Lyfestyle Corporation", url62,true, 2.58);
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        songs.add(song6);
        MusicAlbums yeat_2093 = new MusicAlbums("2093", "Yeat", 2024, url11,"Lyfestyle Corporation", songs);
        Podcasts about2093 = new Podcasts("About Yeat\'s", "Akims Family", 2024, 30.24, "Talking about Yeat\'s new ablum 2093. Best album of the year?", 'a');
        Scanner sc = new Scanner(System.in);
        System.out.println(about2093.returnInfo());
        System.out.println(yeat_2093.returnInfo());
        int i = 1;
        System.out.println("Write number from 1-6( 0 to exit): ");
        while (i <= 6 && i >= 1) {
            i = sc.nextInt();
            switch (i) {
                case 0:
                    break;
                case 1:
                    System.out.println(song1.returnInfo());
                    break;
                case 2:
                    System.out.println(song2.returnInfo());
                    break;
                case 3:
                    System.out.println(song3.returnInfo());
                    break;
                case 4:
                    System.out.println(song4.returnInfo());
                    break;
                case 5:
                    System.out.println(song5.returnInfo());
                    break;
                case 6:
                    System.out.println(song6.returnInfo());
                    break;
                default:
                    System.out.println("Write number from 1-6: ");
                    i = 1;
            }
        }
        System.out.println("Goodbye!!!");
        try {
            FileWriter fw1 = new FileWriter("2093.txt");
            fw1.write(yeat_2093.returnInfo());
            fw1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}