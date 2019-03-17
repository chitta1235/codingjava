package javasession2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateElementOfStringArray {

	public static void main(String[] args) {
		String[] character= {"java","php","hibernate","java"};
		System.out.println(Arrays.toString(character));
		LinkedHashSet<String> linkedHashset=new LinkedHashSet<>(Arrays.asList(character));
		String[] characterWithoutDuplicates= linkedHashset.toArray(new String[]{});
		System.out.println(Arrays.toString(characterWithoutDuplicates));

	}

}
