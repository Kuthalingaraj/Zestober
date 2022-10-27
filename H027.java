import java.util.Scanner;

public class H027 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Number :");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arithmeticDoneModulo(n);
        scan.close();
    }

    private static void arithmeticDoneModulo(int n) {
        int modo;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                modo = (i * j) % n;
                System.out.print(modo + " ");
            }
            System.out.println();
        }
    }
}