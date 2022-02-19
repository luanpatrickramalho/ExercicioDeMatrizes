/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciodematrizes05;

/*
 @author Luan Patrick Ramalho
 Tarefa:Leia uma matriz 5 x 5. Leia tambem um valor X. O programa devera fazer 
 uma busca desse valor na matriz ,ao final escrever a localização(linha e coluna) 
 ou uma mensagem de “não encontrado”.
 */
import java.util.Random;

public class ExercicioDeMatrizes05 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int matrizes[][] = new int[5][5];
        int x = aleatorio.nextInt(100);
        boolean existeX = false;

        System.out.println("\nMatriz:");
        for (int i = 0; i < matrizes.length; i++) {
            for (int j = 0; j < matrizes[i].length; j++) {
                matrizes[i][j] = aleatorio.nextInt(100);
                System.out.printf("%2d ", matrizes[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n Na matriz, o elemento " + x + " pode ser encontrado:");
        for (int i = 0; i < matrizes.length; i++) {
            for (int j = 0; j < matrizes[i].length; j++) {
                if (matrizes[i][j] == x) {
                    existeX = true;
                    System.out.println("Na Linha " + i + " e Coluna " + j);
                }
            }
        }

        if (!existeX) {
            System.out.println("Elemento não encontrado!");
        }
    }
}
