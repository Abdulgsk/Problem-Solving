import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();
        
        int comparisonResult = str1.compareTo(str2);
        
        if (comparisonResult < 0) {
            System.out.println(-1);
        } else if (comparisonResult > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}