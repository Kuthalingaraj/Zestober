//In this task use 3 for loops for print 
//the characters like the task
public class H014 {

    public static void main(String[] args) {
        alphabets();
    }

    private static void alphabets() {

        int totalAlphabets = 26;
        int alphabetStarting = 97;
        int alphabetEnding = 122;
        for (int row = 0; row < totalAlphabets; row++) {

            for (int coloumn = row + alphabetStarting; coloumn <= alphabetEnding; coloumn++) {
                System.out.print((char) coloumn + " ");
            }
            for (int empCol = 1; empCol <= row; empCol++) {
                System.out.print((char) ((alphabetStarting)) + " ");
                // Increment the values of the empty column
                // print like a,ab,abc,abcd....
                alphabetStarting = alphabetStarting + 1;
            }
            // Again intial the origninal value
            // because the next iteration dont change the character
            alphabetStarting = 97;

            System.out.println();
        }

    }
}