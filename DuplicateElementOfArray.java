package javasession2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateElementOfArray {

	public static void main(String[] args) {
		Integer[] numbers={1,2,4,5,5,6,7,8,9};
		System.out.println(Arrays.toString(numbers));
		LinkedHashSet<Integer> linkedHashset=new LinkedHashSet<>(Arrays.asList(numbers));
		Integer[] numbersWithoutDuplicates=linkedHashset.toArray(new Integer[]{});
		System.out.println(Arrays.toString(numbersWithoutDuplicates));

	}

}
