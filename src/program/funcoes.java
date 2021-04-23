package program;

import java.io.Console;
import java.util.Random;

public class funcoes {

	public static void printarCampo(char[][] campo) {
		System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print(campo[i][j]);
			}
			System.out.println(" ");
		}
		
	}
	public static void jogadaPlayer(int jogada, char[][] campo) {
		int x = 0,y = 0;
		switch(jogada) {
			case 1: x=0; y=0; break;
			case 2: x=0; y=2; break;
			case 3: x=0; y=4; break;
			case 4: x=2; y=0; break;
			case 5: x=2; y=2; break;
			case 6: x=2; y=4; break;
			case 7: x=4; y=0; break;
			case 8: x=4; y=2; break;
			case 9: x=4; y=4; break;
			default: break;	
		}
		if(campo[x][y] == ' ') {
			campo[x][y] = 'X';
			
		}
	}
	public static void jogadaBot(char[][] campo) {
		Random rand = new Random();
		int jogada = rand.nextInt() % 9;
		
		int x = 0,y = 0;
		switch(jogada) {
			case 1: x=0; y=0; break;
			case 2: x=0; y=2; break;
			case 3: x=0; y=4; break;
			case 4: x=2; y=0; break;
			case 5: x=2; y=2; break;
			case 6: x=2; y=4; break;
			case 7: x=4; y=0; break;
			case 8: x=4; y=2; break;
			case 9: x=4; y=4; break;
			default: System.out.println("errou");break;	
		}
		if(campo[x][y] == ' ') {
			campo[x][y] = 'O';
			
		}else {
			jogadaBot(campo);
		}
		
	}

}
