import org.junit.Test;

import static org.junit.Assert.*;

public class ShiftEncryptionAlgorithmTest {

    @Test
    public void testShiftEncryption() {
        ShiftEncryptionAlgorithm Encryption = new ShiftEncryptionAlgorithm();
        assertEquals("Khoor Zruog",Encryption.encrypte("Hello World"));
    }
}