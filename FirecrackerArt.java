// Jiyeon Kim
// CS 141
// HW Core Topics: using nested loops
//
// This program will make an ASKII Art
public class FirecrackerArt {
    
    public static final int HEIGHT = 8;

    public static void main(String[] args) {
        firstAndEndPart();
        frontAndBackOfMainSquare();
        marmaidPatternInSquare1();
        marmaidPatternInSquare2();
        marmaidPatternInSquare1();
        frontAndBackOfMainSquare();
        firstAndEndPart();
        makeTTTBoard();
    }

    //this method draws the big triangle shape on the first and end part.
    public  static  void firstAndEndPart() {
        for (int i=1; i<HEIGHT; i++) {
            for (int j=(HEIGHT-i); j>=1; j--) {
                System.out.print(" ");
            }
            System.out.print("//");
            for (int j=1; j<=(i-1)*2; j++) {
                System.out.print("!");
            }
            System.out.print("\\\\");
            System.out.println();
        }
    }

    // this is the connecting part of the each end part(triangle) and main square part
    public  static  void frontAndBackOfMainSquare(){
        System.out.print("+");
        for (int i=1; i<= 2*HEIGHT; i++ ) {
            System.out.print("~");
        }
        System.out.print("+");
        System.out.println();
    }

    //this method draws the up-side-down-triangle pattern part
    public  static  void marmaidPatternInSquare1() {
        for(int i=1; i<HEIGHT+1; i++) {
            System.out.print("[");
            for (int j=1; j<i; j++) {
                System.out.print("-");
            }
            for (int j=HEIGHT; j>=i; j--) {
                System.out.print("\\/");
            }
            for (int j =1; j<i; j++) {
                System.out.print("-");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    //this method consist the middle part of the square which appears only once.
    public  static  void marmaidPatternInSquare2() {
        for(int i=1; i<=HEIGHT-2; i++) {
            System.out.print("[");
            for (int j = HEIGHT-2; j >= i; j--) {
                System.out.print("/");
            }
            for (int j = 1; j <= 2 * (i + 1); j++) {
                System.out.print("-");
            }
            for (int j = HEIGHT-2; j >= i; j--) {
                System.out.print("\\");
            }
            System.out.print("]");
            System.out.println("");
        }
    }
    public static void makeTTTBoard() {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                System.out.print("-");
            }
            System.out.println("");

            for (int j = 1; j < 4; j++) {
                System.out.print("| - ");
            }
            System.out.println("|");
        }
        for (int j = 1; j < 14; j++) {
            System.out.print("-");
        }
    }
}

/*
    //\\
   //!!\\
  //!!!!\\
 //!!!!!!\\
+~~~~~~~~~~+
[\/\/\/\/\/]
[-\/\/\/\/-]
[--\/\/\/--]
[---\/\/---]
[----\/----]
[///----\\\]
[//------\\]
[/--------\]
[\/\/\/\/\/]
[-\/\/\/\/-]
[--\/\/\/--]
[---\/\/---]
[----\/----]
+~~~~~~~~~~+
    //\\
   //!!\\
  //!!!!\\
 //!!!!!!\\

Process finished with exit code 0
 */