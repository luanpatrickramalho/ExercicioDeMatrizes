package exerciciodematrizes12;

/*
 @author Luan Patrick Ramalho
 Tarefa:Leia uma matriz de 3 x 3 elementos.Calcule e imprima a sua transposta.
 */
import java.util.Random;

public class ExercicioDeMatrizes12 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int matrizDeA[][] = new int[3][3];
        int matrizTransposta[][] = new int[3][3];

        System.out.println("\nMatriz De A:");
        for (int i = 0; i < matrizDeA.length; i++) {
            for (int j = 0; j < matrizDeA[i].length; j++) {
                matrizDeA[i][j] = aleatorio.nextInt(100);
                matrizTransposta[j][i] = matrizDeA[i][j];
                System.out.printf("%3d ", matrizDeA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n Transposta da Matriz De A:");
        for (int[] linha : matrizTransposta) {
            for (int valor : linha) {
                System.out.printf("%3d ", valor);
            }
            System.out.println();
        }
    }
}
