package programas;
import java.util.Scanner;
public class Ejercisio3Tarea {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        int numero;
        String ingles = "";

        // Entrada de datos
        System.out.print("Ingresa un numero entre 1 y 6: ");
        numero = lectura.nextInt();

        // Proceso: Convertir número a inglés
        switch (numero) {
            case 1: ingles = "one"; break;
            case 2: ingles = "two"; break;
            case 3: ingles = "three"; break;
            case 4: ingles = "four"; break;
            case 5: ingles = "five"; break;
            case 6: ingles = "six"; break;
        }

        // Salida de datos
        System.out.println("El numero ingresado en inglés es: " + ingles);

    }
}