package exerciciodematrizes01;

/*
 @author Luan Patrick Ramalho
 Tarefa:Leia uma matriz 4 x 4, conte e escreva quantos valores maiores 
 que 10 ela possui.
 */
import java.util.Random;

public class ExercicioDeMatrizes01 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int limite = 10;
        int contador = 0;
        Random aleatorio = new Random();

        System.out.println("Matriz[4][4]:");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[j] = aleatorio.nextInt(100);
                if (matriz1[j] > limite) {
                    contador++;
                }
                System.out.printf("%2d ", matriz1[j]);
            }
            System.out.println();
        }

        System.out.println("Na Matriz, " + contador
                + " elementos são maiores que 10.");
    }
}
