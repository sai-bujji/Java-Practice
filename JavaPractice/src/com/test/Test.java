package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String arr[]) {
		Integer ar[] = {-2,8,4,-7,4,-1,8,-6,-1,-8, 9,-4,10,10,8};
		List<List<Integer>> mainList = new ArrayList<>();
		for(int i=0; i<ar.length-1; i++){
			for(int j=i+1; j<ar.length-1; j++){
				for(int k=j+1; k<ar.length; k++){
					List<Integer> li = new ArrayList<>();
					if(ar[i]+ar[j]+ar[k] == 0){
						li.add(ar[i]);
						li.add(ar[j]);
						li.add(ar[k]);
					}
					if(li!=null && li.size()>0) {
						mainList.add(li);
					}
					
				}
			}
		}
		System.out.println(mainList);
	}
	
}