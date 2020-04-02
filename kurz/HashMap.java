package com.zetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap {

    public static void main(String[] args) {
                                                //coding to interfaces
        Map<String, String> domains = new HashMap<>();

        domains.put("de", "Germany"); //de = kluc; Germany = hodnota (dva typy)
        domains.put("sk", "Slovakia");
        domains.put("us", "United States");
        domains.put("ru", "Russia");
        domains.put("hu", "Hungary");
        domains.put("pl", "Poland");

       // System.out.println(domains.get("pl"));

        for (String item : domains.values()) {

            System.out.println(item);
        }

        Set keys = domains.keySet();

        System.out.println(keys);
    }
}
