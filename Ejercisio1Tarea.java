package programas;
import java.util.Scanner;
public class Ejercisio1Tarea {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        //declaración de variables
        int numero;
        String palabra = "";

        // Entrada de datos
        System.out.print("Ingresa un numero entre 1 y 5: ");
        numero = lectura.nextInt();

        // Proceso: Convertir número a palabra
        switch (numero) {
            case 1: palabra = "uno"; break;
            case 2: palabra = "dos"; break;
            case 3: palabra = "tres"; break;
            case 4: palabra = "cuatro"; break;
            case 5: palabra = "cinco"; break;
        }

        // Salida de datos
        System.out.println("El numero ingresado en palabra es: " + palabra);

    }
}