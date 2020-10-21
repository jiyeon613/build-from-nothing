import java.util.Scanner;
import java.util.Random;


public class Exam {
    public static void main(String[] args) {
        Scanner co = new Scanner(System.in);
        int output = co.nextInt();
        boolean answer = iB(output);
        System.out.print(answer);
    }
    public static boolean iB(int n){
        while(n>0){
            if(n%10 == 0 || n % 10 == 1){
                n/= 10;
            } else {
                return false;
            }
        }
        return true;
    }
}




