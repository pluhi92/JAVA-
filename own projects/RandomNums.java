
import java.util.Random;

public class RandomNums {       //RANDOM NUMS BETWEEN 1 AND 100 IN 3 LINES

    public static void main(String[] args) {

        Random rn = new Random();
        Random rn1 = new Random();
        Random rn2 = new Random();


        for (int i = 0; i < 10; i++) {
            int answer = rn.nextInt(100) + 1;
            System.out.print(" |" + answer + "| ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------|");

        for (int j = 0; j < 10; j++) {
            int answer1 = rn1.nextInt(100) + 1;
            System.out.print(" |" + answer1 + "| ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------|");


        for (int k = 0; k < 10; k++) {
            int answer2 = rn2.nextInt(100) + 1;
            System.out.print(" |" + answer2 + "| ");

        }
        System.out.println();
        System.out.println();

    }

}

