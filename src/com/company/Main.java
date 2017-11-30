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
        /* Deklaráltam egy int típusú változót, ezt az értéket beszoroztam a különböző váltószámokkal, és inicializáltam
 a ml, cl, l, hectol változókat, és kiírattam őket a konzolra */

        int dl = 146;
        int ml = dl*100;
        int cl = dl*10;
        double l = dl*0.1;
        double hectol = dl*0.001;
        System.out.println(dl + " dl= " + ml + " ml");
        System.out.println(dl + " dl= " + cl + " cl");
        System.out.println(dl + " dl= " + l + " l");
        System.out.println(dl + " dl= " + hectol + " hectoliter");


        /* Deklaráltam egy int és egy double típusú változót, a gömb térfogatának képletét felhasználva inicializáltam
         * a volume változót és kiírattam a konzolra */
        int r = 5 ;
        double pi = 3.14159265359;
        double volume = (4*r*r*r*pi)/3;
        System.out.println("A " + r + " sugarú gömb térfogata: " + volume);


        /* Deklaráltam két float típusú változót, a Fahrenheit és Celsius fokok átszámításának képletével inicializáltam
        * a celsius és a fahrenheit változókat és kiírattam őket a konzolra.*/

        float celsiusInput = 35;
        float fahrenheitInput = 100;
        float celsius = (fahrenheitInput- 32)*5/9;
        float fahrenheit = celsiusInput*9/5+32;

        System.out.println(celsiusInput + " Celsius= " + fahrenheit + " Fahrenheit");
        System.out.println(fahrenheitInput + " Fahrenheit= " + celsius + " Celsius");


        /* a /n segítségével kírattam a Hello World szöveget egy keretben */

        System.out.println("************\n* Hello    *\n* World    *\n* in       *\n* a        *\n* frame    *\n************");









    }
    }

