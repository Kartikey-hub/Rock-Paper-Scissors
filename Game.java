package RockPaperScissor;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		while(true) {
		 String rps[]= {"r","p","s"};
		 String computermove=rps[new Random().nextInt(rps.length)];

		
		 String playermove;
		 while(true) {
		 System.out.println("Please enter your move (r , p or s");
	     playermove=scanner.nextLine();
	     if(playermove.equals("r")||playermove.equals("p")||playermove.equals("s")) {
	    	 break;
	     }
	     
	     System.out.println("Player move is not a valid move");
	}
		 System.out.println("Computer played " + computermove);
		 
		 if(playermove.equals(computermove)){
			 System.out.println("The game is  tied");
		 }
		 else if(playermove.equals("r")) {
			 if(computermove.equals("p")) {
				 System.out.println("YOU LOSE");
			 }else  if(computermove.equals("s")) {
				 System.out.println("YOU WIN");
			 }
		 }
		 
		 else if(playermove.equals("p")) {
			 if(computermove.equals("r")) {
				 System.out.println("YOU WIN");
			 }else  if(computermove.equals("s")) {
				 System.out.println("YOU LOSE");
			 }
		 }
		 else if(playermove.equals("s")) {
			 if(computermove.equals("p")) {
				 System.out.println("YOU WIN");
			 }else  if(computermove.equals("r")) {
				 System.out.println("YOU LOSE");
			 }
		 }
		 
		 System.out.println("Play again? (y/n)");
		 String playagain=scanner.nextLine();
		 
		 if(!playagain.equals("y")) {
			 break;
		 }
		 scanner.close();
	}
	
	}
}
