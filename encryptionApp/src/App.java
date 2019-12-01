/**
 * Implementation of encryption/decryption algorithms
 * The App involved in both ways, encryption and decryption methods
 *
 * It was developed as an delivering a Hiring Task for Robusta
 * Entry Point of the app
 * @author  Abdelrahman Amer
 * @version 1.0
 * @since   2019-12-1
 *
 * @license MIT
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    static  MatrixEncryptionAlgorithm matrix = new MatrixEncryptionAlgorithm();
    static  ShiftEncryptionAlgorithm shift = new ShiftEncryptionAlgorithm();
    static TextEncryption Encryption;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text Encryption/Decryption Console App");

        System.out.println("Enter the text :");
        String text = scanner.nextLine();
        System.out.println("\n1-Shift Algorithm");
        System.out.println("2-Matrix Encryption Algorithm");
        System.out.println("Choose Algorithm number then press Enter..");
        try {
            int algChoise = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n1-Encrypte");
            System.out.println("2-Decrypte\n");
            System.out.println("Choose Method number then press Enter..");
            int method = scanner.nextInt();
            //
            // According to the user choice inject the algorithm object
            //
            switch (algChoise) {
                case 1:
                    Encryption = new TextEncryption(shift);
                    break;
                case 2:
                    Encryption = new TextEncryption(matrix);
                    break;

            }
            if (method == 1) {
                System.out.println("Encrypted text : " + Encryption.Encrypte(text));
            } else if (method == 2) {
                System.out.println("decrypted text : " + Encryption.Decrypte(text));
            }
        }catch (InputMismatchException ex){
            System.out.print("Invalid choise\n\n");
            main(null);
        }

    }
}
