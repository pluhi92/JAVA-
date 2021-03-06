package com.zetcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;

// latin characters only

public class ImportData2 {

    public static void main(String[] args) throws IOException {

        var path = Paths.get("src/resources/words.txt");

        List<String> lines = Files.readAllLines(path);

        lines.forEach(line -> System.out.println(line));
        System.out.println("**********************************");
        lines.forEach(System.out::println);


    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;

// latin characters only

public class SimpleEx2 {

    public static void main(String[] args) throws IOException {

        var path = Paths.get("src/resources/words.txt");

        List<String> lines = Files.readAllLines(path);

        //lines.forEach(line -> System.out.println(line));
        //System.out.println("**********************************");

        lines.forEach(System.out::println);

    }
        private static void upperWords(String word) {

            System.out.println(word.toUpperCase());
        }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;


public class ImportData2 {

    public static void main(String[] args) throws IOException {

        var path = Paths.get("src/resources/words.txt");

        List<String> lines = Files.readAllLines(path);

        //lines.forEach(line -> System.out.println(line));
        //System.out.println("**********************************");

        lines.forEach(SimpleEx2::upperWords);
        lines.forEach(item -> upperWords(item));

    }
        private static void upperWords(String word) {

            System.out.println(word.toUpperCase());
        }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;



public class ImportData2 {

    public static void main(String[] args) throws IOException {

        //var path = Paths.get("src/resources/words.txt");

        // List<String> lines = Files.readAllLines(path);

        try (var br = new BufferedReader(new FileReader("src/resources/words.txt",
                StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {

                System.out.println(line);
            }
        }

    }
}
