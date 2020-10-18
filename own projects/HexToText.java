package com.pluhi;

import java.nio.charset.StandardCharsets;

public class HexToText {

    private static final String MESSAGE =
            "4920616d20746f74616c6c7920656e637279707465642e";  //Hexadecimal numbers to text (http://www.unit-conversion.info/texttools/hexadecimal/)

    public static void main(String[] args) {

        System.out.println(getMessage());
    }

    private static String getMessage() {
        byte[] byteArray = new byte[HexToText.MESSAGE.length() / 2];
        for (int i = 0; i < byteArray.length; i++) {
            String substring = HexToText.MESSAGE.substring(i * 2, i * 2 + 2);
            int decimal = Integer.parseInt(substring, 16);
            byteArray[i] = (byte) decimal;
        }
        return new String(byteArray, StandardCharsets.UTF_8);
    }
}
