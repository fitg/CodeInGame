
import java.util.*;
import java.io.*;

public class Solution_Test extends TestCase {
	//
	// /!\ Unit Tests are optional but highly recommended /!\
	//

	public void testCountLettersSimple() {
		String p = "Hello World";
		Map<String, Integer> types = Solution.countLetters(p);
		
		assertEquals((int)types.get(Solution.VOWELS), 3);
		assertEquals((int)types.get(Solution.CONSONANTS), 7);
	}
	
	public void testCountLettersComplex() {
		String p = "Hello %^&%^%!%!%!World";
		Map<String, Integer> types = Solution.countLetters(p);
		
		assertEquals((int)types.get(Solution.VOWELS), 3);
		assertEquals((int)types.get(Solution.CONSONANTS), 7);
	}
	
	public void testReverseAndToggle() {
		String p = "Hello World";
		
		assertEquals(Solution.reverseWordsAndToggleCase(p), "wORLD hELLO");
	}
	
	public void testInsertSpecial() {
		String p = "oaeiu";
		
		assertEquals(Solution.insertSpecial(p), "pvopvapvepvipvu");
	}
	
	public void testInsertSpecialCaseSens() {
		String p = "Oaeiu";
		
		assertEquals(Solution.insertSpecial(p), "pvOpvapvepvipvu");
	}

}
