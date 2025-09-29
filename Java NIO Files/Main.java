import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("lookup.txt");

            List<String> words = Files.readAllLines(p);
            words.forEach(data -> System.out.println(data));

            Files.write(p, "\nTHIS APPENED ALL".getBytes(), StandardOpenOption.CREATE,StandardOpenOption.APPEND);

        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}