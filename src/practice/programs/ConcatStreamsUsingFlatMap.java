package practice.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreamsUsingFlatMap
{
    
	public static void main(String[] args) {
	List<Integer> list1 = Arrays.asList(1,2,3,4);
	List<Integer> list2 = Arrays.asList(5,6,7,8);
	
	System.out.println(concatLists(list1,list2));
	
	}
	
	public static List<Integer> concatLists(List<Integer> list1, List<Integer> list2){
	    return Stream.of(list1,list2).flatMap(l -> l.stream()).collect(Collectors.toList());
	}
}