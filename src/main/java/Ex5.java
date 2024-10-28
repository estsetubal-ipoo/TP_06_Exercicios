import java.util.Arrays;

/**
 * Programa que verifica elementos duplicados em arrays.
 */
public class Ex5 {
    public static void main(String[] args) {
        int[] v1 = {1, 4, 3, 5};
        int[] v2 = {5, 1, 7, 8};

        int[] dup = duplicates(v1, v2);
        System.out.println( Arrays.toString(dup) );

        // Testar exceção no caso de arrays de diferentes tamanhos
        duplicates(v1, new int[2]);
    }

    /**
     * Verifica elementos duplicados em dois arrays recebidos por parâmetro.
     * Retorna um array da mesma dimensão preenchido com uns e zeros, onde
     * 1 (um) significa que o elemento do primeiro array está presente no segundo.
     * <br/>
     * Isto é, para cada índice 'i' se o elemento em 'arr[i] == 1', então é porque
     * esse elemento também está presente em 'otherArr'.
     * @param arr array com elementos a verificar
     * @param otherArr array com elementos possivelmente duplicados
     * @return um array do tamanho de 'arr' que sinaliza os elementos duplicados
     */
    public static int[] duplicates(int[] arr, int[] otherArr) {
        if(arr.length != otherArr.length) {
            throw new IllegalArgumentException("Arrays de tamanhos diferentes.");
        }

        int[] duplicates = new int[arr.length]; // todos inicialmente a 0

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == otherArr[j]) {
                    duplicates[i] = 1;
                    break;
                }
            }
        }

        return duplicates;
    }
}
