package program;

import java.util.Scanner;
public class Application extends funcoes{

	public static void main(String[] args) {
		int tentativaPlayer = 0, tentativaBot = 0;
		Scanner s1 = new Scanner(System.in);
		char mapa[][] = {{' ','|',' ','|',' '} , 
						{'-','+','-','+','-'}, 
						{' ','|',' ','|',' '},
						{'-','+','-','+','-'}, 
						{' ','|',' ','|',' '},
		};
		
		while(true) {
		printarCampo(mapa);
		System.out.println("digite onde deseja jogar");
		tentativaPlayer = s1.nextInt();
		jogadaPlayer(tentativaPlayer, mapa);
		printarCampo(mapa);
		jogadaBot(mapa);
		printarCampo(mapa);
		//break;
		}
		//s1.close();
	}
	
	
	

}
