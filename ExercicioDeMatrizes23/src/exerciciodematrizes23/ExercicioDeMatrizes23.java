package exerciciodematrizes23;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um programa que leia uma matriz A de tamanho 3 x 3 e calcule B = A²
 */
import java.util.Random;

public class ExercicioDeMatrizes23 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int matrizDeA[][] = new int[3][3];
        int matrizDeB[][] = new int[matrizDeA.length][matrizDeA[0].length];

        System.out.println("\nMatriz De A:");
        for (int i = 0; i < matrizDeA.length; i++) {
            for (int j = 0; j < matrizDeA[i].length; j++) {
                matrizDeA[i][j] = aleatorio.nextInt(10);
                System.out.printf("%4d ", matrizDeA[i][j]);
            }
            System.out.println();
        }
        if (matrizDeA[0].length != matrizDeA.length) {
            System.out.println("O numero de colunas de Matriz De A devia ser igual ao numero de linhas de Matriz De B");
        } else {
            System.out.println("\nMatriz De B = A²:");
            for (int i = 0; i < matrizDeB.length; i++) {
                for (int j = 0; j < matrizDeB[i].length; j++) {
                    int soma = 0;
                    for (int x = 0; x < matrizDeA[0].length; x++) {
                        soma = soma + (matrizDeA[i][x] * matrizDeA[x][j]);
                    }
                    matrizDeB[i][j] = soma;
                    System.out.printf("%4d ", matrizDeB[i][j]);
                }
                System.out.println();
            }
        }
    }
}
