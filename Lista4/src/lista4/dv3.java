package lista4;

import java.util.Scanner;

public class dv3 {
	
	public int [][] atualizar(int[][] mat, int linha, int coluna){
		mat[linha][coluna] = 0;
		return mat;
	}
	
	public void maior() {
		  int M[][] = new int[4][4];
		  int maior = M[0][0];
		  int maiori = 0;
		  int maiorj = 0;
		  
		  Scanner input = new Scanner(System.in);
		  	
		  for (int i = 0; i < M[0].length; i++) {
				for(int j = 0; j < M[1].length; j++) {
					System.out.println("Digite o valor da linha " + (i + 1) + " coluna " + (j+1));
					M[i][j] = input.nextInt();
					
			  }
		  }
		  
		  for (int i = 0; i < M[0].length; i++) {
				for(int j = 0; j < M[1].length; j++) {
					if(M[i][j] > maior) {
					maior = M[i][j];
					maiori = i;
					maiorj = j;
					}
				}
		}
		  System.out.println("Maior valor: " + maior);
	        System.out.println("Localização: linha " + maiori + ", coluna " + maiorj);	 	  
	  }
	
} 
		 
	
		 
	
	
