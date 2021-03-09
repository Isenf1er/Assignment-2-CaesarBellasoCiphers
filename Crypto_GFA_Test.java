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

public class Crypto_GFA_Test {

	public static void main(String[] args) {

		String str1 = "\"THIS TEST SHOULD SUCCEED\"";
		String str4 = "HELLO WORLD"; 
		String str5 = "IFMMP!XPSME";


		boolean good = CryptoManager.stringInBounds(str1);	
		System.out.println(str1+" Is it in bounds? "+good);
	}
}

/*
 * Programmer Name: Nicholas Prakoso
 */