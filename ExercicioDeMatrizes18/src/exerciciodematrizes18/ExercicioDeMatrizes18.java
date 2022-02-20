package exerciciodematrizes18;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faca um programa que permita ao usuario entrar com uma matriz de 3 x 3 
 numeros inteiros em seguida, gere um array unidimensional pela soma dos numeros
 de cada coluna da matriz e mostrar na tela esse array.
 */
import java.util.Random;

public class ExercicioDeMatrizes18 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int matrizes[][] = new int[3][3];
        int vetorDeSoma[] = new int[3];

        System.out.println("\n ---Matriz--- :");
        for (int i = 0; i < matrizes.length; i++) {
            for (int j = 0; j < matrizes[i].length; j++) {
                matrizes[i][j] = aleatorio.nextInt(100);
                System.out.printf("| %2d ", matrizes[i][j],"|");
                vetorDeSoma[j] += matrizes[i][j];
            }
            System.out.println();
        }

        System.out.println("\nVetor que calcula a soma das colunas da matriz:");
        for (int x : vetorDeSoma) {
            System.out.printf("%2d ", x);
        }
        System.out.println();
    }
}
