package com.zetcode;

import java.io.IOException;


public class ReversedValue {

    public static void main(String[] args) throws IOException {

        int value = 23456;

        var sb = new StringBuilder();
        sb.append(value);
        var sb_reversed = sb.reverse();
        var reversed = sb_reversed.toString();

        int reversedValue = Integer.parseInt(reversed);

        System.out.println(reversedValue);


    }
}

///////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import java.io.IOException;


public class ReversedValue2 {

    public static void main(String[] args) throws IOException {

        int value = 23456;

        String str_value = Integer.toString(value);

        char[] elements = str_value.toCharArray();

        char[] reversed_elements = new char[elements.length];

       // reversed_elements[0] = elements[elements.length-1];
      //  reversed_elements[1] = elements[elements.length-2];

            for (int i = elements.length - 1, j=0; i>=0 ; i--, j++) {
                reversed_elements[j] = elements[i];

            }

            String reversedStr = new String(reversed_elements);
            int rev_value = Integer.parseInt(reversedStr);

            System.out.println(rev_value);
    }
}
