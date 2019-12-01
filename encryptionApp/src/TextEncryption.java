/**
 *
 * This class act as DI
 * inject the correct Object ( which implements the Encryption Interface )
 *
 */

public class TextEncryption {
    Encryptable encryptionAlgorithm;

    public TextEncryption(Encryptable encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public String Encrypte(String text){
        return this.encryptionAlgorithm.encrypte(text);
    }

    public String Decrypte(String text){
        return this.encryptionAlgorithm.decrypte(text);
    }
}