import java.util.Scanner;

public class H018 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        n = scan.nextInt();
        char[][] pattern = new char[n][n];
        storePattern(pattern, n);
        print(pattern, n);
        scan.close();

    }

    private static void storePattern(char[][] pattern, int n) {
        char c = '#';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Just storing the character array from the given task:
                pattern[i][j] = (i == 0) || (j == 0) || (i == n - 1) || (j == n - 1) || (i == j) || (i + j == n - 1) ? c
                        : ' ';

            }

        }

    }

    private static void print(char[][] pattern, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print the Array of the stored Characters
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
