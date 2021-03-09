/* 
* Class: CMSC203 
* Instructor: Ahmed Tarek
* Description: A program that can encrypt and decrypt words/phrases the user inputs using a key the user decides on. The two methods of encryption and decryption will be the Caesar Cipher and Bellaso Cipher
* Due: 3/8/2021
* Platform/compiler: Eclipse
* I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Print your Name here: Nicholas Prakoso
*/

public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	//Determines whether or not a string is in bounds of the ASCII codes
	public static boolean stringInBounds (String plainText) {
		boolean bound = true;
		for (int i = 0; i < plainText.length(); i++) {
			if (!(plainText.charAt(i) >= LOWER_BOUND && plainText.charAt(i) <= UPPER_BOUND)) {
				bound = false;
			}
		}
		return bound;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		String userInput = "";
		int x;
		//Makes sure key is in range
		while (key > UPPER_BOUND) {
			key = key - RANGE;
		}
		//encrypts each character one by one
		for (int i = 0; i < plainText.length(); i++) {
			x = plainText.charAt(i) + key;
			userInput += (char)x;
		}
		
		return userInput;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		String userInput = "";
		//encrypts each character one by one while making sure it is not out of the range of ASCII codes
		for (int i = 0; i < plainText.length(); i++) {
			int encryptedChar = ((int)plainText.charAt(i) + (int)bellasoStr.charAt(i%bellasoStr.length()));
			while (encryptedChar > (int)UPPER_BOUND) {
				encryptedChar -= RANGE;
			}
			userInput += (char)encryptedChar;
		}
		
		return userInput;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		String decryptedText = "";
		while (key > UPPER_BOUND) {
			key = key - RANGE;
		}
		//decrypts the encrypted string back to its original plain text
		for (int i = 0; i < encryptedText.length(); i++) {
			decryptedText += Character.toString(encryptedText.charAt(i) - key);
		}
		
		return decryptedText;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		String decryptedText = "";
		//decrypts the encrypted string back to its original plain text
		for (int i = 0; i < encryptedText.length(); i++) {
			int decryptedChar = ((int)encryptedText.charAt(i) - (int)bellasoStr.charAt(i%bellasoStr.length()));
			while (decryptedChar < (int)LOWER_BOUND) {
				decryptedChar += RANGE;
			}
			decryptedText += (char)decryptedChar;
		}
		
		return decryptedText;
	}
}

/*
 * Programmer Name: Nicholas Prakoso
 */