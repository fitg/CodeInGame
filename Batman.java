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
        int[] mid = {W/2,H/2};
        int i = 0;
        int[] cur = {0,0};

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            // Write an action using System.out.println()
            System.err.println(bombDir);
            
            if(i == 0)
            {
                cur[0] = mid[0];
                cur[1] = mid[1];
            }
            else {
                switch (bombDir) {
                case "U":  
                    cur[1]--;
                    break;
                case "UR":
                    cur[0]++;
                    cur[1]--;
                    break;
                case "R":
                    cur[1]++;
                    break;
                case "DR":
                    cur[0]++;
                    cur[1]++;
                    break;
                case "D":
                    cur[1]++;
                    break;
                case "DL":
                    cur[0]--;
                    cur[1]--;
                    break;
                case "L":
                    cur[1]--;
                    break;
                case "UL":
                    cur[0]--;
                    cur[1]--;
                    break;
                default: 
                    cur[0] = mid[0];
                    cur[1] = mid[1];
                    break;
                }
            }
            System.err.println( cur[0] +" "+ cur[1]);
            // the location of the next window Batman should jump to.
            System.out.println( cur[0] +" "+ cur[1]);
            i++;
        }
    }
 
}
