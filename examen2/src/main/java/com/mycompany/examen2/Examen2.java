

package com.mycompany.programa_n;
import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Programa_n {


    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad al usuario
        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        // Evaluar la edad y mostrar el mensaje correspondiente
        if (edad >= 18) {
            System.out.println("MAYOR DE EDAD");
        } else if (edad >= 60) {
            System.out.println("TERCERA EDAD");
        } else if (edad < 3) {
            System.out.println("ES UN BEBÉ");
        } else {
            System.out.println("Edad intermedia"); // Mensaje por defecto si no cumple ninguna condición anterior
        }

        // Cerrar el Scanner para evitar fugas de recursos
        scanner.close();
  
    }
}