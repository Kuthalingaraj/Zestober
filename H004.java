import java.util.Scanner;

public class H004 {
    public static void main(String[] args) {
        int A, B, C;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Integers of A,B,C :");
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        int result = secondLargestInteger(A, B, C);
        System.out.println(A + " " + B + " " + C + " " + "The Second Largest Integer is --->" + " " + result);
        scan.close();
    }

    private static int secondLargestInteger(int a, int b, int c) {
        /*
         * Incase all the integers are same return any one a b c ...
         */
        if (a == b && b == c && c == a) {
            return a;

            /*
             * This statement to pass the all test case in the given task...
             */
        } else if ((a > b && b < c && c > a) || (a < b && b > c && c < a)) {
            return a;

        } else if ((a > b && b > c && c < a) || (a < b && b < c && c > a)) {
            return b;
        } else if ((a < b && b > c && c > a) || (a > b && b < c && c < a)) {
            return c;
        }
        /*
         * Incase The Two Integers Are Same But another is Different
         * eg --> 6 6 5 , 5 6 6, 6 5 6 || 6 6 7 , 7 6 6 , 6 7 6
         */
        if (a == b && b > c && c < a) {
            return c;

        } else if (a < b && b == c && c > a) {
            return a;

        } else if (a > b && b < c && c == a) {
            return b;

        } else if (a == b && b < c && c > a) {
            return a;

        } else if (a > b && b == c && c < a) {
            return b;

        } else if (a < b && b > c && c == a) {
            return c;
        }

        return -1;
    }

}