import java.util.ArrayList;

public class Arraylist {
public static void main(String[] args) {

int[] Jonny= {1,2,3,4,5};
String[] Pontus = {"Sträng", "nej9"};		

for (int i = 0; i < Pontus.length; i++) {
System.out.println(Jonny[i]);
	
}
ArrayList <String> nameList = new ArrayList<>();

nameList.add("Ibbe");
nameList.add("Ahmed");
nameList.add("Ole");

for (int i = 0; i < nameList.size(); i++) {
System.out.println(nameList.get(i)+ "");
}
System.out.println();

	
}

} 

