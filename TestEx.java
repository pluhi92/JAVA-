package com.zetcode;

import java.util.Scanner;

public class TestEx {

public static void main(String[] args) {

menu();
var input = readInput();

switch (input) {

case "1" -> romanNumerals();
case "2" -> sortValues();
case "3" -> maxMinSum();

default -> System.out.println("unknown option");
}
}

private static void maxMinSum() {

System.out.println("maxMinSum");
}

private static void sortValues() {

System.out.println("sortValues");

}

private static void romanNumerals() {

System.out.println("romanNumerals");
}


private static void menu() {

var options = """
1 - Roman numerals
2 - Sort value
3 - Max, min, sum
""";

System.out.println(options);
}

private static String readInput() {

var scanner = new Scanner(System.in);
return scanner.nextLine();
}
}
