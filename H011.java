import java.util.Scanner;

public class H011 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        str = scan.nextLine();
        stringPattern(str);

        scan.close();
    }

    private static void stringPattern(String str) {
        char[] c = str.toCharArray();
        int length = c.length;
        int count = 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(c[j]);
            }
            System.out.print(" ");
            count++;

        }

    }
}