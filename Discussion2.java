import java.util.*;

public class Discussion2 {
    public static void main(String[] args){
        chooseTheNumber();
    }

    public static void chooseTheNumber(){
        Scanner console = new Scanner(System.in);
        String numbers = " 1 2 3 4 5 6 7 8 9";
        String typednumebrs = " ";
        for (int i=1; i<=9; i++) {
            int number = 0;
            String newString = " ";
            System.out.print("type a number between 1~9 >  ");
            number = console.nextInt();
            newString = (" "+ number);
            while (!numbers.contains(newString) || typednumebrs.contains(newString)) {
                System.out.println("Try again.");
                System.out.print("type a number between 1~9 >  ");
                number = console.nextInt();
                newString = (" "+ number);
            }
            typednumebrs += newString;
            System.out.print("Except the numbers:" + typednumebrs +", ");

        }
        System.out.println("You have no more numbers.");
    }
}
/*
type a number between 1~9 >  3
Except the numbers:  3, type a number between 1~9 >  2
Except the numbers:  3 2, type a number between 1~9 >  4
Except the numbers:  3 2 4, type a number between 1~9 >  5
Except the numbers:  3 2 4 5, type a number between 1~9 >  9
Except the numbers:  3 2 4 5 9, type a number between 1~9 >  8
Except the numbers:  3 2 4 5 9 8, type a number between 1~9 >  1
Except the numbers:  3 2 4 5 9 8 1, type a number between 1~9 >  6
Except the numbers:  3 2 4 5 9 8 1 6, type a number between 1~9 >  6
Try again.
type a number between 1~9 >  7
Except the numbers:  3 2 4 5 9 8 1 6 7, You have no more numbers.

Process finished with exit code 0

 */
