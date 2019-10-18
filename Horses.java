import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> strengths = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int Pi = in.nextInt();
            strengths.add(Pi);
        }
        
        Collections.sort(strengths);
		int minimal = strengths.get(1) - strengths.get(0);
		
		for (int i = 2; i < strengths.size(); i++)
		{
			int delta = strengths.get(i) - strengths.get(i - 1);
			minimal = Math.min(minimal, delta);
		}
        
        
        System.out.println(minimal);
    }
}
