
public class PrimeNumber {

    public static void main(String[] args) {

        int num = ;          //Enter your number
        boolean isPrime = true;

        System.out.println("Number: " + num);
        System.out.println();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;

                break;
            }
        }
        if (isPrime) {
            System.out.println("Is a Prime number");
        } else {
            System.out.println("Is not a Prime number");
        }
    }
}
