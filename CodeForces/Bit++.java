import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String operation = sc.nextLine();
            if (operation.indexOf('+') != -1){
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}