public class ArmstrongNumber {

    public static void main(String[] args) {

        int n = ;   //Enter your number
        int temp = n;
        int r, sum = 0;

        System.out.println("Your number is: " + n);

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;

        }
        if (temp == sum)
            System.out.println("It's a Armstrong number");
        else {
            System.out.println("It's not a Armstrong number");

        }
    }
