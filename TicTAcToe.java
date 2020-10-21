import java.util.*;
public class TicTAcToe {

    public static void main(int[] args){
        int[] boardState = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int player1 = 1;
        int player2 = -1;
        int none = 0;
        System.out.println("This is a board.");
        System.out.println("From the left top, the box is called 1 ~ 9");
        System.out.println("You are going to choose one empty box from the board");
        drawATicTacToeBoard(boardState);
    }
    public static void drawATicTacToeBoard(int[] arr){

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 17; j++) {
                System.out.print("-");
            }
            System.out.println("");

            for (int j = 1; j < 4; j++) {
                System.out.print("| " + arr[3*(i-1) + j-1] + " ");
            }
            System.out.println("|");
        }
        for (int j = 1; j < 17; j++) {
            System.out.print("-");
        }
    }
    public static void play(int[] arr) {

        String numbers = " 1 2 3 4 5 6 7 8 9";
        String typednumebrs = " ";
        int player;

        for (int i = 1; i <= 9; i++) {
            int choice = 0;
            String newString = " ";
            Scanner play = new Scanner(System.in);
            if (i % 2 == 1) {
                player = 1;
            } else {
                player = 2;
            }

            System.out.print("Player" + player + ", Choose from 1~9 > ");
            choice = play.nextInt();
            if (player == 1) {
                arr[choice - 1] = 1;
            } else {
                arr[choice - 1] = -1;
            }
            newString = (" " + choice);

            while (!numbers.contains(newString) || typednumebrs.contains(newString)) {
                System.out.println("Try again.");
                System.out.print("type a number between 1~9 >  ");
                choice = play.nextInt();
                if (player == 1) {
                    arr[choice - 1] = 1;
                } else {
                    arr[choice - 1] = -1;
                }
                newString = (" " + choice);
            }
            typednumebrs += newString;
            System.out.println("Except the numbers:" + typednumebrs + ", ");
            System.out.print("Player2, choose from 1~9 > ");
            drawATicTacToeBoard(arr);
        }
    }
}
