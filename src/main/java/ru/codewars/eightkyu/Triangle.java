package ru.codewars.eightkyu;

public class Triangle {
    public static char triangle(String row) {

        String nuevaBase = "";
        int contador = 0;
        char resultado = ' ';

        if (row.length() == 1) {

            resultado = row.charAt(0);
        }

        while (row.length() > 1) {
            for (int i = 0; i + 1 < row.length(); i++) {

                String red = "R";
                String green = "G";
                String blue = "B";

                char color1 = row.charAt(i);
                char color2 = row.charAt(i + 1);

                if (color1 == color2) {

                    nuevaBase	= nuevaBase.concat(String.valueOf(color1));
                } else if (color1 == 'R' && color2 == 'G') {
                    nuevaBase = nuevaBase.concat(blue);
                } else if (color1 == 'R' && color2 == 'B') {
                    nuevaBase	=  nuevaBase.concat(green);
                } else if (color1 == 'G' && color2 == 'R') {
                    nuevaBase	= 	nuevaBase.concat(blue);
                } else if (color1 == 'G' && color2 == 'B') {
                    nuevaBase	= 	nuevaBase.concat(red);
                } else if (color1 == 'B' && color2 == 'R') {
                    nuevaBase	= 	nuevaBase.concat(green);
                } else {
                    nuevaBase	= 	nuevaBase.concat(red);
                }
            }

            row = nuevaBase;
            nuevaBase = "";
            contador++;
            resultado = row.charAt(0);
        }

        return resultado;
    }
}
