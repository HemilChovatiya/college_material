import java.util.*;
public class MoveToFront {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text to encode: ");
        String text = scanner.nextLine();
        String encodedText = encode(text);
        System.out.println("Encoded text: " + encodedText);
        String decodedText = decode(encodedText);
        System.out.println("Decoded text: " + text);
    }
    public static String encode(String text) {
        List < Character > alphabet = new ArrayList < > ();
        for (int i = 0; i < 256; i++) {
            alphabet.add((char) i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int index = alphabet.indexOf(c);
            sb.append(index);
            alphabet.remove(index);
            alphabet.add(0, c);
        }
        return sb.toString();
    }
    public static String decode(String encodedText) {
        List < Character > alphabet = new ArrayList < > ();
        for (int i = 0; i < 256; i++) {
            alphabet.add((char) i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < encodedText.length(); i++) {
            int index = Integer.parseInt(Character.toString(encodedText.charAt(i)));
            char c = alphabet.get(index);
            sb.append(c);
            alphabet.remove(index);
            alphabet.add(0, c);
        }
        return sb.toString();
    }
}