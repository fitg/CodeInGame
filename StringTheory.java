import java.util.*;
import java.io.*;

public class Solution {

	final static String VOWELS = "vowels";
	final static String CONSONANTS = "consonants";
	final static String SEPARATOR = "::";
	final static String INTERNAL_SEPARATOR = " ";
	final static String DASH = "-";
	final static String SPECIAL = "pv";

	public static String run(String p) {
		/*
		* Some work here; return type and arguments should be according to the problem's requirements
		*/
		String combined_queries = "";
		Map<String, Integer> types = countLetters(p);
		combined_queries+= types.get(VOWELS) + INTERNAL_SEPARATOR + types.get(CONSONANTS) + SEPARATOR;
		combined_queries+= reverseWordsAndToggleCase(p) + SEPARATOR;
		combined_queries+= p.replace(" ","-") + SEPARATOR;
		combined_queries+= insertSpecial(p);
		return combined_queries;
	}
	
	public static Map<String, Integer> countLetters (String input) {
        int vowels = 0, consonants = 0;
        input = input.toLowerCase();
        
        Map<String, Integer> types = new HashMap<>();
        for(int i = 0; i < input.length(); ++i)
        {
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
        }
        types.put(VOWELS,vowels);
        types.put(CONSONANTS,consonants);
        return types;
        
	}
	
	public static String reverseWordsAndToggleCase(String input) {
		String reverse = "";
		String[] array = input.split(INTERNAL_SEPARATOR);
		
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			reverse += array[i] + INTERNAL_SEPARATOR;
		}
		
		reverse = toggleCase(reverse);
        
        return reverse.trim();
	}
	
	public static String toggleCase(String input) {
	    StringBuilder toggled = new StringBuilder(input.length());
	    for (char letter : input.toCharArray()) {
	        if(Character.isUpperCase(letter)) {
	            letter = Character.toLowerCase(letter);
	        } else if(Character.isLowerCase(letter)) {
	            letter = Character.toUpperCase(letter);
	        }
	
	        toggled.append(letter);
	
	    }
	    return toggled.toString();
	}
	
	public static String insertSpecial(String input) {
        String original = input;
        input = input.toLowerCase();
        StringBuilder special = new StringBuilder();
        
        for(int i = 0; i < input.length(); ++i)
        {
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                special.append(SPECIAL);
                
            } 
            special.append(original.charAt(i));
        }
        return special.toString();
	}
}
