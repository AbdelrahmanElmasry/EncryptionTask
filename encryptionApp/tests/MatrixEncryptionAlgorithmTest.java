import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixEncryptionAlgorithmTest {

    @Test
    public void encrypte() {
        MatrixEncryptionAlgorithm Encryption = new MatrixEncryptionAlgorithm();
        assertEquals("JGMHNINJEIIGGLNFSTFWINOKFWUUS\\UMTONVPRVSIWRPO\\SOTONVPRVSIWRPO\\SO]ZS\\[Y]UKeZV^l]Q",Encryption.encrypte("Hello"));
    }
}