import java.util.Scanner;

/*
 * In this Task I Will not use a Upper case inbuilt 
 * String Method try to solve ASCII Value and passes the all Testcases
 */
public class H006 {

    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Sentences :");
        str = scan.nextLine();
        captaliseFirstLetter(str);
        scan.close();
    }

    public static void captaliseFirstLetter(String str) {
        char[] x = str.toCharArray();
        int size = x.length;

        x[0] = (char) (x[0] - 32);

        for (int i = 1; i < size; i++) {
            if (x[i] == ' ') {
                x[i + 1] = (char) (x[i + 1] - 32);
            }
        }
        System.out.print(str+" -->");
        System.out.println(x);
    }
}