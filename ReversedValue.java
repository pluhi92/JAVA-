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
