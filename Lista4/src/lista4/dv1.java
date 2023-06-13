package lista4;

import java.util.Scanner;

public class dv1 {
	

public int [][] atualizar(int[][] mat, int linha, int coluna){
	mat[linha][coluna] = 0;
	return mat;
}

public void maior10() {
  int M[][] = new int[4][4];
  int cont = 0;
  Scanner input = new Scanner(System.in);
  
  for (int i = 0; i < M[0].length; i++) {
		for(int j = 0; j < M[1].length; j++) {
			System.out.println("Digite o valor da linha " + (i + 1) + " coluna " + (j+1));
			
			M[i][j] = input.nextInt();
		}
	}
  
  for(int i = 0; i <M[0].length; i ++) {
	  for(int j = 0; j < M[1].length; j++) {
		if(M[i][j] > 10) {
			cont++;
		}  
	  }
  }

  System.out.println("Foram ao total " +cont+ " Valores maiores que 10");
}
	
}