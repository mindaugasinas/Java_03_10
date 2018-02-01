package com.company;

import java.util.Scanner;

public class Main {
    public static final int ACTION_SUDETIS = 1;
    public static final int ACTION_ATIMTIS = 2;
    public static final int ACTION_DAUGYBA = 3;
    public static final int ACTION_PAKARTOT = 5;

    public static void main(String[] args) {


        Main objektas = new Main();
        objektas.skaiciuok();


    }

    public void skaiciuok() {
        boolean arTesti = true;
        Scanner sc = new Scanner(System.in);
        while (arTesti == true) {
            System.out.println("Iveskite du skaicius");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            System.out.println("Iveskite norima veiksma");
            System.out.println("1 - Suma");
            System.out.println("2 - Skirtumas");
            System.out.println("3 - Sandauga");
            int veiksmas = sc.nextInt();

            switch (veiksmas) {
                case ACTION_SUDETIS:
                    System.out.println(a + b);
                    break;

                case ACTION_ATIMTIS:
                    System.out.println(a - b);
                    break;

                case ACTION_DAUGYBA:
                    System.out.println(a * b);
                    break;

            }
            System.out.println("Iveskite ar norite kartoti");
            System.out.println("5 - Kartoti");
            int kartojimoSkaicius = sc.nextInt();

            if (kartojimoSkaicius != ACTION_PAKARTOT) {
                arTesti = false;
            }


        }
    }
}
