import java.util.Scanner;

public class Laxa2 { 
	
public static void main(String[] args) {

System.out.println("skriv in i ett nummer");
Scanner input= new Scanner (System.in);
boolean running = true;
int summa = 0;

while(running) {  
	
	int tal1=input.nextInt();
	if (tal1==0) {
		running=false;
	}
	summa = summa + tal1;
	
}

System.out.println(summa);






}
}






