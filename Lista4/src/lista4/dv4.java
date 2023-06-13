package lista4;
import java.util.Scanner;

public class dv4 {

    public void localX() {
        int[][] matriz = new int[5][5];
        Scanner scanner = new Scanner(System.in);

        // Preenche a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite o valor a ser buscado: ");
        int valorBusca = scanner.nextInt();

        boolean encontrado = false;
        int linhaEncontrada = -1;
        int colunaEncontrada = -1;

        // Busca o valor na matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valorBusca) {
                    encontrado = true;
                    linhaEncontrada = i;
                    colunaEncontrada = j;
                    break;
                }
            }
        }

        // Imprime o resultado da busca
        if (encontrado) {
            System.out.println("Valor encontrado na posição [" + linhaEncontrada + "][" + colunaEncontrada + "]");
        } else {
            System.out.println("Valor não encontrado na matriz.");
        }
    }
	

}
