package hangman;

import java.util.Random;
import java.util.Scanner;

public class hangman {


	public static void main(String[] args) {
	System.out.println ("gissa bokstav");	
		
	
	String [] random= {"flaska","leksak","park","v�ska","springa", "jobba","fiska", "tr�na" };
	Random orden= new Random();	
	String rattaordet= random[orden.nextInt(random.length)];    // deklarerar och v�ljer ett slumpm�ssigt tal fr�n listan 
	String gissordet = "";
	 
	for(char character : rattaordet.toCharArray()) {
		gissordet += "-";
	}
	
	System.out.println(gissordet);
	System.out.println(rattaordet); //ta bort i slutet
	
	

	Scanner scanner = new Scanner(System.in);
	String input = scanner.next();
	
	for(char character : rattaordet.toCharArray()) { // kollar bpkst�vernas index ser om den �r r�tt//
	
		
		
		
	}
	
	//String S



	int forsok= 8;
	Boolean running=true; 
	
	
	
	
	
	}
}
