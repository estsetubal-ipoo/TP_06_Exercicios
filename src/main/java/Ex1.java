import java.util.Scanner;

/**
 * Programa que ilustra o uso de funções em Java.
 */
public class Ex1 {
    public static void main(String[] args) {
        int x, y, z;

        x = readNatural();
        y = readNatural();

        System.out.println("Valores lidos: " + x + " e " + y);

        z = max(x, y);

        System.out.println("Máximo " + z);
    }

    /**
     * Calcula o maior entre dois valores inteiros.
     * @param a primeiro valor
     * @param b segundo valor
     * @return maior valor entre 'a' e 'b'
     */
    public static int max(int a, int b) {
        int max;
        if(a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    /**
     * Solicita ao utilizador um número > 0.
     * @return o número lido
     */
    public static int readNatural() {
        int value;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Número natural?: ");
            value = sc.nextInt();

            if(value <= 0) {
                System.out.println("\t[Valor inválido]");
            }
        } while( value <= 0);

        return value;
    }
}
