package exerciciodematrizes03;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faca um programa que preenche uma matriz 4 x 4 com o produto do valor 
 da linha e da coluna de cada elemento. Em seguida, imprima na tela a matriz.
 */
public class ExercicioDeMatrizes03 {

    public static void main(String[] args) {
        int matrizes[][] = new int[4][4];

        System.out.println("Matriz:");
        for (int i = 0; i < matrizes.length; i++) {
            for (int j = 0; j < matrizes[i].length; j++) {
                matrizes[i][j] = i * j;
                System.out.printf("%2d ", matrizes[i][j]);
            }
            System.out.println();
        }
    }
}
