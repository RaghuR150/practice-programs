package practice.programs;

import java.util.stream.Collectors;

public class AnagramUsingStreams
{
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		System.out.println(isAnagram(s1,s2));
	}
	
	public static boolean isAnagram(String s1, String s2){
	    return s1.chars().sorted().boxed().collect(Collectors.toList())
	    .equals(s2.chars().sorted().boxed().collect(Collectors.toList()));
	}
}