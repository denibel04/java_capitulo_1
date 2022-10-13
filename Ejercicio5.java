/**
 * Capítulo 1
 * Ejercicio 5: Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
 * de un color diferente.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
public class Ejercicio5 {
    public static void main (String[] args) {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String amarillo = "\033[93m";
        String azul = "\033[34m";
        String morado = "\033[95m";
        String celeste = "\033[96m";
        String blanco = "\033[37m";
        String negro = "\033[90m";

        System.out.println(blanco +"┌───────┬───────┬───────┬───────┬───────┐");
        System.out.println("│" + negro + "Lunes\t" + blanco + "│" + negro + "Martes\t" + blanco + "│" + negro + "Miérc.\t" + blanco + "│" + negro + "Jueves\t" + blanco + "│" + negro + "Viern.\t" + blanco + "│");
        System.out.println("├───────┼───────┼───────┼───────┼───────┤");
        System.out.println("│" + morado + "PROGR.\t" + blanco + "│" + celeste + "S.INFO\t" + blanco + "│" + azul + "E.D.\t" + blanco + "│" + morado + "PROGR.\t" + blanco + "│" + verde + "FOL.\t" + blanco + "│");
        System.out.println("├───────┼───────┼───────┼───────┼───────┤");
        System.out.println("│" + morado + "PROGR.\t" + blanco + "│" + celeste + "S.INFO\t" + blanco + "│" + azul + "E.D.\t" + blanco + "│" + morado + "PROGR.\t" + blanco + "│" + verde + "FOL.\t" + blanco + "│");
        System.out.println("├───────┼───────┼───────┼───────┼───────┤");
        System.out.println("│" + amarillo + "L.MAR.\t" + blanco + "│" + celeste + "S.INFO\t" + blanco + "│" + morado + "PROGR.\t" + blanco + "│" + amarillo + "L.MAR.\t" + blanco + "│" + verde + "FOL.\t" + blanco + "│");
        System.out.println("├───────┼───────┼───────┼───────┼───────┤");
        System.out.println("│" + amarillo + "L.MAR.\t" + blanco + "│" + morado + "PROGR.\t" + blanco + "│" + morado + "PROGR.\t" + blanco + "│" + amarillo + "L.MAR.\t" + blanco + "│" + celeste + "S.INFO\t" + blanco + "│");
        System.out.println("├───────┼───────┼───────┼───────┼───────┤");
        System.out.println("│" + rojo + "BBDD\t" + blanco + "│" + morado + "PROGR.\t" + blanco + "│" + rojo + "BBDD\t" + blanco + "│" + rojo + "BBDD\t" + blanco + "│" + celeste + "S.INFO\t" + blanco + "│");
        System.out.println("├───────┼───────┼───────┼───────┼───────┤");
        System.out.println("│" + rojo + "BBDD\t" + blanco + "│" + azul + "E.D.\t" + blanco + "│" + rojo + "BBDD\t" + blanco + "│" + rojo + "BBDD\t" + blanco + "│" + celeste + "S.INFO\t" + blanco + "│");
        System.out.println("└───────┴───────┴───────┴───────┴───────┘");
    }


}
