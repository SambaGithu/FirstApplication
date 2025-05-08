package javaproject;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {3,5,1,2,99,12};
    int n = arr.length;
    for(int i =1;i<=n-1;i++) {
    	int j = i;
    	while(j>0 && arr[j-1]>arr[j]) {
    		int temp = arr[j-1];
    		arr[j-1]=arr[j];
    		arr[j]=temp;
    		j--;
    	}
    }
    System.out.println(Arrays.toString(arr));
    
	}

}
