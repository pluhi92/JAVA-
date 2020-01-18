package com.zetcode;

import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class MaxMinValues {

    public static void main(String[] args) throws IOException {

        List<Integer> vals = List.of(3, 4, 2, 1, 8, 9, 12, 11, 7, 6);

       int max = Collections.max(vals);
       int min = Collections.min(vals);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);


    }
}

///////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import java.io.IOException;
import java.util.List;


public class MaxMinValues2 {

    public static void main(String[] args) throws IOException {

        List<Integer> vals = List.of(3, 4, 2, 1, 8, 9, 12, 11, 7, 6);

        int min = findMin(vals);
        int max = findMax(vals);

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

    }

    public static int findMin(List<Integer> vals) {

        int min = vals.get(0);

        for (var val : vals) {
            if (val < min) {
                min = val;

            }
        }

        return min;
    }

    public static int findMax(List<Integer> vals) {

        int max = vals.get(0);
        for (var val : vals) {
            if (val > max) {
                max = val;
            }
        }

        
        return max;
    }
}
