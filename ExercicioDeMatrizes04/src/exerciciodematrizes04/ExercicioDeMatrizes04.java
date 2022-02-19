package exerciciodematrizes04;

/*
 @author Luan Patrick Ramalho
 Tarefa:Leia uma matriz 4 x 4, imprima a matriz e retorne a localização 
 (linha e a coluna) do maior valor.
 */
import java.util.Random;

public class ExercicioDeMatrizes04 {

    public static void main(String[] args) {
        int matrizes[][] = new int[4][4];
        Random aleatorio = new Random();
        int linhaMaior = 0;
        int colunaMaior = 0;

        System.out.println("Matriz:");
        for (int i = 0; i < matrizes.length; i++) {
            for (int j = 0; j < matrizes[i].length; j++) {
                matrizes[i][j] = aleatorio.nextInt(100);
                if (matrizes[i][j] > matrizes[linhaMaior][colunaMaior]) {
                    linhaMaior = i;
                    colunaMaior = j;
                }
                System.out.printf("%2d ", matrizes[i][j]);
            }
            System.out.println();
        }

        System.out.println("O maior valor encontra-se na linha " + linhaMaior + " e na coluna " + colunaMaior);
    }
}
