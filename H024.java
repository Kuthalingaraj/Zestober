import java.util.Scanner;

public class H024 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        n = scan.nextInt();
        System.out.println("The Digital Root of " + n + " is " + digitalRoot(n, 0));
        scan.close();
    }

    private static int digitalRoot(int n, int root) {
        // check if the root is greater 9 because single is digitalroot
        // and n==0 is compusolory
        if (n == 0 && root > 9) {
            n = root;
            root = 0;

        }

        // base Condition...
        if (n == 0) {
            return root;

        }
        // to calculate the digitalRoot
        if (n > 0) {

            root += n % 10;
            n /= 10;
        }
        return digitalRoot(n, root);
    }
}