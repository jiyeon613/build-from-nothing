//Jiyeon Kim
//CS141 Summer2020
//
//this code is about making a SpamFiltering program using Scanner, File and PrintStream.

import java.util.*;
import java.io.*;


public class SpamFilter {
    public static final int Maximum = 2;

    //this is a main method. it scans emails.txt and finds a body of each email.
    //it then store the subject of email and run CountTHeSuspiciousWords(Scanner input) method to count
    //the censoring words.
    //Keep doing until there is no more "Subject: " exists.
    //Then run Summary method.
    public static void main (String[] args) throws FileNotFoundException {
        Scanner file = new Scanner (new File ("src/emails.txt"));
        String lineScan;
        String subject; int num;
        while(file.hasNextLine()) {
            do {
                lineScan = file.nextLine();
                System.out.println(lineScan); //delete later.
            } while (!lineScan.startsWith("Subject: "));
            subject = lineScan;
            num = CountTheSuspiciousWords(file);
        }
        //PrintStream summary = new PrintStream(new File("src/summary.txt"));
        //summary.println("Ignore the robots reading your emails...");
        //Summary (num, subject);

    }

    //this is a method to check whether an email is spam or not.
    public static int CountTheSuspiciousWords(Scanner f) {
        int count = 0;
        while (f.hasNextLine()){
            String line = f.nextLine();
            Scanner wordScan = new Scanner(line);
            String word = "";
            while (wordScan.hasNext() && !word.equals("---eom---"));{
                word = wordScan.next();
                System.out.println(word);
                String suspicious = " offer wire bank fund transfer lottery";
                word = word.toLowerCase();
                if (suspicious.contains(word)) {
                    count++;
                }

            }
        }

        return count;
    }

    //this method prints the summary of each email.
    public static void Summary(int number, String subj) throws FileNotFoundException{
        PrintStream summary = new PrintStream(new File("summary.txt"));
        if (number >= Maximum) {
            summary.print("**SPAM**");
        }
        summary.println("\t\t" + subj);
    }
}

/*
Exception in thread "main" java.io.FileNotFoundException: emails.txt (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:212)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:154)
	at java.base/java.util.Scanner.<init>(Scanner.java:639)
	at SpamFilter.main(SpamFilter.java:20)

Process finished with exit code 1

 */