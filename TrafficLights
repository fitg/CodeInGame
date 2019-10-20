import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    
    static final int METER = 5;
    static final int SECONDS = 18;
    static final double MTOKM = 3.6;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();
        int speedlimit = speed;
        int speedms = METER*speed/SECONDS;
        int lightCount = in.nextInt();
        System.err.println(lightCount);
        for (int i = 0; i < lightCount; i++) {
            int distance = in.nextInt();
            int duration = in.nextInt();
            if((distance/speedms) > duration){
                speed = (int)(duration*MTOKM);
            } else {
                speed = speed;
            }
            
            System.err.println(distance +" "+duration);
            System.err.println(speedms);
        }
        
        speed = (speed >= speedlimit ? speedlimit : speed); 
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.err.println(speed);
        System.out.println(speed);
    }
}
