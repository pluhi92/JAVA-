public class Pyramid {
    public static void main(String[] args) {

        String val = "0";

        System.out.println(val.repeat(1));
        System.out.println(val.repeat(3));
        System.out.println(val.repeat(5));
        System.out.println(val.repeat(7));
    }
}

/////////////////////////////////////////////////////////////////////////////////


public class Pyramid2 {
    public static void main(String[] args) {

        String val = "0";

        System.out.printf("%12s%n", val);
        System.out.printf("%12s%n", val.repeat(3));
        System.out.printf("%12s%n", val.repeat(5));
        System.out.printf("%12s%n", val.repeat(7));
        System.out.printf("%12s%n", val.repeat(9));
        System.out.printf("%12s%n", val.repeat(11));
    }
}

///////////////////////////////////////////////////////////////////////////////////////

public class Pyramid3 {
    public static void main(String[] args) {

        String val = "0";
        String empty = " ";

        int len = 19;

        for (int i = 1; i < len; i += 2) {

            System.out.printf("%s%s%n", empty.repeat(len-i / 2), val.repeat(i));
            
        }

    }
}
