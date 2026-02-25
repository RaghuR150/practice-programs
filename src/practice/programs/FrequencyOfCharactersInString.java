package practice.programs;

import java.util.Map;
import java.util.stream.Collectors;

// count the frequency of characters in a given string
public class FrequencyOfCharactersInString
{
	public static void main(String[] args) {
	    String s = "hello world";
	    System.out.println(countCharacterFrequency(s));
		
	}
	
	public static Map<Character,Long> countCharacterFrequency(String str){
	    return str.chars().mapToObj(c -> (char) c )
	                        .filter(c -> !Character.isWhitespace(c))
	                        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	}
}