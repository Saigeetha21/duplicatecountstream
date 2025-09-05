package StreamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ascending {
//
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,4,5,6,3);
		List<Integer> num = numbers.stream().sorted((n1,n2)->n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println(num);

	}

}
