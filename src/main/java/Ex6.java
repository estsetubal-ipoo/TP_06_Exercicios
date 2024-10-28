import java.util.Arrays;

/**
 * Programa que verifica se matrizes são triangulares.
 */
public class Ex6 {
    public static void main(String[] args) {
        int[][] mat1 = { {1, 2, 3}, {0, 5, 6}, {0, 0, 9} };
        matrixPrint(mat1);
        System.out.println("Triangular? " + isTriangular(mat1));

        int[][] mat2 = { {1, 2}, {0, 4} };
        matrixPrint(mat2);
        System.out.println("Triangular? " + isTriangular(mat2));

        int[][] mat3 = { {1, 2, 3}, {0, 5, 6}, {4, 0, 9} };
        matrixPrint(mat3);
        System.out.println("Triangular? " + isTriangular(mat3));
    }

    /**
     * Verifica se uma dada matriz é triangular, ou seja, se os elementos abaixo
     * da diagonal são todos zero.
     * @param matrix a matriz a verificar
     * @return true, se for triangular; false, caso contrário
     */
    public static boolean isTriangular(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(i > j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void matrixPrint(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
