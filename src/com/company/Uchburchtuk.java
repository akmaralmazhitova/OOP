package com.company;

public class Uchburchtuk {
    int a;
    int b;
    int c;

    void area(int a, int b, int c){
        int p = (a+b+c)/2;
        double s = p*(p-a)*(p-b)*(p-c);
        System.out.println("Uch burchtuktun ayanti: "+ Math.sqrt(s));
    }


}
