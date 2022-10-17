import java.util.Scanner;

public class H017 {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Arrays :");
        n = scan.nextInt();
        int[][] pattern = new int[n][n];

        checkerBoardPattern(pattern, n);
        printCheckerBoardPattern(pattern, n);
        scan.close();
    }
    private static void checkerBoardPattern(int[][] pattern, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pattern[i][j] = (i + j) % 2 == 0 ? 1 : 2;
            }
        }

    }

    private static void printCheckerBoardPattern(int[][] pattern, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }

    

}