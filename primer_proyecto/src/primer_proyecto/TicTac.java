package primer_proyecto;

import java.util.Random;
import java.util.Scanner;

public class TicTac {

	public static void main(String[] args) {
			
			char [] [] gamerboard= 
				{{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}};
			printGamerboard(gamerboard);
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Ingresa un numero del 1-9: ");
			int post = scan.nextInt();
			
			System.out.println(post);
			placepiece(gamerboard,post,"player");
			Random rand= new Random();
			int cpupost	=rand.nextInt(9)+1;
			placepiece(gamerboard,cpupost,"CPU");
			printGamerboard(gamerboard);
				
	}
		public static void printGamerboard(char [] [] gamerboard) {
			for(char[] row: gamerboard) {
				for(char c : row) {
					System.out.print(c);
				}
				System.out.println();
			}
		}
		
		public static void placepiece(char [] [] gamerboard, int post, String user) {
			
				char symbol ='X';
			
			if(user.equals("player")) {
				symbol='X';
			}else if(user.equals("CPU")){
				symbol='O';
			}
			
			switch (post) {
				case 1:
						gamerboard[0] [0]=symbol;
						break;
				case 2:
						gamerboard[0] [2]=symbol;
						break;
				case 3:
						gamerboard[0] [4]=symbol;
						break;
				case 4:
						gamerboard[2] [0]=symbol;
						break;
				case 5:
						gamerboard[2] [2]=symbol;
						break;
				case 6:
						gamerboard[2] [4]=symbol;
						break;
				case 7:
						gamerboard[4] [4]=symbol;
						break;
				case 8:
						gamerboard[4] [2]=symbol;
						break;
				case 9:
						gamerboard[4] [4]=symbol;
						break;
				default:
					System.out.println("Error");
						break;
			}
		}
}
