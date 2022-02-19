package exerciciodematrizes06;

/*
 @author Luan Patrick Ramalho
 Tarefa:Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores 
 de cada posicao das matrizes lidas.
 */
import java.util.Random;

public class ExercicioDeMatrizes06 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int matrizDeA[][] = new int[4][4];
        int matrizDeB[][] = new int[4][4];
        int matrizDeC[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizDeA[i][j] = aleatorio.nextInt(100);
                matrizDeB[i][j] = aleatorio.nextInt(100);
                if (matrizDeA[i][j] >= matrizDeB[i][j]) {
                    matrizDeC[i][j] = matrizDeA[i][j];
                } else {
                    matrizDeC[i][j] = matrizDeB[i][j];
                }
            }
        }

        System.out.println("\nMatriz De A:");
        for (int[] linha : matrizDeA) {
            for (int valor : linha) {
                System.out.printf("%2d ", valor);
            }
            System.out.println();
        }
        System.out.println("\nMatriz De B:");
        for (int[] linha : matrizDeB) {
            for (int valor : linha) {
                System.out.printf("%2d ", valor);
            }
            System.out.println();
        }
        System.out.println("\nMatriz De C:");
        for (int[] linha : matrizDeC) {
            for (int valor : linha) {
                System.out.printf("%2d ", valor);
            }
            System.out.println();
        }
    }
}
