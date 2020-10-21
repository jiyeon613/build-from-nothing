//Jiyeon Kim
//CS141 2020summer
//
//This program is going to calculate the scores of 2 applicants
import java.util.*;

public class Admissions {

    //this is a main method that calls all the following methods.
    public static void main(String[] args) {
        introduction();

        System.out.println("Information for applicant #1:");
        double x = runexamCalculator ();
        double y = runGpaCalculator();
        System.out.println(" ");

        System.out.println("Information for applicant #2:");
        double w = runexamCalculator ();
        double z = runGpaCalculator();


        report(x,y,z,w);
    }

    //this method introduces the program.
    public static void introduction(){
        System.out.println("This program compares two applicants to");
        System.out.println("determine which one seems like the stronger");
        System.out.println("applicant.  For each candidate I will need");
        System.out.println("either SAT or ACT scores plus a weighted GPA.");
        System.out.println(" ");
    }

    //this method will ask applicants whether they took SAT or ACT and call the other method
    // that matches with the applicant's exam type and that calculates the score.
    //then print the exam score on console.
    public static double runexamCalculator (){
        Scanner console1 = new Scanner(System.in);
        int examtype;
        System.out.print("  do you have 1) SAT scores or 2) ACT scores?");
        examtype = console1.nextInt();
        double examScore = 0;
        if (examtype == 1) {
            examScore = runSatCalculator();
        } else if (examtype ==2) {
            examScore = runActCalculator();
        }
        System.out.print("  exam score = ");
        System.out.printf("%.1f%n",examScore);
        return examScore;
    }

    //this method will take an user's SAT subscores, calculate it and return the final  SAT score.
    public static double runSatCalculator(){
        int math, criticalReading, writing;

        Scanner console2 = new Scanner(System.in);
        System.out.print("  SAT math?");
        math = console2.nextInt();

        Scanner console3 = new Scanner(System.in);
        System.out.print("  SAT critical reading?");
        criticalReading = console3.nextInt();

        Scanner console4 = new Scanner(System.in);
        System.out.print("  SAT writing?");
        writing = console4.nextInt();

        double examScore= (2*math + criticalReading + writing)/32.0;
        return examScore;

    }

    //this method will take an user's ACT subscores, calculate it and return the final  ACT score.
    public static double runActCalculator (){

        int english, math, reading, science;

        Scanner console5 = new Scanner(System.in);
        System.out.print("  ACT English?");
        english = console5.nextInt();

        Scanner console6 = new Scanner(System.in);
        System.out.print("  ACT math?");
        math = console6.nextInt();

        Scanner console7 = new Scanner(System.in);
        System.out.print("  ACT reading?");
        reading = console7.nextInt();

        Scanner console8 = new Scanner(System.in);
        System.out.print("  ACT science?");
        science = console8.nextInt();

        double examScore = (english+2*math+reading+science)/1.8;
        return examScore;
    }

    //this method will take an user's GPA info, calculate it and return the final GPA score.
    //it also prints the GPA score on console.
    public static double runGpaCalculator(){
        double overall, max,transcriptMultiplier;

        Scanner console9 = new Scanner(System.in);
        System.out.print("  overall GPA? ");
        overall = console9.nextDouble();

        Scanner console10 = new Scanner(System.in);
        System.out.print("  max GPA ?");
        max = console10.nextDouble();

        Scanner console11 = new Scanner(System.in);
        System.out.print("  Transcript Multiplier? ");
        transcriptMultiplier = console11.nextDouble();

        double gpaScore = (overall*100*transcriptMultiplier)/max;
        System.out.print("  GPA score = ");
        System.out.printf("%.1f%n",gpaScore);
        System.out.println(" ");
        return gpaScore;
    }

    //report overall score of each applicants (rounded to 1 decimal)
    //print who is better.
    public static void report(double a, double b, double c, double d){

        double overallForApplicant1 = a + b;
        double overallForApplicant2 = c + d;

        System.out.print("First applicant overall score  = ");
        System.out.printf("%.1f%n", overallForApplicant1);

        System.out.print("Second applicant overall score = ");
        System.out.printf("%.1f%n", overallForApplicant2);

        if (overallForApplicant1 > overallForApplicant2) {
            System.out.print("The first applicant seems to be better");
        } else if (overallForApplicant2 > overallForApplicant1){
            System.out.print("The second applicant seems to be better");
        } else {System.out.print("The two applicants seem to be equal.");}

    }
}


/*
This program compares two applicants to
determine which one seems like the stronger
applicant.  For each candidate I will need
either SAT or ACT scores plus a weighted GPA.

Information for applicant #1:
  do you have 1) SAT scores or 2) ACT scores?1
  SAT math?450
  SAT critical reading?530
  SAT writing?490
  exam score = 60.0
  overall GPA? 3.4
  max GPA ?4.0
  Transcript Multiplier? 0.9
  GPA score = 76.5


Information for applicant #2:
  do you have 1) SAT scores or 2) ACT scores?2
  ACT English?25
  ACT math?20
  ACT reading?18
  ACT science?15
  exam score = 54.4
  overall GPA? 3.3
  max GPA ?4.0
  Transcript Multiplier? 0.95
  GPA score = 78.4

First applicant overall score  = 136.5
Second applicant overall score = 132.8
The first applicant seems to be better
Process finished with exit code 0

 */