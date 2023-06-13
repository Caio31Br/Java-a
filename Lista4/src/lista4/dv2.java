package lista4;


public class dv2 {
	
	public int [][] atualizar(int[][] mat, int linha, int coluna){
		mat[linha][coluna] = 0;
		return mat;
	}
	
	public void diagonal() {
		  int M[][] = new int[5][5];
	
		  for (int i = 0; i < M[0].length; i++) {
				for(int j = 0; j < M[1].length; j++) {
					if(i == j) {
						M[i][j] = 1;
					} else {
						M[i][j] = 0;
					}//fim else
			}//fim for
	
		  }//fim for
		  
		  for (int i = 0; i < M[0].length; i++) {
				for(int j = 0; j < M[1].length; j++) {
					System.out.print(M[i][j] + "   ");
			}//fim for
				System.out.println();
	
		  }//fim for
	
	}
	
	
	
	}
