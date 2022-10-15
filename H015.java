import java.util.HashMap;
import java.util.Map;

//In this task is challenging one 
//find some formula and solve the rows and columns
//for n=3

public class H015 {
    public static void main(String[] args) {
        int n = 3;
        rangoliPattern(n);

    }

    private static void rangoliPattern(int n) {
        String pattern = "-";
        int row = n + (n - 1);
        int column = row + (row - 1);

        int mid = column / 2;
        // System.out.println(mid);

        Map<Integer, Character> values = new HashMap<Integer, Character>();

        int alphabet = 1;

        // Store map using to get a character for rangoli pattern...

        for (char c = 'a'; c <= 'z'; c++, alphabet++) {
            values.put(alphabet, c);
        }

        // System.out.println(values);

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                // condition for ----c---- 1st and last row...
                if ((i == j - j) && (mid == j) || (i == row - 1) && (mid == j)) {
                    System.out.print(values.get(n) + " ");
                    continue;
                }
                // condition for --c---c--.......
                if ((i == 1) && (mid - 2 == j) || (i == 1) && (mid + 2 == j) || (i == row - 2) && (mid - 2 == j)
                        || (i == row - 2) && (mid + 2 == j)) {
                    System.out.print(values.get(n) + " ");
                    continue;
                    // condition for ----b----
                } else if ((i == 1) && (mid == j) || (i == row - 2) && (mid == j)) {
                    System.out.print(values.get(n - 1) + " ");
                    continue;

                }
                // c-b-a-b-c condition(print c condition)....
                if ((i == 2) && (j == 0) || (i == row - 3) && j == column - 1) {
                    System.out.print(values.get(n) + " ");
                    continue;
                }
                // (print b condition --b--b--)...
                else if ((i == 2) && (j == i) || (i == 2) && (j == column - 3)) {
                    System.out.print(values.get(n - 1) + " ");
                    continue;
                }

                else if ((i == 2) && (mid == j) || (i == row - 3) && (mid == j)) {
                    System.out.print(values.get(n - 2) + " ");
                    continue;

                }
                System.out.print(pattern + " ");

            }
            System.out.println();
        }
    }
}
