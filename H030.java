import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class H030 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Size of Array :");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        // In this c variable is uses for controll the memory management
        // if the user enter the number of array 4*4(n*n) then the half
        // of the c is stored in the list(8) then store and print twice in
        // each character.......
        int c = ((n * n) / 2);

        ArrayList<Character> list = new ArrayList<Character>();
        for (char i = 32; i < 32 + c; i++) {
            list.add(i);
        }
        // This method is used to shuflle of all characters like
        // unsorted characters and stored the list from the arrayllist
        Collections.shuffle(list);

        // System.out.println(list);

        memoryGame(list, n);
        scan.close();
    }

    private static void memoryGame(ArrayList<Character> list, int n) {
        char[][] memory = new char[n][n];

        for (int i = 0; i < memory.length; i++) {
            for (int j = 0; j < memory.length; j++) {
                Random rand = new Random();
                memory[i][j] = list.get(rand.nextInt(list.size()));

            }
        }
        printArray(memory);
    }

    private static void printArray(char[][] memory) {
        for (int i = 0; i < memory.length; i++) {
            for (int j = 0; j < memory.length; j++) {
                System.out.print(memory[i][j] + " ");
            }
            System.out.println();
        }
    }
}