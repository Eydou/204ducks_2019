/*
** EPITECH PROJECT, 2020
** 204ducks_2019
** File description:
** Math
*/

public class Math {
    double f(double a, double t)
    {
        return (java.lang.Math.exp(-t) - (4 - 3 * a) / 2 * java.lang.Math.exp(-2 * t) - (2 * a - 4) / 4 * java.lang.Math.exp(-4 * t));
    }

    /*double integrationSimpson(double nb)
    {

    }*/

    /*double averageTime(double a)
    {
    double res = 0.0;

   // print("mean return time: %dm %.2ds" % (res, (res * 60) % 60))
    }*/

    public static void Calcul(double nb) {
        System.out.println(nb);
    }
}