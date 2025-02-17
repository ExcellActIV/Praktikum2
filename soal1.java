import java.math.BigInteger;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of case test: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] inputs = new String[n];
        
        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextLine();
        }
        
        for (int i = 0; i < n; i++) {
                BigInteger number = new BigInteger(inputs[i]);
                System.out.println("\n"+inputs[i] + " can be fitted in:");
                
            // Cek untuk byte
            if (number.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && 
                number.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                System.out.println("* byte");
            }
            
            // Cek untuk short
            if (number.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && 
                number.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                System.out.println("* short");
            }
            
            // Cek untuk int
            if (number.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && 
                number.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                System.out.println("* int");
            }
            
            // Cek untuk long
            if (number.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && 
                number.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                System.out.println("* long");
            }
            if (number.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                System.out.println(inputs[i] + " can't be fitted anywhere.");
            }
        }
        
        sc.close();
    }
}