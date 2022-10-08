import java.util.Scanner;

/*In this method i will simple to typecast char to int by ascii value */
public class H008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Sequences :");
        String str = scan.nextLine();
        integerSequences(str);

        scan.close();
    }

    private static void integerSequences(String str) {
        char[] sequence = str.toCharArray();
        int length = sequence.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {

            if (sequence[i] == ';') {
                sum += sequence[i - 1] - '0';

            } else if (i == length - 1) {
                sum += sequence[length - 1] - '0';
            }
        }
        System.out.println(sum);

    }

}