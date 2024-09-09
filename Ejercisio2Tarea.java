package programas;
import java.util.Scanner;
public class Ejercisio2Tarea {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        int numero;
        String romano = "";

        // Entrada de datos
        System.out.print("Ingresa un numero entre 1 y 10: ");
        numero = lectura.nextInt();

        // Proceso: Convertir los números a romanos
        switch (numero) {
            case 1: romano = "I"; break;
            case 2: romano = "II"; break;
            case 3: romano = "III"; break;
            case 4: romano = "IV"; break;
            case 5: romano = "V"; break;
            case 6: romano = "VI"; break;
            case 7: romano = "VII"; break;
            case 8: romano = "VIII"; break;
            case 9: romano = "IX"; break;
            case 10: romano = "X"; break;
        }
        // Salida de datos
        System.out.println("El numero ingresado en romano es: " + romano);
    }
}