package hangman;
import java.util.ArrayList;

public class uppgift2 {

	public class Summera {

		public void main(String[] args) {

			String ord = "Ahmed";
			ArrayList<String> list = new ArrayList<String>();
			String resultat = recursiveMethod(ord, ord.length(), list);

			System.out.println(resultat);
		}

		public String recursiveMethod(String ord, Integer index, ArrayList<String> letters) {

			String result = "";

			String s = Character.toString(ord.charAt(index));
			letters.add(s);

			if (index != 0) {
				recursiveMethod(ord, index, letters);
			}

			return result;
		}

	}

}
	