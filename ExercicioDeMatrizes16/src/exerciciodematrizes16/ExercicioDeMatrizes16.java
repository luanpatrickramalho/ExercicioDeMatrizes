package exerciciodematrizes16;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faca um programa para corrigir uma prova com 10 questoes de multipla
 escolha (a, b, c, d ou e), em uma turma com 3 alunos. Cada questao vale 1 ponto.
 Leia o gabarito, e para cada aluno leia sua matricula (numero inteiro) e suas 
 respostas. Calcule e escreva:  Para cada aluno, escreva sua matrıcula, suas 
 respostas, e sua nota. O percentual de aprovacao, assumindo media 7.0.
 */
import java.util.Random;

public class ExercicioDeMatrizes16 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int quantidadeDeAlunos = 3;
        int quantidadeDeQuestoes = 10;
        char gabaritoDasQuestoes[] = {'a', 'e', 'c', 'b', 'd', 'e', 'c', 'a', 'b', 'd'};
        char respostaDosAlunos[][] = new char[quantidadeDeAlunos][quantidadeDeQuestoes];
        double resultado[] = new double[quantidadeDeAlunos];
        int matricula[] = new int[quantidadeDeAlunos];

        for (int i = 0; i < respostaDosAlunos.length; i++) {
            matricula[i] = aleatorio.nextInt(100000);

            System.out.printf("\n         Aluno da matricula: %5d :",
                    matricula[i], "     ");
            System.out.println("");
            resultado[i] = 0;
            System.out.println(" ----------------------------------------- ");
            System.out.println("| Questões | Resposta do Aluno | Gabarito |");
            System.out.printf(" ----------------------------------------- ");
            for (int j = 0; j < respostaDosAlunos[i].length; j++) {
                int resp = aleatorio.nextInt(5) + 97;
                respostaDosAlunos[i][j] = (char) resp;

                if (respostaDosAlunos[i][j] == gabaritoDasQuestoes[j]) {
                    resultado[i]++;
                }

                System.out.printf("\n|    %2d    |         %s         |     %s    |",
                        j + 1, respostaDosAlunos[i][j], gabaritoDasQuestoes[j]);
            }

            if (resultado[i] >= 7.0) {
                System.out.printf("\n  Aprovado   :) Media do aluno %d = %.2f\n",
                        i + 1, resultado[i]);
            } else {
                System.out.printf("\n  Reprovado  :(  Media do aluno %d = %.2f\n",
                        i + 1, resultado[i]);
            }
        }

    }
}
