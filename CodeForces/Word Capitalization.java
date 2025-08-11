import java.util.Scanner;
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String capitalizedWord = capitalizeFirstLetter(input);
        
        System.out.println(capitalizedWord);
        
        scanner.close();
    }
    
    private static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}