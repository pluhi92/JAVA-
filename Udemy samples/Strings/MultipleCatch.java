
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleCatch {
    public static void main(String[] args) {

        int i, j, k = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        i = 8;

        try {

            j = Integer.parseInt(br.readLine());
            k = i / j;

        } catch (IOException e) {
            System.out.println("IO Error");

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error " + e);

        } catch (Exception e) {
            System.out.println("Unknown Exeption ");

        } finally {
            System.out.println("|");

        }
        System.out.println(k);
    }
}
