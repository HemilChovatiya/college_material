import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
class Huffman {
    public static void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of string:");
        int n = sc.nextInt();
        char charArray[] = new char[n];
        System.out.println("Enter Characters of String:");
        for (int k = 0; k < n; k++) {
            charArray[k] = sc.next().charAt(0);
        }
        int charfreq[] = new int[n];
        System.out.println("Enter Frequency of characters:");
        for (int k = 0; k < n; k++) {
            charfreq[k] = sc.nextInt();
        }
        PriorityQueue < HuffmanNode > q = new PriorityQueue < HuffmanNode > (n, new MyComparator());
        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.data = charfreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }
        HuffmanNode root = null;
        while (q.size() > 1) {
            HuffmanNode x = q.peek();
            q.poll();
            HuffmanNode y = q.peek();
            q.poll();
            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
            q.add(f);
        }
        System.out.println("Generated Binary code : ");
        printCode(root, "");
    }
}
class HuffmanNode {
    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}
class MyComparator implements Comparator < HuffmanNode > {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.data - y.data;
    }
}