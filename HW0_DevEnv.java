//Jiyeon Kim
//CS 143
//HW core topics: setting up my dev environment
//
//This program will produce a "Hello World" program in Java.

import java.util.*;

public class HW0_DevEnv	{

    public static	void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Would you like to see Hello? > ");
        String answer  = scan.nextLine();

        while (answer.toLowerCase().equals("yes")) {
            for(int i	= 0 ;	i < 6	; i++	) {
                System.out.println("Hello World!");
            }

            System.out.print("Would you like to see Hello? > ");
            answer  = scan.nextLine();

        }
    }
}

/*

Would you like to see Hello? > yes
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!
Would you like to see Hello? > YES
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!
Would you like to see Hello? > Yes
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!
Would you like to see Hello? > yeS
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!
Hello World!
Would you like to see Hello? > yesss

Process finished with exit code 0


 */