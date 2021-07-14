package cinetPtest;

public class TestMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int rechercheProbleme1(String[] book ,String word, int start, int end) {
		int number =-1;
		if(start>end) return -1;
		
		double mid = Math.floor((start+end)/2);
		
		if(book[(int) mid] == word) {
			if(number==-1) number=0;
			number = number++;
		}
		if(word.equals(book[(int) mid]))
			 rechercheProbleme1(book, word, start, (int) (mid-1));
		else
			 rechercheProbleme1(book, word, start, (int) (mid-1));
		return number;
	}
	
	private static int countOccurence(String someString, char searchedChar, int index) {
	char [] tab = new char[someString.length()];
	if(index >=someString.length()) return 0;
	int count =someString.charAt(index)==searchedChar ? 1:0;
	if(count ==0) {}else {
		int position =someString.charAt(index)+1;
		tab[position]=searchedChar;
	}
	
	word(tab);
	return count + countOccurence(someString, searchedChar, index+1);
	}
	
	private static char [] word(char[] tab) {
		return tab;
	}

}
