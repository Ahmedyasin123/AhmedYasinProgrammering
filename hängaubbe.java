package hangman;

import java.util.Scanner;

public class h�ngaubbe  {
	
public static void main(String[] args) 

{ 	while(true)	{ System.out.println(" ");
				System.out.println("v�lkommen till h�nga gubbe");
				System.out.println(" ");
				int liv=10;                                       // introduktion och skapar antal liv man har
				
				
	System.out.println("Du har "+ liv + " liv" );		// visar hur mycket liv du har och du kan b�rja gissa bokst�ver
	System.out.println("gissa p� en bokstav");
	
	Scanner sc = new Scanner(System.in);										// l�ser in inputen
	String[] words= {"fiska", "spring", "jaga", "ekorre", "hejd�", "jag"}; 		
	int random = (int) (Math.random() * words.length);						// skapar de slumpm�ssiga orden och v�ljer ett ord fr�n ordlistan 1-6
	String word = words[random];										
	String invertedWord= word;											//deklarerar  det r�tta ordet som �r slumpm�ssigt fr�n listan
	
	while(true) { 												//while-loop kollar om kraven under �r uppfyllda
	
		String guess= sc.nextLine().substring(0, 1); 	// gissning minst 1
		if (word.contains(guess)) { invertedWord = invertedWord.replace(guess.charAt(0), '-'); // om gissning r�tt byt med streck
		System.out.println("R�tt gissa ett till bokstav:"); 
		} else { liv--; 												// annars blir f�rs�k minus -1
		System.out.println("Fel du har " + liv + " liv kvar"); 			// hur mycket liv du har kvar
		} if (liv == 0) { System.out.println(" ");						
		System.out.println("Du f�rlorade! ordet var "+ word);    
		break;															// n�r du har gissat fel 10 g�nger s� f�rlorar du
		
		}
		boolean win= true;
		
		for (int i = 0; i < invertedWord.length(); i++){ // kollar om alla "spaces" har blivit streck d� har du vunnit
			if (invertedWord.charAt(i) == '-') {
				System.out.print(word.charAt(i));
			} else { 											// annars blir win false 
				win = false;
				System.out.print('-');
	
			
		}	
			
		} System.out.println();
		if (win) { System.out.println("Du vann");    // N�r du vinner visas det p� konsolen
		break;
		}
	} System.out.println("vill du spela igen");  
	String igen= sc.nextLine();	
	if (igen.equals("nej")) { 			//Om du inte vill spela igen skriver du bara nej annars kan du skriva vilken bokstav som helst och den b�rjar om
	break;
		
	}
		
		
		
			
	}	
			
			
	}
		
					
	
}


