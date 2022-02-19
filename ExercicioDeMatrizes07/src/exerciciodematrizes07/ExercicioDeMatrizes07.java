package exerciciodematrizes07;

/*
 @author Luan Patrick Ramalho
 Tarefa:Gerar e imprimir uma matriz de tamanho 10 x 10, 
 onde seus elementos sao da forma:
 A[i][j] = 2i + 7j − 2 se i < j;
 A[i][j] = 3i² − 1 se i = j;
 A[i][j] = 4i³ − 5j² + 1 se i > j.
 */
public class ExercicioDeMatrizes07 {

    public static void main(String[] args) {
        int matrizes[][] = new int[10][10];

        System.out.println("\n Matriz:");
        for (int i = 0; i < matrizes.length; i++) {
            for (int j = 0; j < matrizes[i].length; j++) {
                if (i < j) {
                    matrizes[i][j] = (2 * i) + (7 * j) - 2;
                } else if (i == j) {
                    matrizes[i][j] = (3 * (i * i)) - 1;
                } else {
                    matrizes[i][j] = (4 * (i * i * i)) - (5 * (j * j)) + 1;
                }
                System.out.printf("%5d ", matrizes[i][j]);
            }
            System.out.println();
        }
    }
}
