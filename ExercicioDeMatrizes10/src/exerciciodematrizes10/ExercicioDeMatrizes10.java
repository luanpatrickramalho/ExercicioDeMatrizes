package exerciciodematrizes10;

/*
 @author Luan Patrick Ramalho
 Tarefa:Leia uma matriz de 3 x 3 elementos. 
 Calcule a soma dos elementos que estao na diagonal principal.
 */
import java.util.Random;

public class ExercicioDeMatrizes10 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int matrizes[][] = new int[3][3];
        int soma = 0;

        System.out.println("Matriz:");
        for (int i = 0; i < matrizes.length; i++) {
            for (int j = 0; j < matrizes[i].length; j++) {
                matrizes[i][j] = aleatorio.nextInt(100);
                System.out.printf("%3d ", matrizes[i][j]);
                if (i == j) {
                    soma += matrizes[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("\n A soma dos valores da diagonal principal da matriz é: " + soma);
    }
}
