package leetcode942;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		String input = "IDID";
		
		MatchStringSolution output = new MatchStringSolution();
		
		int[] answer = output.diStringMatch(input);
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + Arrays.toString(answer));
	}
	
}
