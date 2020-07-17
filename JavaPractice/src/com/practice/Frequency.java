package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {
		 int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
		 
		 Map<Integer, Integer> map = new HashMap<>();
		 
		 for (int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		 System.out.println(map);
	}

}
