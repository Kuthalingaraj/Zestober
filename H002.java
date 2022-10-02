import java.util.Scanner;
/* Without Using any Inbuilt functions :
 * Using While Loop for find firstNumber:
 */
public class H002 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        N = sc.nextInt();
        int firstDigit = 0;
        int lastDigit = 0;
        int sum = 0;

        lastDigit = N % 10;
        while (N != 0) {
            firstDigit = N % 10;
            N = N / 10;
        }
        sum = firstDigit + lastDigit;
        System.out.println("The Sum of the First and Last Digit is :" + sum);
        sc.close();

    }
}