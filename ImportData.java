import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImportData {


    public static void main(String[] args) throws IOException {

        var path = Paths.get("src/resources/data.txt");
        String content = Files.readString(path);

        String[] parts = content.split("[,\\s]{1,3}");

        int sum = 0;

        for (String part : parts) {

            sum += Integer.parseInt(part);

        }
            System.out.println(sum);

    }
}
