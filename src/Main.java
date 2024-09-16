import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Primos {
    public Main(int numInicio, int numFinal) {
        super(numInicio, numFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                System.out.print("Introduce el número inicial: ");
                int numInicio = scanner.nextInt();
                System.out.print("Introduce el número final: ");
                int numFinal = scanner.nextInt();

                if (numInicio > numFinal) {
                    System.out.println("El numero inicial debe ser menor o igual que el numero final.");
                } else {

                    ArrayList<Integer> primos = buscarPrimos(numInicio, numFinal);


                    System.out.println("Rango de numeros: (" + numInicio + ", " + numFinal + "): " + primos);


                    int contadorPrimos = primos.size();
                    System.out.println("Total primos " + contadorPrimos);
                }


                System.out.print("Introduce un número para finalizar el programa ó 0 para repetirlo): ");
                int salida = scanner.nextInt();

                if (salida != 0) {
                    salir = true;
                }

            } catch (Exception e) {
                System.out.println("Introduce un número valido");
                scanner.next();
            }
        }

        System.out.println("Fin del programa.");
        scanner.close();
    }
}