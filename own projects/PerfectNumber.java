

public class PerfectNumber {

    public static void main(String[] args) {

        int n = ;                       //Enter your number
        boolean b = isPerfect(n);

        System.out.println("Number: " + n);

        if (b)
            System.out.println("It's a perfect Number");
        else
            System.out.println("It's not a perfect Number");

        }

    public static boolean isPerfect(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        if (n == sum)
            return true;

            return false;
    }
}



