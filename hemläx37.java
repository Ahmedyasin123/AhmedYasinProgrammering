package lek3;

import java.util.ArrayList;
import java.util.Scanner;

public class hemläx37 {

public static void main(String[] args) {
	
ArrayList<Integer> inList=new ArrayList<Integer> (); 

inList.add(10);
inList.add(13);
inList.add(10);
inList.add(10);
inList.add(10);

Integer summa= summa (inList);
System.out.println(summa);

}
static int summa (ArrayList<Integer> value) {     
Integer summa=0;	


for (Integer nummer : value) {
summa +=nummer; 

}

return summa;
		


}
	

	
}
	





