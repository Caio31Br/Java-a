package lista4;
import java.util.Scanner;

public class dv6 {

	
    public void CalcMatriz() {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma dos números ímpares
        int somaImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }

        // Calcula a soma de cada coluna
        int[] somaColunas = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        // Calcula a soma de cada linha
        int[] somaLinhas = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaLinhas[i] += matriz[i][j];
            }
        }

        // Imprime os resultados
        System.out.println("Soma dos números ímpares: " + somaImpares);
        System.out.println("Soma de cada coluna:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Coluna " + (i + 1) + ": " + somaColunas[i]);
        }
        System.out.println("Soma de cada linha:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + (i + 1) + ": " + somaLinhas[i]);
        }
    }
	

}
