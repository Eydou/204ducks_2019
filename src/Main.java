/*
** EPITECH PROJECT, 2020
** Main.java
** File description:
** main for 204ducks
*/

class Main {
    public static float number;
    static boolean isInteger(String s) {
        boolean isNumber = s.matches("[+]?[0-9]*\\.?[0-9]+");

        if(s.isEmpty())
            return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1)
                    return false;
            }
        }
        if (isNumber)
        number = Float.valueOf(s.trim()).floatValue();
        if (number > 2.5)
            return false;
        return isNumber;
        }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: Bad number of arguments.");
            System.exit(84);
        } else if ("-h".equals(args[0])) {
            System.out.println("USAGE");
            System.out.println("\t./204ducks a\n");
            System.out.println("DESCRIPTION");
            System.out.println("\ta\tconstant");
            System.exit(0);
        } else {
            if (isInteger(args[0])) {
                Math math = new Math();
               math.Calcul(number);
               System.exit(0);
            }
            System.err.println("Please enter valid argument");
            System.exit(84);
        }
    }
}