package programas;
import java.util.Scanner;
public class Ejercisio4Tarea {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        int numero;
        String periodo = "";

        // Entrada de datos
        System.out.print("Ingresa un numero (1, 2, 3, 4, 6, 12): ");
        numero = lectura.nextInt();

        // Proceso: Convertir número a periodo anual
        switch (numero) {
            case 1: periodo = "mensual"; break;
            case 2: periodo = "bimestral"; break;
            case 3: periodo = "trimestral"; break;
            case 4: periodo = "cuatrimestral"; break;
            case 6: periodo = "semestral"; break;
            case 12: periodo = "anual"; break;
        }

        // Salida de datos
        System.out.println("El periodo correspondiente es: " + periodo);

    }
}