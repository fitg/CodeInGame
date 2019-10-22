import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

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
        boolean fail = false;
        Map<Integer, Integer> lightMap = new HashMap<>();
        System.err.println("Speed: " + speed);
        for (int i = 0; i < lightCount; i++) {
            int distance = in.nextInt();
            int duration = in.nextInt();
            lightMap.put(distance, duration);
        }
        
        for(int i = speedlimit; i > 0; i--) {
            
            speedms = METER*roundUp(i,SECONDS);
            fail = false;
            
            Iterator lightIterator = lightMap.entrySet().iterator();
            
            while (lightIterator.hasNext()) { 
                Map.Entry light = (Map.Entry)lightIterator.next(); 
                int distance = ((int)light.getKey()); 
                int duration = ((int)light.getValue());
                System.err.println("Speed: ["+ i + "]");
                System.err.println("Distance: " + distance);
                System.err.println("Duration: " + duration);
                System.err.println("Speedms: " + speedms);
                System.err.println("Lightspeed: " + distance/duration);
                System.err.println("Modulo: " + (distance/duration)%speedms);
                if(((distance/duration)%speedms != 0) && ((distance/duration)%speedms) < 10) {
                    fail = true;
                    System.err.println("setting to error");
                }
            }
            System.err.println("Fail state: " + fail);
            if (fail == false) {
                speed = i;
                break;
            }
        }
        

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        //System.err.println(speed);
        System.out.println(speed);
    }
    
    public static int roundUp(int num, int divisor) {
        return (num + divisor - 1) / divisor;
    }
}
