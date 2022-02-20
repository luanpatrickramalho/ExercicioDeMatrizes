package exerciciodematrizes19;
/*
 @author Luan Patrick Ramalho
 Tarefa:Faca um programa que leia uma matriz de 5 linhas e 4 colunas contendo as
 seguintes informacoes sobre alunos de uma disciplina,sendo todas as informacoes
 do tipo inteiro:
 • Primeira coluna: numero de matrıcula (use um inteiro)
 • Segunda coluna: media das provas
 • Terceira coluna: media dos trabalhos
 • Quarta coluna: nota final
 Elabore um programa que:
 (a) Leia as tres primeiras informacoes de cada aluno
 (b) Calcule a nota final como sendo a soma da media das provas e da media 
 dos trabalhos
 (c) Imprima a matrıcula do aluno que obteve a maior nota final 
 (assuma que so existe uma maior nota)
 (d) Imprima a media aritmetica das notas finais.
 */

import java.util.Random;

public class ExercicioDeMatrizes19 {

    public static void main(String[] args) {

        int quantidadeDeAlunos = 5;
        int quantidadeDeInformacoes = 4;
        int matrizDeAlunos[][] = new int[quantidadeDeAlunos][quantidadeDeInformacoes];
        double mediaDaInformacao[] = new double[quantidadeDeInformacoes - 1];
        int maiorNota = 0;
        int melhorAluno = 0;
        Random aleatorio = new Random();

        System.out.println("**************************************************************************");
        System.out.println("  Matricula do Aluno | Media na Prova | Media nos Trabalhos | Nota Final  ");
        System.out.println("**************************************************************************");
        for (int i = 0; i < matrizDeAlunos.length; i++) {
            for (int j = 0; j < matrizDeAlunos[i].length; j++) {
                switch (j) {
                    case 0:
                        matrizDeAlunos[i][j] = aleatorio.nextInt(100000);
                        System.out.printf("|  %11d     ", matrizDeAlunos[i][j], "|");
                        break;
                    case 1:
                        matrizDeAlunos[i][j] = aleatorio.nextInt(6);
                        System.out.printf("  | %7d,00 " + "  ", matrizDeAlunos[i][j]);
                        break;
                    case 2:
                        matrizDeAlunos[i][j] = aleatorio.nextInt(6);
                        System.out.printf("  |  %8d,00        ", matrizDeAlunos[i][j], "|");
                        break;
                    case 3:
                        matrizDeAlunos[i][j] = (matrizDeAlunos[i][j - 2]
                                + matrizDeAlunos[i][j - 1]);
                        System.out.printf("|  %4d,00 ", matrizDeAlunos[i][j], "|");
                        System.out.printf("  |");
                        break;
                    default:
                }
            }
            System.out.println();
        }

        System.out.println("**************************************************************************");
        for (int[] alunos : matrizDeAlunos) {
            if (alunos[3] > maiorNota) {
                maiorNota = alunos[3];
                melhorAluno = alunos[0];
            }
        }
        System.out.printf("      O melhor aluno foi o de matrícula %d com nota final = %d,00.      \n", melhorAluno, maiorNota);
        System.out.println("**************************************************************************");
        System.out.println("                    As médias gerais da turma foram:                      ");
        System.out.println("       Media na Prova      |   Media nos Trabalhos   |     Nota Final     ");

        for (int x = 0; x < mediaDaInformacao.length; x++) {
            int soma = 0;
            int i = 0;
            while (i < matrizDeAlunos.length) {
                soma += matrizDeAlunos[i][x + 1];
                i++;
            }
            mediaDaInformacao[x] = (double) soma / matrizDeAlunos.length;

            System.out.printf("          %6.2f         ", mediaDaInformacao[x]);
        }
        System.out.println("");
        System.out.println("**************************************************************************");
    }
}
