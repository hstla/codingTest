import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> possibleNumbers = new ArrayList<>();
        for (int i = 123; i <= 987; i++) {
            String number = Integer.toString(i);
            if (isValidNumber(number)) {
                possibleNumbers.add(number);
            }
        }

        for (int i = 0; i < n; i++) {
            String query = sc.next();
            int strikes = sc.nextInt();
            int balls = sc.nextInt();

            possibleNumbers.removeIf(number -> !isPossible(number, query, strikes, balls));
        }

        System.out.println(possibleNumbers.size());
    }

    public static boolean isValidNumber(String number) {
        return number.charAt(0) != number.charAt(1)
                && number.charAt(0) != number.charAt(2)
                && number.charAt(1) != number.charAt(2)
                && !number.contains("0");
    }

    public static boolean isPossible(String number, String query, int strikes, int balls) {
        int strikeCount = 0;
        int ballCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (number.charAt(i) == query.charAt(j)) {
                    if (i == j) strikeCount++;
                    else ballCount++;
                }
            }
        }
        return strikeCount == strikes && ballCount == balls;
    }
}


