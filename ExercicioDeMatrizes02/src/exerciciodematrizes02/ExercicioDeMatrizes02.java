package exerciciodematrizes02;

/*
 @author Luan Patrick Ramalho
 Tarefa:Declare uma matriz 5 x 5.Preencha com 1 a diagonal principal e com 0 
 os demais elementos. Escreva ao final a matriz obtida.
 */
public class ExercicioDeMatrizes02 {

    public static void main(String[] args) {
        int matrizes[][] = new int[5][5];

        System.out.println("Matriz[5][5]:");
        for (int i = 0; i < matrizes.length; i++) {
            for (int j = 0; j < matrizes[i].length; j++) {
                if (i == j) {
                    matrizes[i][j] = 1;
                } else {
                    matrizes[i][j] = 0;
                }
                System.out.printf("%2d ", matrizes[i][j]);
            }
            System.out.println();
        }
    }
}
