import java.util.Scanner;

public class Zestober1 {
    private static void printProgram() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("RamRahim" + " ");
                continue;
            } else if (i % 3 == 0) {
                System.out.print("Ram" + " ");
                continue;
            } else if (i % 5 == 0) {
                System.out.print("Rahim" + " ");
                continue;
            } else {
                System.out.print(i + " ");
                continue;
            }
        }
    }

    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("1.PrintProgram\n2.CountProgram");
        int ch = choice.nextInt();
        switch (ch) {
            case 1:
                printProgram();
                break;
            case 2:
                counter();
                break;
            default:
                System.out.println("------Invalid------");
                break;
        }
        choice.close();
    }

    private static void counter() {
        long N;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number :");
        N = input.nextLong();

        input.close();
        int count = 0;
        while (N != 0) {
            long remainder = N % 10;
            if (remainder == 4) {
                count++;
            }
            N = N / 10;
        }
        System.out.println(count);
    }

}
