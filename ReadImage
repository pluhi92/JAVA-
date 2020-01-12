
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadImage {
    public static void main(String[] args) throws IOException {

        var path = Paths.get("src/resources/favicon.ico");

        byte[] data = Files.readAllBytes(path);
        int i = 0;

        for (byte c : data) {

            System.out.printf("%02x ", c);

            i++;

            if (i % 16 == 0) {

            System.out.println();
            }
        }
    }
}

