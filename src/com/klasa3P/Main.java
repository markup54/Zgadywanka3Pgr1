package com.klasa3P;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w Javie");
        //komentarz jednoliniowy
        /*
        komentarz wieloliniowy
         */
        /**
         * javadoc
         */
        int wylosowana =(int)( Math.random()*100+1);
                //random() losuje liczbę rzeczywistą z zakresu <0,1)
        //rzutowanie zawężające
        double innnaLiczba =wylosowana;//konwersja rozszerzająca
        System.out.println("Wylosowano "+wylosowana);

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int wczytana;
        wczytana = klawiatura.nextInt();
        System.out.println("wpisałeś "+wczytana);
    }
}
