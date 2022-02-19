package exerciciodematrizes15;
/*
 @author Luan Patrick Ramalho
 Tarefa:Leia uma matriz 5 x 10 que se refere respostas de 10 questoes de 
 múltipla escolha, referentes a 5 alunos.Leia tambem um vetor de 10 posiçoes 
 contendo o gabarito de respostas que podem ser a, b, c ou d.Seu programa devera 
 comparar as respostas de cada candidato com o gabarito e emitir um vetor 
 denominado resultado,contendo a pontuacão correspondente a cada aluno.
 */

import java.util.Random;

public class ExercicioDeMatrizes15 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        char[][] respostaDoAluno = new char[5][10];
        char[] gabarito = {'a', 'd', 'c', 'a', 'b', 'a', 'c', 'b', 'd', 'd'};
        double[] resultado = new double[5];

        for (int i = 0; i < respostaDoAluno.length; i++) {
            System.out.printf("\n           Aluno da matricula %1d :", i + 1, "     ");
            resultado[i] = 0;
            System.out.println("");
            System.out.println(" ----------------------------------------- ");
            System.out.println("| Questões | Resposta do Aluno | Gabarito |");
            System.out.printf(" ----------------------------------------- ");
            for (int j = 0; j < respostaDoAluno[i].length; j++) {
                int resp = aleatorio.nextInt(4) + 97; // cod ascii
                respostaDoAluno[i][j] = (char) resp;
                if (respostaDoAluno[i][j] == gabarito[j]) {
                    resultado[i]++;
                }
                System.out.printf("\n|    %2d    |         %s         |     %s    |",
                        j + 1, respostaDoAluno[i][j], gabarito[j]);
            }
            System.out.printf("\n           Media do aluno %d = %.2f\n",
                    i + 1, resultado[i]);
        }

    }
}
