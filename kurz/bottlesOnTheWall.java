package com.zetcode;


import java.text.MessageFormat;


public class bottlesOnTheWall {

    
            static String bottles(int n) {
                return MessageFormat.format("{0,choice,0#No more bottles|1#One bottle|2#{0} bottles} of beer", n);
            }

            public static void main(String[] args) {
                
                String bottles = bottles(99);
                
                for (int n = 99; n > 0; ) {
                    System.out.println(bottles + " on the wall");
                    System.out.println(bottles);
                    System.out.println("Take one down, pass it around");
                    bottles = bottles(--n);
                    System.out.println(bottles + " on the wall");
                    System.out.println();
                    
                }
            }
        }
        
        /////////////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

public class bottlesOnTheWal2 {


    public static void main(String[] args) {

        // 99 bottles of beer on the wall, 99 bottles of beer.
        // Take one down, pass it around, 98 bottles of beer on the wall

        int nOfbottles = 99;

        for (int i = nOfbottles; i >= 1; i--) {

            if (i == 1) {

                System.out.printf("%d bottle of beer on the wall, %d bottle of beer.%n", i, i);
                System.out.println("Take one down, pass it around, no bottles of beer on the wall.");
                System.out.println();

            } else {

                System.out.printf("%d bottles of beer on the wall, %d bottles of beer.%n", i, i);
                System.out.printf("Take one down, pass it around, %d bottles of beer on the wall.%n", i - 1);
                System.out.println();
            }
        }
    }
}
        
        
