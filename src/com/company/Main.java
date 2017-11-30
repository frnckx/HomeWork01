package com.company;

public class Main {

    public static void main(String[] args) {
    /* Deklaráltam két int típusú változót, és ezzel az értékkel inicializáltam
 a perimeter és az area változókat, és kiírattam a konzolra */
        int numberA = 5;
        int numberB = 6;
        int perimeter = 2*(numberA+numberB);
        int area = numberA*numberB;
        System.out.println("A téglalap kerülete: " + perimeter);
        System.out.println("A téglalap területe: " + area);
    }
    }

