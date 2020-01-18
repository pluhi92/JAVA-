package com.zetcode;

import java.io.IOException;


public class runProgram {


    public static void main(String[] args) throws IOException {

      Runtime.getRuntime().exec("notepad.exe");
      
    }
}
//////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import java.io.IOException;

public class runProgram2 {


    public static void main(String[] args) throws IOException, InterruptedException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("notepad.exe");

        var process = processBuilder.start();

        var ret = process.waitFor();

        System.out.printf("Program exited with code: %d", ret);
    }
}
