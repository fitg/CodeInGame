import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        int X1 = 0;
        int Y1 = 0;
        int X2 = W-1;
        int Y2 = H-1;
        int[] cur = {X0,Y0};
        
        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            // Write an action using System.out.println()
            //System.err.println(bombDir);
            //System.err.println( Y1 +" "+ Y2);
            //System.err.println( X1 +" "+ X2);
            
            switch (bombDir) {
            case "U": 
                Y2 = cur[1] - 1;
                break;
            case "UR":
                Y2 = cur[1] - 1;
                X1 = cur[0] + 1;
                break;
            case "UL":
                Y2 = cur[1] - 1;
                X2 = cur[0] - 1;
                break;
            case "R":
                X1 = cur[0] + 1;
                break;
            case "DR":
                Y1 = cur[1] + 1;
                X1 = cur[0] + 1;
                break;
            case "D":
                Y1 = cur[1] + 1;
                X2 = cur[0] - 1;
                break;
            case "DL":
                Y1 = cur[1] + 1;
                X2 = cur[0] - 1;
                break;
            case "L":
                X2 = cur[0] - 1;
                break;
            default: 
                System.err.println("unexpected");
                break;
            }
            cur[0] = X1 + (X2 - X1) / 2;
            cur[1] = Y1 + (Y2 - Y1) / 2;
            
            //System.err.println((Y2 - Y1) / 2);
            //System.err.println( cur[0] +" "+ cur[1]);
            // the location of the next window Batman should jump to.
            System.out.println( cur[0] +" "+ cur[1]);
            
        }
    }
 
}
