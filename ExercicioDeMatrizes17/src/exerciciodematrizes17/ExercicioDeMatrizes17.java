package exerciciodematrizes17;
/*
 @author Luan Patrick Ramalho
 Tarefa:Leia uma matriz 10x3 com as notas de 10 alunos em 3 provas. Em seguida,
 escreva o numero de alunos cuja pior nota foi na prova 1, o numero de alunos
 cuja pior nota foi na prova 2,e o numero de alunos cuja pior nota foi na prova3
 Em caso de empate das piores notas de um aluno, o criterio de desempate 
 e arbitrario, mas o aluno deve ser contabilizado apenas uma vez.
 */

import java.util.Random;

public class ExercicioDeMatrizes17 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        float notasDoAluno[][] = new float[10][3];
        int piorNota[] = new int[10];
        int quantidadePior1 = 0;
        int quantidadePior2 = 0;
        int quantidadePior3 = 0;

        System.out.println("**********************");
        System.out.println("   NOTA DAS PROVAS ");
        System.out.println("**********************");
        for (int i = 0; i < notasDoAluno.length; i++) {
            System.out.println("");
            System.out.println(" --------------------- ");
            System.out.println("|  Notas Do Aluno " + (i + 1) + "  |");
            System.out.println(" --------------------- ");
            for (int j = 0; j < notasDoAluno[i].length; j++) {
                notasDoAluno[i][j] = (float) (aleatorio.nextInt(21) * 0.5);
                System.out.printf(" %da Nota = %.2f\n", j + 1, notasDoAluno[i][j]);
                int x = 0;
                float y = 10;
                while (x < notasDoAluno[i].length) {
                    if (notasDoAluno[i][x] < y) {
                        y = notasDoAluno[i][x];
                        piorNota[i] = x + 1;
                        x = 0;
                    }
                    x++;
                }
            }

        }

        for (int aluno : piorNota) {
            switch (aluno) {
                case 1:
                    quantidadePior1++;
                    break;
                case 2:
                    quantidadePior2++;
                    break;
                case 3:
                    quantidadePior3++;
                    break;
                default:
            }
        }
        System.out.println("");
        System.out.printf("*---------------------*");
        System.out.printf("\nAs piores notas foram:\n");
        System.out.printf("1a Prova: %d alunos\n", quantidadePior1);
        System.out.printf("2a Prova: %d alunos\n", quantidadePior2);
        System.out.printf("3a Prova: %d alunos\n", quantidadePior3);
        System.out.println("*--------------------*");
    }
}
