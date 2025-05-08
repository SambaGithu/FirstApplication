package javaproject;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       selection_sort_method();
	}
    
	 static void selection_sort_method() {// arr= [3,6,9,2,1,5] & n=6
		
		int arr[] = {5,8,3,9,1,12,12};
		int n = arr.length;				
		
		for(int i = 0;i<n-1;i++) {
			int min = i;
			for(int j =i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
				int temp = arr[min];
				arr[min]= arr[i];
				arr[i]= temp;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
