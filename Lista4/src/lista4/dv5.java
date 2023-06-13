package lista4;
import java.util.*;

public class dv5 {
	public void matriz() {
		Scanner input = new Scanner(System.in);
		
		int M1[][] = new int[4][4];
		int M2[][] = new int[4][4];
		int M3[][] = new int[4][4];
		
		for (int i = 0; i < M1[0].length; i++) {
			for(int j = 0; j < M1[1].length; j++) {
				System.out.println("Digite o valor da linha " + (i + 1) + " coluna " + (j+1));
				M1[i][j] = input.nextInt();
				
			}//fim for
		}//fim for
		
		for (int i = 0; i < M2[0].length; i++) {
			for(int j = 0; j < M2[1].length; j++) {
				System.out.println("Digite o valor da linha " + (i + 1) + " coluna " + (j+1));
				M2[i][j] = input.nextInt();
				
			}//fim for
		}//fim for
		
		for (int i = 0; i < M3[0].length; i++) {
			for(int j = 0; j < M3[1].length; j++) {
				if(M1[i][j] > M2[i][j]) {
					M3[i][j] = M1[i][j];
				} else if( M2[i][j] > M1[i][j]) {
					M3[i][j] = M2[i][j];
				}
				
			}//fim for
		}//fim for
		
		for (int i = 0; i < M3[0].length; i++) {
			for(int j = 0; j < M3[1].length; j++) {
				System.out.print(M3[i][j] + "   ");
		}//fim for
			System.out.println();

	  }//fim for
	}
}
