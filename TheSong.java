//Ji Yeon Kim
//CS 141
//HW #2
// Core Topics: Static methods, printlns
//
//This program will print a song which has lots of repeated sentences.
// Lots of methods will be used to prevent redundancy.
public class TheSong {
    public static void main(String[] args) {
        verse1();
        endingVerse();
        verse1();
        verse2();
        verse1();
        verse3();
        verse1();
        verse4();
        verse1();
        verse5();
    }

    public static void verse1() {
        System.out.println("Hey there friends, my code is gonna rock");
        System.out.println("In my method named main, I'm typing 'round the clock");
    }

    public static void endingVerse() {
        System.out.println("I put a semicolon at the end of each line");
        System.out.println("I bet you've never seen code that looked so fine");
        System.out.println("");
    }

    public static void verse2() {
        System.out.println("jGrasp loves my code, but I still need to debug");
        System.out.println("I can rap in Java until it unplug");
        endingVerse();
    }

    public static void verse3() {
        System.out.println("The first time I try, my code compiles");
        System.out.println("Oh wait, no, I was wrong, there will be more trials");
        verse2();
    }

    public static void verse4() {
        System.out.println("Got help from Burton and it was swell");
        System.out.println("But I didn't need it cuz I code so well");
        verse3();
    }

    public static void verse5() {
        System.out.println("I submitted early to ensure correctness");
        System.out.println("Hey playa check this, I was done in time for breakfast");
        verse4();
    }

}
/*
Hey there friends, my code is gonna rock
In my method named main, I'm typing 'round the clock
I put a semicolon at the end of each line
I bet you've never seen code that looked so fine

Hey there friends, my code is gonna rock
In my method named main, I'm typing 'round the clock
jGrasp loves my code, but I still need to debug
I can rap in Java until it unplug
I put a semicolon at the end of each line
I bet you've never seen code that looked so fine

Hey there friends, my code is gonna rock
In my method named main, I'm typing 'round the clock
The first time I try, my code compiles
Oh wait, no, I was wrong, there will be more trials
jGrasp loves my code, but I still need to debug
I can rap in Java until it unplug
I put a semicolon at the end of each line
I bet you've never seen code that looked so fine

Hey there friends, my code is gonna rock
In my method named main, I'm typing 'round the clock
Got help from Burton and it was swell
But I didn't need it cuz I code so well
The first time I try, my code compiles
Oh wait, no, I was wrong, there will be more trials
jGrasp loves my code, but I still need to debug
I can rap in Java until it unplug
I put a semicolon at the end of each line
I bet you've never seen code that looked so fine

Hey there friends, my code is gonna rock
In my method named main, I'm typing 'round the clock
I submitted early to ensure correctness
Hey playa check this, I was done in time for breakfast
Got help from Burton and it was swell
But I didn't need it cuz I code so well
The first time I try, my code compiles
Oh wait, no, I was wrong, there will be more trials
jGrasp loves my code, but I still need to debug
I can rap in Java until it unplug
I put a semicolon at the end of each line
I bet you've never seen code that looked so fine


Process finished with exit code 0
 */
