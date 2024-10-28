import java.util.Arrays;
import java.util.Random;

/**
 * Programa que exemplifica processamentos básicos sobre array, nomeadamente: preencher, um
 * estatística sobre todos os elementos e uma pesquisa sequencial.
 */
public class Ex3_4 {
    public static void main(String[] args) {
        int[] v = new int[17];

        System.out.println("Tamanho = " + v.length);
        System.out.println( Arrays.toString(v) );

        fillArray(v, 10);
        System.out.println( Arrays.toString(v) );

        double mean = meanArray(v);
        System.out.println("Média = " + mean);

        int searchValue = 7;
        boolean exists = existsArray(v, searchValue);
        System.out.println(searchValue + " exists? " + exists);
    }

    /**
     * Verifica se 'value' faz parte dos elementos de 'arr'.
     * @param arr array com valores
     * @param value valor a pesquisar
     * @return true, se 'value' existe em 'arr'; false, caso contrário
     */
    public static boolean existsArray(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++)  {

            if(arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    // Desafio:
    //public static int countOccurrences(int[] arr, int value) { }

    /**
     * Calcula a média aritmética de todos os valores presentes num dado array.
     * @param arr array de entrada
     * @return a média aritmética dos elementos de 'arr'
     */
    public static double meanArray(int[] arr) {
        double sum = 0;
        for(int i = 0; i < arr.length; i++)  {
            sum = sum + arr[i];
        }

        return sum / arr.length;
    }

    /**
     * Preenche o array 'arr' com valores aleatórios entre '[0, maxValue]'.
     * @param arr array a popular
     * @param maxValue valor aleatório máximo a ser gerado
     */
    public static void fillArray(int[] arr, int maxValue) {
        Random r = new Random();

        for(int i = 0; i < arr.length; i++)  {
            // arr[i]
            arr[i] = r.nextInt(maxValue + 1); /* aleatorio em [0, maxValue] */
        }
    }
}
