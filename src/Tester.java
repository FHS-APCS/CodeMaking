
public class Tester {

	public static void main(String[] args) {
		String plainText = "Nima's pants are on fire!!!?!!";
		String cipherText = Cipher.rotationCipherEncrypt(plainText, 3, Cipher.ALPHABET);

		System.out.println("Plaintext: " + plainText);
		System.out.println("Cipertext: " + cipherText);
		
		plainText = Cipher.rotationCipherDecrypt(cipherText, 3, Cipher.ALPHABET);
		System.out.println("Plaintext: " + plainText);
	}

}