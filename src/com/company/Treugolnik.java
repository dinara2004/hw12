package com.company;

public class Treugolnik {
    int a;
    int b;
    int c;

    void area() {
        int p = (a + b + c) / 2;
        System.out.println("Perimetr treugolnika = " + p);
        System.out.println("Ploshad treugolnika = " + Math.round(Math.sqrt(p * (p - a) * (p - b) * (p - c))));

    }
}
