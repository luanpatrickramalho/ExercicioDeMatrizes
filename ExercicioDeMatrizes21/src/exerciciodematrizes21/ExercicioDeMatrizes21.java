package exerciciodematrizes21;
/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
 Ofereça ao usuario um menu de opções:
 (a) somar as duas matrizes
 (b) subtrair a primeira matriz da segunda
 (c) adicionar uma constante as duas matrizes
 (d) imprimir as matrizes
 Nas duas primeiras opções uma terceira matriz 3 x 3 deve ser criada. 
 Na terceira opção o valor da constante deve ser lido e o resultado da adição da 
 constante deve ser arma zenado na propria matriz.
 */

import java.util.Scanner;
import java.util.Random;

public class ExercicioDeMatrizes21 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        double matrizDeA[][] = new double[2][2];
        double matrizDeB[][] = new double[2][2];
        double matrizResultanteDeAeB[][] = new double[3][3];
        boolean executar = true;
        int opcaoMenu;
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

        do {
            System.out.printf("==============================================");
            System.out.println("\n   Informe a operaçâo que deseja executar:");
            System.out.println("==============================================");
            System.out.println("(1): Somar Matriz A e B");
            System.out.println("(2): Subtrair Matriz A de Matriz B");
            System.out.println("(3): Adicionar uma constante as Matrizes A e B");
            System.out.println("(4): Imprimir na tela as Matrizes");
            System.out.println("(0): Sair");
            System.out.println("==============================================");
            opcaoMenu = teclado.nextInt();
            teclado.nextLine();

            switch (opcaoMenu) {
                case 0:
                    executar = false;
                    break;
                case 1:
                    System.out.println("==============================================");
                    System.out.println("Matriz Resultante Da Soma:");
                    System.out.println("==============================================");
                    for (int i = 0; i < matrizResultanteDeAeB.length; i++) {
                        for (int j = 0; j < matrizResultanteDeAeB[i].length; j++) {
                            if (i < matrizDeA.length && j < matrizDeA.length) {
                                matrizResultanteDeAeB[i][j] = (matrizDeA[i][j] + matrizDeB[i][j]);
                            } else {
                                matrizResultanteDeAeB[i][j] = 0;
                            }
                            System.out.printf("%5.0f ", matrizResultanteDeAeB[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("==============================================");
                    System.out.println("Matriz Resultante Da Subtração:");
                    System.out.println("==============================================");
                    for (int i = 0; i < matrizResultanteDeAeB.length; i++) {
                        for (int j = 0; j < matrizResultanteDeAeB[i].length; j++) {
                            if (i < matrizDeA.length && j < matrizDeA.length) {
                                matrizResultanteDeAeB[i][j] = (matrizDeB[i][j] - matrizDeA[i][j]);
                            } else {
                                matrizResultanteDeAeB[i][j] = 0;
                            }
                            System.out.printf("%5.0f ", matrizResultanteDeAeB[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("==============================================");
                    System.out.println("informe a constante:");
                    System.out.println("==============================================");
                    int constante = teclado.nextInt();
                    teclado.nextLine();
                    for (int i = 0; i < matrizDeA.length; i++) {
                        for (int j = 0; j < matrizDeA[i].length; j++) {
                            matrizDeA[i][j] = (matrizDeA[i][j] + constante);
                            matrizDeB[i][j] = (matrizDeB[i][j] + constante);
                        }
                    }
                    System.out.println("==============================================");
                    System.out.println("Matriz De A Resultante apos adição da constante:");
                    System.out.println("==============================================");
                    for (double[] linhas : matrizDeA) {
                        for (double valor : linhas) {
                            System.out.printf("%5.0f ", valor);
                        }
                        System.out.println();
                    }
                    System.out.println("==============================================");
                    System.out.println("Matriz De B Resultante apos adição da constante:");
                    System.out.println("==============================================");
                    for (double[] linhas : matrizDeB) {
                        for (double valor : linhas) {
                            System.out.printf("%5.0f ", valor);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("==============================================");
                    System.out.println("Matriz De A:");
                    System.out.println("==============================================");
                    for (double[] linhas : matrizDeA) {
                        for (double valor : linhas) {
                            System.out.printf("%5.0f ", valor);
                        }
                        System.out.println();
                    }
                    System.out.println("==============================================");
                    System.out.println("Matriz De B:");
                    System.out.println("==============================================");
                    for (double[] linhas : matrizDeB) {
                        for (double valor : linhas) {
                            System.out.printf("%5.0f ", valor);
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("==============================================");
                    System.out.println("Opção inválida! Informe novamente.\n");
                    System.out.println("==============================================");
            }

            if (opcaoMenu > 0 && opcaoMenu < 5) {
                System.out.println("Deseja executar mais alguma operação? (S)Sim  (N)Não ");
                String continuar = teclado.next();
                if (continuar.toUpperCase().charAt(0) != 'S') {
                    executar = false;
                }
            }
        } while (executar);
    }
}
