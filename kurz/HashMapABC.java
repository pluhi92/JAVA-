package com.zetcode;

import java.util.*;

public class HashMapABC {

    public static void main(String[] args) {
                                                //coding to interfaces
        Map<String, String> domains = new HashMap<>();

        domains.put("de", "Germany"); //de = kluc; Germany = hodnota (dva typy)
        domains.put("sk", "Slovakia");
        domains.put("us", "United States");
        domains.put("ru", "Russia");
        domains.put("hu", "Hungary");
        domains.put("pl", "Poland");
        

        var countries = domains.values();

        var myList = new ArrayList<>(countries);
        myList.sort(Collections.reverseOrder());
        myList.forEach(System.out::println);
        

    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import java.util.*;

public class HashMapABC2 {

    public static void main(String[] args) {
                                                //coding to interfaces
        Map<String, String> domains = new HashMap<>();

        domains.put("de", "Germany"); //de = kluc; Germany = hodnota (dva typy)
        domains.put("sk", "Slovakia");
        domains.put("us", "United States");
        domains.put("ru", "Russia");
        domains.put("hu", "Hungary");
        domains.put("pl", "Poland");


        var countries = domains.values();

        var myList = new ArrayList<>(countries);
        myList.sort(Collections.reverseOrder());
        myList.forEach(System.out::println);

        Collections.sort(myList);
        System.out.println("***************************");

        myList.forEach(System.out::println);

    }
}
