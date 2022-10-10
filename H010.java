import java.util.Scanner;

//In this task i use one while loop and inside the while loop add some 
//for loop to print the repeated characted pattern
public class H010 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Odd Sentence Word :");
        str = scan.nextLine();
        expandString(str);
        scan.close();
    }

    private static void expandString(String str) {

        char[] c = str.toCharArray();
        int mid = c.length / 2;
        System.out.println(mid);
        int i = 0;
        int countLeft = mid + 1;
        int countRight = 2;
        while (i < c.length) {
            if (i < mid) {

                for (int j = 0; j < countLeft; j++) {
                    System.out.print(c[i] + " ");
                }
                countLeft--;

            } else if (i == mid) {
                for (int j = 0; j < 1; j++) {
                    System.out.print(c[i] + " ");
                }
            } else if (i > mid) {

                for (int j = 0; j < countRight; j++) {
                    System.out.print(c[i] + " ");
                }
                countRight++;

            }
            i++;
        }

    }
}
