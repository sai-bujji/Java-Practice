package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String ar[]) {
		int[] arr = {1, 2, 1, 3,2, 4, 5};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting()));
		
		map.forEach((a, b) -> {
			System.out.println(a+    "    "+b);
		});
	}
}