package JavaDtypes;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;

		return false;
	}

	public boolean isAlphabet() {
		if ((ch <= 'Z' && ch >= 'A') || (ch <= 'z' && ch >= 'a')) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {

	}

	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub

	}

}
