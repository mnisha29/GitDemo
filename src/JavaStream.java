import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class JavaStream {
	// this class we learned 2 methods (streamfilter, streammap) using lambda
	// (count,limit,concat)

	//@Test
	public void regular() {
		// TODO Auto-generated method stub
		// count the number of name starting with A alphabet in the list
		ArrayList<String> names = new ArrayList<String>();
		names.add("abi");
		names.add("bob");
		names.add("ayadhu");
		names.add("ambi");
		names.add("nisha");
		names.add("amahi");
		names.add("naven");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("a")) {
				count++;
			}
		}
		System.out.println(count);
	}

	//@Test
	public void streamFilter() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("abi");
		names.add("bob");
		names.add("ayadhu");
		names.add("ambi");
		names.add("nisha");
		names.add("amahi");
		names.add("naven");

		// there is no life for intermediate operation,if there is no terminal operation
		// terminal operation will execute only if intermediate operation return true
		long namecount = names.stream().filter(s -> s.startsWith("a")).count();
		System.out.println(namecount);

		long d = Stream.of("abi", "bob", "ayadhu", "ambi", "nisha", "amahi", "naven").filter(s -> 
		{
			s.startsWith("a");
			return true;
		}).count();
		System.out.println(d);

		// print all the names of array list contains more-than 4-letters
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		// print only one name which contains more-than 4-letters
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	//@Test
	public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("mani");
		names.add("sanju");
		names.add("hema");
		// print names which have last letter having "a" with uppercase
		Stream.of("abi", "bob", "ayadhu", "ambi", "nisha", "amahi", "navena").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		// print names which have first letter as "a" with uppercase and sorted
		List<String> names1 = Arrays.asList("abi", "bob", "ayadhu", "ambi", "nisha", "amahi", "navena");
		names1.stream().filter(s -> s.startsWith("a")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		// concat- merging two different list and replacing names
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().map(s -> s.replace("hema", "ishu")).forEach(s -> System.out.println(s));
		// find the names is present or not
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("nisha"));
		Assert.assertTrue(flag);
	}

	// @Test
	public void streamCollect() {
		List<String> ls = Stream.of("abi", "bob", "ayadhu", "ambi", "nisha", "amahi", "navena")
				.filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(1));

		// print unique number and sort the array
		List<Integer> num = Arrays.asList(1, 8, 4, 4, 5, 6, 5, 3);
		num.stream().distinct().forEach(s -> System.out.println(s));
		List<Integer> num2 = num.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(num2.get(3));
	}

}
