package hangman;

import java.util.Scanner;

public class hängaubbe  {
	
public static void main(String[] args) 

{ 	while(true)	{ System.out.println(" ");
				System.out.println("välkommen till hänga gubbe");
				System.out.println(" ");
				int liv=10;                                       // introduktion och skapar antal liv man har
				
				
	System.out.println("Du har "+ liv + " liv" );		// visar hur mycket liv du har och du kan börja gissa bokstäver
	System.out.println("gissa på en bokstav");
	
	Scanner sc = new Scanner(System.in);										// läser in inputen
	String[] words= {"fiska", "spring", "jaga", "ekorre", "hejdå", "jag"}; 		
	int random = (int) (Math.random() * words.length);						// skapar de slumpmässiga orden och väljer ett ord från ordlistan 1-6
	String word = words[random];										
	String invertedWord= word;											//deklarerar  det rätta ordet som är slumpmässigt från listan
	
	while(true) { 												//while-loop kollar om kraven under är uppfyllda
	
		String guess= sc.nextLine().substring(0, 1); 	// gissning minst 1
		if (word.contains(guess)) { invertedWord = invertedWord.replace(guess.charAt(0), '-'); // om gissning rätt byt med streck
		System.out.println("Rätt gissa ett till bokstav:"); 
		} else { liv--; 												// annars blir försök minus -1
		System.out.println("Fel du har " + liv + " liv kvar"); 			// hur mycket liv du har kvar
		} if (liv == 0) { System.out.println(" ");						
		System.out.println("Du förlorade! ordet var "+ word);    
		break;															// när du har gissat fel 10 gånger så förlorar du
		
		}
		boolean win= true;
		
		for (int i = 0; i < invertedWord.length(); i++){ // kollar om alla "spaces" har blivit streck då har du vunnit
			if (invertedWord.charAt(i) == '-') {
				System.out.print(word.charAt(i));
			} else { 											// annars blir win false 
				win = false;
				System.out.print('-');
	
			
		}	
			
		} System.out.println();
		if (win) { System.out.println("Du vann");    // När du vinner visas det på konsolen
		break;
		}
	} System.out.println("vill du spela igen");  
	String igen= sc.nextLine();	
	if (igen.equals("nej")) { 			//Om du inte vill spela igen skriver du bara nej annars kan du skriva vilken bokstav som helst och den börjar om
	break;
		
	}
		
		
		
			
	}	
			
			
	}
		
					
	
}


