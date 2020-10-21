//Jiyeon Kim
//CS 141
//HW Core Topics: To learn how to use Array and ArrayList properly and to make a Mancala game using them.
//
//This Program will play a Solitaire Mancala Game.
import java.util.*;

public class Mancala {

    //This is a main method.
    public static void main(String[] args){

        //This array stores the 2 information: the number of buckets and the number of stones user typed.
        int[] gameSetUp = new int[2];

        //This array stores a number of stones that is in a goal bucket.
        int[] goal = new int[1];
        int move =1;

        introduction();
        setUp(gameSetUp);

        //This array stores how many stones are in each bucket.
        int[] stonesInTheBuckets = new int[gameSetUp[0]];

        //This array stores the buckets with 0 in each.
        int[] emptyBucket = new int[gameSetUp[0]];

        //This for loop makes a random numbers in the buckets.
        for(int i=0; i<gameSetUp[1]; i++) {
            Random rand = new Random();
            int num = rand.nextInt(gameSetUp[0]); // num = between 0 ~ (input-1)
            stonesInTheBuckets[num]++;
        }

        //This while looks check whether the buckets are empty or not, and then go to next move if it is not empty.
        while(IsItDone(stonesInTheBuckets, emptyBucket) == false){
            System.out.println(" ");
            System.out.println("== Move #" + move + " ==");
            printTheBoard(stonesInTheBuckets, goal);
            moveTheStones(stonesInTheBuckets, goal);
            move++;
        }

        //If the buckets are empty, then the games is end here.
        System.out.println(" ");
        System.out.println("Nice job! all stones moved togoal in " + move + " moves.");

    }

    //A method to print the introduction text.
    public static void introduction(){
        System.out.println("This program will play a modified solitaire version of\n" +
                "the game of Mancala. Your goal is to get all the stones\n" +
                "from the buckets on the left into the goal on the right\n" +
                "in the least number of moves possible.\n");
    }

    //This method sets up the number of buckets and stones in the game.
    public static void setUp(int[] values){

        Scanner inputBuckets= new Scanner(System.in);
        Scanner inputStones= new Scanner(System.in);
        System.out.println("Before we begin the game, choose:");
        System.out.print("\tHow many buckets do you want? > ");
        values[0] = inputBuckets.nextInt();
        System.out.print("\tHow many stones do you want? >  ");
        values[1] = inputStones.nextInt();
        System.out.println(" ");
        System.out.println("Ok, let's play...");
        System.out.println(" ");

    }

    //This method checks whether the game is over or not.
    public static boolean IsItDone(int[] bucketArray, int[] emptyArray){
        if(Arrays.equals(bucketArray, emptyArray)) {
            return true;
        } else{
            return false;
        }
    }

    //This is a method that prints the board.
    public static void printTheBoard(int[] bucketArray, int[] goalArray){
        System.out.print("Stones: ");
        for (int i=0; i<bucketArray.length; i++) {
            System.out.print("| " + bucketArray[i] + " ");
        }

        System.out.println("| >> " + goalArray[0] + " <<");
        System.out.print("Buckets: ");
        for(int i=0;i<bucketArray.length ;i++){
            System.out.print("-" + (i+1) + "- ");
        }
        System.out.println("   GOAL");
    }

    //This is a method that moves the stones.
    public static void moveTheStones(int[] bucketArray, int[] goalArray){

        Scanner input = new Scanner(System.in);
        System.out.print("Which bucket? > ");
        int choice = input.nextInt();

        int stones = bucketArray[choice-1];
        int goalCountPerMove = 0;
        System.out.print(stones + " stones moved. ");

        bucketArray[choice-1] = 0;
        
        while(stones > 0 && choice < bucketArray.length){
            bucketArray[choice]++;
            choice++;
            stones--;

        }

        if(stones>0) {
            goalArray[0]++;
            stones--;
            goalCountPerMove++;
        }

        do {
            if (stones > 0) {
                int index = 0;
                do {
                    bucketArray[index]++;
                    index++;
                    stones--;

                } while (stones > 0 && index < bucketArray.length);

            }
            if(stones > 0) {
                goalArray[0]++;
                stones--;
                goalCountPerMove++;
            }

        } while(stones >0);

        if(goalCountPerMove > 1) {
            System.out.println(goalCountPerMove + " stones added to goal.");
        } else{
            System.out.println(goalCountPerMove + " stone added to goal.");
        }


    }
}

/*
This program will play a modified solitaire version of
the game of Mancala. Your goal is to get all the stones
from the buckets on the left into the goal on the right
in the least number of moves possible.

Before we begin the game, choose:
	How many buckets do you want? > 3
	How many stones do you want? >  4

Ok, let's play...


== Move #1 ==
Stones: | 1 | 0 | 3 | >> 0 <<
Buckets: -1- -2- -3-    GOAL
Which bucket? > 3
3 stones moved. 1 stone added to goal.

== Move #2 ==
Stones: | 2 | 1 | 0 | >> 1 <<
Buckets: -1- -2- -3-    GOAL
Which bucket? > 1
2 stones moved. 0 stone added to goal.

== Move #3 ==
Stones: | 0 | 2 | 1 | >> 1 <<
Buckets: -1- -2- -3-    GOAL
Which bucket? > 3
1 stones moved. 1 stone added to goal.

== Move #4 ==
Stones: | 0 | 2 | 0 | >> 2 <<
Buckets: -1- -2- -3-    GOAL
Which bucket? > 2
2 stones moved. 1 stone added to goal.

== Move #5 ==
Stones: | 0 | 0 | 1 | >> 3 <<
Buckets: -1- -2- -3-    GOAL
Which bucket? > 3
1 stones moved. 1 stone added to goal.

Nice job! all stones moved togoal in 6 moves.

Process finished with exit code 0
 */