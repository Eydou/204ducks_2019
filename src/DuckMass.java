/*
** EPITECH PROJECT, 2020
** 204ducks_2019
** File description:
** Math
*/

import java.util.Locale;

class DuckMass {
    static void printDuckMass(float givenNumber) {
         double totalDuckMassResult = 0.0;
         double halfDuckMassResult = 0.0;

         totalDuckMassResult = duckReturnTime(0.99, givenNumber);
         halfDuckMassResult = duckReturnTime(0.50, givenNumber);
         
         int totalTen = (int)totalDuckMassResult % 60 / 10;
         int totalUnit = (int)totalDuckMassResult % 10;
         int totalMinutes = (int)totalDuckMassResult / 60;

         int halfTen = (int)halfDuckMassResult % 60 / 10;
         int halfUnit = (int)halfDuckMassResult % 10;
         int halfMinutes = (int)halfDuckMassResult / 60;

         String oneMinPercentagePrint = String.format(Locale.ENGLISH, "%.1f%%\n", ((duckGeneralmass(givenNumber, 1) - duckGeneralmass(givenNumber, 0)) * 100));
         String twoMinPercentagePrint = String.format(Locale.ENGLISH, "%.1f%%\n", ((duckGeneralmass(givenNumber, 2) - duckGeneralmass(givenNumber, 0)) * 100));


        System.out.printf("Time after which 50%% of the ducks are back: %dm %d%ds\n", halfMinutes, halfTen, halfUnit);
        System.out.printf("Time after which 99%% of the ducks are back: %dm %d%ds\n", totalMinutes, totalTen, totalUnit);
        System.out.print("Percentage of ducks back after 1 minute: " + oneMinPercentagePrint);
        System.out.print("Percentage of ducks back after 2 minutes: " + twoMinPercentagePrint);
    }

    static double duckGeneralmass(double givenNumber, double time) {
        double result = 0.0;

        result = -givenNumber * (java.lang.Math.exp(-time)) - (4 - 3 * givenNumber) / 2 * java.lang.Math.exp(-2 * time) - (2 * givenNumber - 4) / 4 * java.lang.Math.exp(-4 * time);
        return (result);
    }

    static double duckReturnTime(double minimum, double givenNumber) {
        double i = 1.0;
        while (true) {
            if (duckGeneralmass(givenNumber, i / 60) - duckGeneralmass(givenNumber, 0) >= minimum) {
                return (i);
            }
            i += 0.01;
        }
    }
}