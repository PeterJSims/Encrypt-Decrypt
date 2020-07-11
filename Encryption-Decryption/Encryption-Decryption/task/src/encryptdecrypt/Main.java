package encryptdecrypt;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {
        String operation = "enc";
        String text = "";
        int key = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-mode")) {
                operation = args[i + 1];
            }
            if (args[i].equals("-key")) {
                key = Integer.parseInt(args[i + 1]);
            }
            if (args[i].equals("-data")) {
                text = args[i + 1];
            }
        }
        if (operation.equals("enc")) {
            System.out.println(encrypt(text, key));
        }
        if (operation.equals("dec")) {
            System.out.println(decrypt(text, key));
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
