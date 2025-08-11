import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            int problemsSolved = 0;
            for(int j = 0; j < 3; j++) {
                if(sc.nextInt() == 1) {
                    problemsSolved++;
                }
            }
            if(problemsSolved >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}