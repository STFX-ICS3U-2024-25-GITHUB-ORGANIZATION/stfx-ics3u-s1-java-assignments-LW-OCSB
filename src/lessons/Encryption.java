package lessons;

public class Encryption {

	public static void main(String[] args) {

		char myChar = 'A';
		int asciiValue = (int)myChar;
		int shift = 3;
		asciiValue = asciiValue + shift;
		char encryptedChar = (char)asciiValue;
		System.out.println(encryptedChar);

	}

}
