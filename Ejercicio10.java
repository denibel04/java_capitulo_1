/**
 * Capítulo 1
 * Ejercicio 10: Mejora el ejercicio anterior añadiéndole colores.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 *
 */
public class Ejercicio10 {
    public static void main (String[] args) {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String amarillo = "\033[93m";
        String azul = "\033[34m";
        String morado = "\033[95m";
        String celeste = "\033[96m";
        String blanco = "\033[37m";
        String negro = "\033[90m";


        System.out.println(azul + "░░░░░" + blanco + "╔╗╔╗" + azul + "░░░░░░░░░░░░░");
        System.out.println("░░░░░" + blanco + "║║║║" + azul + "░░░░░░░░░░░░░");
        System.out.println("░░░░" + blanco + "╔╝╚╝╚╗" + azul + "░░░░░░░░░░░░");
        System.out.println("░░░░" + blanco + "║" + negro + "▀▄▀" + morado + "░" + blanco + "╠═════╦╗" + azul + "░░░░░");
        System.out.println("░░░░" + blanco + "╚╦═══╝░░░░░╠╝" + azul + "░░░░░");
    }
}

