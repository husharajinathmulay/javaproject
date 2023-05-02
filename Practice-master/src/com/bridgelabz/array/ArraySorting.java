package com.bridgelabz.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// sort array 

public class ArraySorting {

	public static void main(String[] args) {

		int a[] = { 5, 6, 3, 4, 6, 3, 4, 6 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[i] < a[j]) {
					temp = a[i];

					a[i] = a[j];

					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(" " + a[i]);
		}

		// convert int array to List

		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

		System.out.println(list.toString());
		
		
		System.out.println("===============================================");

		// convert array list to array

		int array1[] = list.stream().mapToInt(i -> i).toArray();
		for (int i : array1) {
			System.out.println(" " + i);
		}
		
		
		// sort element in descending order
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size()-1 ; j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));

					list.set(j,temp);
				}
			}
		}
		
		System.out.println(list);
		

	}

}
