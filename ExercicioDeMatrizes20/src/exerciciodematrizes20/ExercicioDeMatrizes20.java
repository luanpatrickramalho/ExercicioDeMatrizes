package exerciciodematrizes20;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um programa que leia uma matriz 3 x 6 com valores reais.
 (a) Imprima a soma de todos os elementos das colunas ımpares.
 (b) Imprima a media aritmetica dos elementos da segunda e quarta colunas.
 (c) Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
 (d) Imprima a matriz modificada.
 */
import java.util.Random;

public class ExercicioDeMatrizes20 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        double matrizOficial[][] = new double[3][6];
        double soma = 0;
        double media;
        int quantidadeDeElementos = 0;

        System.out.printf("************************************************");
        System.out.println("\n               Matriz Oficial                   ");
        System.out.println("************************************************");

        for (int i = 0; i < matrizOficial.length; i++) {
            for (int j = 0; j < matrizOficial[i].length; j++) {
                matrizOficial[i][j] = aleatorio.nextInt(100);
                System.out.printf("|%6.2f|", matrizOficial[i][j]);
            }
            System.out.println();
        }

        for (double[] linhas : matrizOficial) {
            for (int j = 0; j < linhas.length; j++) {
                if (j % 2 == 0) {
                    soma += linhas[j];
                }
            }
        }
        System.out.println("************************************************");
        System.out.printf("Soma dos elementos de colunas IMPARES = %.2f\n", soma);
        System.out.println("************************************************");
        soma = 0;
        for (double[] linhas : matrizOficial) {
            for (int j = 0; j < linhas.length; j++) {
                // indices das colunas 2 e 4
                if (j == 1 || j == 3) {
                    soma += linhas[j];
                    quantidadeDeElementos++;
                }
            }
        }
        media = soma / quantidadeDeElementos;
        System.out.printf("Media de elementos das colunas 2 e 4 = %.2f\n", media);
        System.out.println("************************************************");
        System.out.println("");
        System.out.println("************************************************");
        System.out.println("               Matriz Modificada                 ");
        System.out.println("************************************************");
        for (double[] linhas : matrizOficial) {
            linhas[5] = (linhas[0] + linhas[1]);
            for (double valor : linhas) {
                System.out.printf("|%6.2f|", valor);
            }

            System.out.println();
        }
        System.out.println("************************************************");
    }
}
