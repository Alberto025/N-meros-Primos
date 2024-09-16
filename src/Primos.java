import java.util.ArrayList;

public class Primos {

    public Primos(int numInicio, int numFinal) {
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static ArrayList<Integer> buscarPrimos(int numInicio, int numFinal) {
        ArrayList<Integer> primos = new ArrayList<>();
        for (int num = numInicio; num <= numFinal; num++) {
            if (esPrimo(num)) {
                primos.add(num);
            }
        }
        return primos;
    }
}