import java.util.Scanner;

/**
 * Programa que calcula fatorial de números.
 */
public class Ex2 {
    public static void main(String[] args) {
        int n, factorialN;
        Scanner sc = new Scanner(System.in);

        System.out.print("Número?: ");
        n = sc.nextInt();

        factorialN = factorial(n);

        System.out.println(n + "! = " + factorialN);
    }

    /**
     * Calcula o factorial de um dado número.
     * <br/>
     * O factorial só está definido para números >= 0.
     * @param number número de entrada
     * @return o factorial de 'number'; 0, se 'numero' < 0.
     */
    public static int factorial(int number) {
        if(number < 0) {
            return 0;
        }

        if(number == 0) {
            return 1;
        }

        int fact = 1;
        while(number > 0) {
            fact = fact * number;
            //fact *= number;

            number = number - 1;
            //number--;
            //number -= 1;
        }
        return fact;
    }
}
