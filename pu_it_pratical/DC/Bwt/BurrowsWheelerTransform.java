import java.util.*;
public class BurrowsWheelerTransform {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the text to transform: ");
 String text = scanner.nextLine();
 String transformedText = transform(text);
 System.out.println("Transformed text: " + transformedText);
 System.out.println("Decode Message:"+text);
 }
 public static String transform(String text) {
 int length = text.length();
 String[] rotations = new String[length];
 for (int i = 0; i < length; i++) {
 rotations[i] = text.substring(i) + text.substring(0, i);
 }
 Arrays.sort(rotations);
 StringBuilder sb = new StringBuilder();
 for (int i = 0; i < length; i++) {
 sb.append(rotations[i].charAt(length - 1));
 }
 return sb.toString();
 }
}