package com.pluhi;

public class Laptop {

    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
    
}

///////////////////////////////////////////////////////////////////////////////////////////

package com.pluhi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Laptop> laps = new ArrayList<>();

        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer ", 12, 700));

        Comparator<Laptop> com = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop l1, Laptop l2) {
                if (l1.getPrice() > l2.getPrice())
                    return 1;
                else return -1;
            }
        };

        Collections.sort(laps, com);


        for (Laptop l : laps) {
            System.out.println(l);
        }
    }
}
