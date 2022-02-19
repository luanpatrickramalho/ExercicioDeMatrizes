package exerciciodematrizes13;

/*
 @author Luan Patrick Ramalho
 Tarefa:Gere matriz 4 x 4 com valores no intervalo [1, 20].Escreva um programa 
 que transforme a matriz gerada numa matriz triangular inferior,ou seja,
 atribuindo zero a todos os elementos acima da diagonal principal.
 Imprima a matriz original e a matriz transformada.
 */
import java.util.Random;

public class ExercicioDeMatrizes13 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int matrizDeA[][] = new int[4][4];
        int matrizDeB[][] = new int[4][4];

        System.out.println("\nMatriz De A:");
        for (int i = 0; i < matrizDeA.length; i++) {
            for (int j = 0; j < matrizDeA[i].length; j++) {
                matrizDeA[i][j] = aleatorio.nextInt(20);
                System.out.printf("%2d ", matrizDeA[i][j]);
                if (i < j) {
                    matrizDeB[i][j] = 0;
                } else {
                    matrizDeB[i][j] = matrizDeA[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("\nMatriz De B:");
        for (int[] linhaB : matrizDeB) {
            for (int valorDeB : linhaB) {
                System.out.printf("%2d ", valorDeB);
            }
            System.out.println();
        }
    }
}
