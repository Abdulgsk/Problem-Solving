import java.util.Scanner;
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matrix = new int[5][5];
        int rowIndex = -1, colIndex = -1;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    rowIndex = i;
                    colIndex = j;
                    break;
                }
            }
        }
        
        int moves = Math.abs(rowIndex - 2) + Math.abs(colIndex - 2);
        
        System.out.println(moves);
        
        scanner.close();
    }
}