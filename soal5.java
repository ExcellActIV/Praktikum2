import java.util.Scanner;

public class soal5 {
    public static String toTitleCase(String input) {
        char[] charArray = input.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);

        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String A = sc.next();

        System.out.print("Enter a second word: ");
        String B = sc.next();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        A = toTitleCase(A);
        B = toTitleCase(B);

        System.out.println(A + ' ' + B);

        sc.close();
    }
}
