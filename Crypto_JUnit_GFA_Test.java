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

public class Crypto_JUnit_GFA_Test {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
		assertTrue(CryptoManager.stringInBounds("THIS TEST SHOULD SUCCEED"));
	}
}

/*
 * Programmer Name: Nicholas Prakoso
 */