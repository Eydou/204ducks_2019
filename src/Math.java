/*
** EPITECH PROJECT, 2020
** 204ducks_2019
** File description:
** Math
*/

import java.util.Locale;

public class Math {
    public static double averageT;

    static double f(double a, double t)
    {
        return (a * java.lang.Math.exp(-t) + (4 - 3 * a) *
        java.lang.Math.exp(-2 * t) + (2 * a - 4) * java.lang.Math.exp(-4 * t));
    }

    static void standardDevation(double a)
    {
         double res = 0.0;

        for (double t = 0; t < 100.0; t += 0.001, res += java.lang.Math.pow(t - averageT, 2) * f(a, t) / 1000);

        res = java.lang.Math.sqrt(res);
        String resPrint = String.format(Locale.ENGLISH, "%.3f\n", res);
        System.out.print("Standard deviation: " + resPrint);
    }

    static void averageTime(double a)
    {
        double res = 0.0;

        for (double t = 0; t < 1000.0; t += 0.1, res += f(a, t) * t / 10, averageT = res);
    
        System.out.println("Average return time: " + (int)res + "m " +
        java.lang.Math.round(java.lang.Math.ceil((res - (int)res) * 60)) + "s");
    }

    public static void Calcul(double nb) {
        averageTime(nb);
        standardDevation(nb);
    }
}