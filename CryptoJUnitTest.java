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

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CryptoJUnitTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.stringInBounds("THIS TEST SHOULD BE INBOUNDS"));
		assertFalse(CryptoManager.stringInBounds("FAIL BECAUSE { IS OUTSIDE THE RANGE"));
		assertFalse(CryptoManager.stringInBounds("fail because of lowercase letters"));
		assertFalse(CryptoManager.stringInBounds("FAIL BECAUSE OF ESC CHAR "+((char) 27)));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("UFTUJOH",CryptoManager.encryptCaesar("TESTING", 1));
		assertEquals(";,:;05.G(56;/,9G:;905.", CryptoManager.encryptCaesar("TESTING ANOTHER STRING", 999));
		assertEquals("4188;LC;>80", CryptoManager.encryptCaesar("HELLO WORLD", 300));
	}
	
	@Test
	public void testDecryptCaesar() {
		assertEquals("TESTING", CryptoManager.decryptCaesar("UFTUJOH", 1));
		assertEquals("TESTING ANOTHER STRING", CryptoManager.decryptCaesar(";,:;05.G(56;/,9G:;905.", 999));
		assertEquals("HELLO WORLD", CryptoManager.decryptCaesar("4188;LC;>80", 300));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("WN#\\N &", CryptoManager.encryptBellaso("TESTING", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("UJ^^((HT^X[YYM\"", CryptoManager.encryptBellaso("MERRY CHRISTMAS", "HELLO"));
		assertEquals("PR%UKP:K_\\VF=8V", CryptoManager.encryptBellaso("MERRY CHRISTMAS", "CMSC207")); 
		
	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("TESTING", CryptoManager.decryptBellaso("WN#\\N &", "CIPHER_IS_LONGER_THAN_THE_PLAIN_TEXT"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.decryptBellaso("UJ^^((HT^X[YYM\"", "HELLO"));
		assertEquals("MERRY CHRISTMAS", CryptoManager.decryptBellaso("PR%UKP:K_\\VF=8V", "CMSC207")); 

	}

}

/*
 * Programmer Name: Nicholas Prakoso
 */