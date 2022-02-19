package exerciciodematrizes14;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um programa para gerar automaticamente numeros entre 0 e 99 de uma 
 cartela de bingo.Sabendo que cada cartela devera conter 5 linhas de 5 números,
 gere estes dados de modo a nao ter números repetidos dentro das cartelas.
 O programa deve exibir na tela a cartela gerada.
 */
import java.util.Random;

public class ExercicioDeMatrizes14 {

    public static void main(String[] args) {
        int cartela[][] = new int[5][5];
        int minNumero, maxNumero;

        System.out.println(" ***B  I   N   G   O***");
        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                switch (j) {
                    case 0:
                        minNumero = 1;
                        maxNumero = 20;
                        break;
                    case 1:
                        minNumero = 21;
                        maxNumero = 40;
                        break;
                    case 2:
                        minNumero = 41;
                        maxNumero = 60;
                        break;
                    case 3:
                        minNumero = 61;
                        maxNumero = 80;
                        break;
                    case 4:
                        minNumero = 81;
                        maxNumero = 99;
                        break;
                    default:
                        minNumero = 0;
                        maxNumero = 0;
                }
                int n = faixaAleatoria(minNumero, maxNumero);
                // sem valores repetidos
                int x = 0;
                while (x < cartela[i].length) {
                    if (cartela[x][j] == n) {
                        n = faixaAleatoria(minNumero, maxNumero);
                        x = 0;
                    }
                    x++;
                }
                cartela[i][j] = n;
                System.out.printf("%2d | ", cartela[i][j]);
            }
            System.out.println();
        }
    }

    public static int faixaAleatoria(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
}
