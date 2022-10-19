import java.util.Scanner;

public class H019 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        n = scan.nextInt();
        int[][] arr = new int[n][n];
        int count = counterArray(arr, n);
        System.out.println("For the Given array The Number of 5's are " + count);
        scan.close();

    }

    private static int counterArray(int[][] arr, int n) {
        int count = 0;
        int integer = 0;
        // To Store the random integer 1 through 5
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = integer < 5 ? ++integer : --integer;
                //Use Ternary Operator to count the Number 5
                count = arr[i][j] == 5 ? count += 1 : count;
            }
        }
        // Print the random integer Stored Array:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        return count;
    }

}