package practice.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescendingOrder
{
    
	public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(5, 2, 8, 1, 9);
	System.out.println(sortDescending(nums));	
	    
	}
	
	public static List<Integer> sortDescending(List<Integer> nums){
	    
	    return nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
}