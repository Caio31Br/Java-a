package lista4;

import java.util.Scanner;

public class testAll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		dv1 dv1 = new dv1();
		dv2 dv2 = new dv2();
		dv3 dv3 = new dv3();
		dv4 dv4 = new dv4();
		dv5 dv5 = new dv5();
		dv6 dv6 = new dv6();
		int dvs = 0;
		
		System.out.println("Escolha de 1 a 6 para acessar as atividades ");
		dvs = input.nextInt();
		
		while(dvs != -1) {
			if(dvs == 1) {
				dv1.maior10();
			}else if(dvs == 2) {
				dv2.diagonal();
			}else if(dvs == 3) {
				dv3.maior();
			}else if(dvs == 4) {
				dv4.localX();
			}else if(dvs == 5) {
				dv5.matriz();
			} else if(dvs == 6) {
				dv6.CalcMatriz();
			}
			
			System.out.println("Escolha de 1 a 6 para acessar as atividades ou -1 para sair ");
			dvs = input.nextInt();
		}
		
		System.out.println("-----------------------Fim do Programa-----------------------");
	
	
	}
}
