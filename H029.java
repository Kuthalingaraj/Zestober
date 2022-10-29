import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class H029 {
    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number of Integers :");

        n = scan.nextInt();

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        System.out.println("Enter the FirstList Integer :");

        for (int i = 0; i < n; i++) {

            list1.add((scan.nextInt()));
        }

        System.out.println("Enter the SecondList Integer :");

        for (int i = 0; i < n; i++) {

            list2.add((scan.nextInt()));
        }
        

        // System.out.println(list1);
        // System.out.println(list2);

        int find = check(list1, list2, 0, 0, 0);

        System.out.println(list1+" "+list2+"------> "+sameElements(list1, list2, find));
        scan.close();
    }

    private static boolean sameElements(ArrayList<Integer> list1, ArrayList<Integer> list2, int n) {
        Collections.sort(list1);
        Collections.sort(list2);
        if (n == list1.size() || n == list2.size()) {
            return true;
        }
        return false;
    }

    private static int check(ArrayList<Integer> list1, ArrayList<Integer> list2, int i, int j, int count) {

        if ((list1.size() != list2.size()) || (i > list1.size() - 1) || (j > list2.size() - 1)) {
            return count;
        }

        if (list1.get(i) == list2.get(j)) {
            count += 1;
            i += 1;
            j += 1;

            return check(list1, list2, i, j, count);

        } else {
            i += 1;
            j += 1;

            return check(list1, list2, i, j, count);
        }

    }

}
