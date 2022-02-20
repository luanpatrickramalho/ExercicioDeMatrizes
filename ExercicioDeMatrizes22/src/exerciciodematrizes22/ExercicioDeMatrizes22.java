package exerciciodematrizes22;
/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um programa que leia duas matrizes A e B de tamanho 3 x 3 
 e calcule C = A ∗ B.
 */

import java.util.Scanner;
import java.util.Random;

public class ExercicioDeMatrizes22 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        double matrizDeA[][] = new double[3][3];
        double matrizDeB[][] = new double[3][3];
        double matrizResultanteDeAeB[][] = new double[3][3];

        System.out.println("==============================================");
        System.out.println("                Matriz De A");
        System.out.println("==============================================");
        for (int i = 0; i < matrizDeA.length; i++) {
            for (int j = 0; j < matrizDeA[i].length; j++) {
                matrizDeA[i][j] = aleatorio.nextInt(100);
                System.out.printf("%4.0f ", matrizDeA[i][j]);
            }
            System.out.println();
        }

        System.out.println("==============================================");
        System.out.println("                Matriz De B");
        System.out.println("==============================================");
        for (int i = 0; i < matrizDeB.length; i++) {
            for (int j = 0; j < matrizDeB[i].length; j++) {
                matrizDeB[i][j] = aleatorio.nextInt(100);
                System.out.printf("%4.0f", matrizDeB[i][j]);
            }
            System.out.println();

        }
        System.out.println("==============================================");
        System.out.println("Matriz Resultante Da Multiplicação:");
        System.out.println("==============================================");
        for (int i = 0; i < matrizResultanteDeAeB.length; i++) {
            for (int j = 0; j < matrizResultanteDeAeB[i].length; j++) {
                if (i < matrizDeA.length && j < matrizDeA.length) {
                    matrizResultanteDeAeB[i][j] = (matrizDeA[i][j] * matrizDeB[i][j]);
                } else {
                    matrizResultanteDeAeB[i][j] = 0;
                }
                System.out.printf("%5.0f ", matrizResultanteDeAeB[i][j]);
            }
            System.out.println();

        }
        System.out.println("==============================================");
    }
}
