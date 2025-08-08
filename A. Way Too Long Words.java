import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String word = sc.nextLine();
            if(word.length() > 10) {
                StringBuilder sb = new StringBuilder();
                sb.append(word.charAt(0));
                sb.append(Integer.toString(word.length() - 2));
                sb.append(word.charAt(word.length() - 1));
                System.out.println(sb.toString());
            } else {
                System.out.println(word);
            }
        }
        
    }
}