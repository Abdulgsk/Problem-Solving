import java.util.Scanner;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] numbers = input.split("\\+");
        
        int[] numArray = new int[numbers.length];
        int oneCount = 0, twoCount = 0, threeCount = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("1")) {
                oneCount++;
            } else if (numbers[i].equals("2")) {
                twoCount++;
            } else if (numbers[i].equals("3")) {
                threeCount++;
            }
        }
        
        for(int i = 0; i < oneCount; i++) {
            numArray[i] = 1;
        }
        for(int i = oneCount; i < oneCount + twoCount; i++) {
            numArray[i] = 2;
        }
        for(int i = oneCount + twoCount; i < numArray.length; i++) {
            numArray[i] = 3;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numArray.length; i++) {
            result.append(numArray[i]);
            if (i < numArray.length - 1) {
                result.append("+");
            }
        }
        
        System.out.println(result.toString());
        
        scanner.close();
    }
}