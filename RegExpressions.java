import java.util.Arrays;

public class RegExpressions {


        public static void main(String[] args) {

            var msg = "Today is a beatiful day";

           String[] parts = msg.split("\\s(1,9)");

           System.out.println(Arrays.toString(parts));
        }
    }
