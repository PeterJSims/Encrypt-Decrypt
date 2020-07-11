package encryptdecrypt;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String stringToEdit = scanner.nextLine();
        int shift = scanner.nextInt();
        switch (command){
            case "enc":
                System.out.println(encrypt(stringToEdit, shift));
                break;
            case "dec":
                System.out.println(decrypt(stringToEdit, shift));
                break;
            default:
                break;
        }

    }


    public static String encrypt(String stringToEncrypt, int shift){
        StringBuilder returnString = new StringBuilder();
        char chars[] = stringToEncrypt.toCharArray();
        for (char c : chars) {
            char newChar;
            newChar = (char) (c + shift);
            returnString.append(newChar);
        }
        return returnString.toString();
    }
    public static String decrypt(String stringToDecrypt, int shift){
        StringBuilder returnString = new StringBuilder();
        char chars[] = stringToDecrypt.toCharArray();
        for (char c : chars) {
            char newChar;
            newChar = (char) (c - shift);
            returnString.append(newChar);
        }
        return returnString.toString();
    }

}
