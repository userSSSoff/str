import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Song song = new Song();
        song.setText(stringBuilder.toString());
        song.setAuthor("Halsey");
        song.setTitle("Withour me.");
        song.setText("Found you when your heart was broke.\n" +
                "I filled your cup until it overflowed.\n" +
                "Took it so far to keep you close (Keep you close).\n" +
                "I was afraid to leave you on your own (Ooh).");

        try (FileWriter fileWriter = new FileWriter("test.txt")) {
            System.out.println(song);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader fileReader = new FileReader("test.txt")) {
            Scanner scanner = new Scanner(fileReader);
           // song.setAuthor(scanner.nextLine());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }


    }
}