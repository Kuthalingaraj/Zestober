import java.util.Scanner;

//Reverse Number using a return type Method Int: 
public class H003 {
    public static void main(String[] args) {
        int N;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number :");
        N = scan.nextInt();
        scan.close();
        int result = reverseNumber(N);
        System.out.println(result);
    }

    private static int reverseNumber(int n) {
        int remainder = 0;
        int reverse = 0;
        while (n != 0) {
            remainder = n % 10;
            reverse = (reverse * 10) + remainder;
            n = n / 10;
        }

        return reverse;
    }
}
