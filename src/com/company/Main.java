package com.company;

public class Main {

    public static void main(String[] args) {

        Uchburchtuk ayant = new Uchburchtuk();

        ayant.a = 8;
        ayant.b = 8;
        ayant.c = 10;

        System.out.println("Uch burchtuktun jaktari: " + ayant.a + "," + ayant.b + "," + ayant.c);

        ayant.area(ayant.a, ayant.b, ayant.c);

    }
}
