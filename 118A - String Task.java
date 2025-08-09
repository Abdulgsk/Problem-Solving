import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            char ch = Character.toLowerCase(c);
            if(!isVowel(ch)) {
                sb.append('.');
                sb.append(ch);
            }
        }
        
        System.out.print(sb.toString());
    }
    
    private static boolean isVowel(char c) {
        switch (c) {
            case 'a' : return true;
            case 'e' : return true;
            case 'i' : return true;
            case 'o' : return true;
            case 'u' : return true;
            case 'y' : return true;
            default : return false;
        }
    }
}