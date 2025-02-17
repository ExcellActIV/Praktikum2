import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            long N = sc.nextLong();
            System.out.println("N can be fitted in:");
        
            if (Long.MAX_VALUE < N) {
                System.err.println("N can't be fitted anywhere.");
            } 
            if (Byte.MIN_VALUE <= N && N <= Byte.MAX_VALUE) {
                System.err.println("* byte");
            }
            if (Short.MIN_VALUE <= N && N <= Short.MAX_VALUE) {
                System.err.println("* short");
            }
            if (Integer.MIN_VALUE <= N && N <= Integer.MAX_VALUE) {
                System.err.println("* int");
            }
            if (Long.MIN_VALUE <= N && N <= Long.MAX_VALUE) {
                System.err.println("* long");
            }
        } catch (Exception e) {
            System.out.println("N can be fitted in:");
            System.out.println("N can't be fitted anywhere.");
            
        } finally {
            sc.close();
        }
    }
}