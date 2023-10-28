package javaproject;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int [] arr = {3,26,9,10,11,46,25,60};
         int n = arr.length;
         for(int i= 0;i<n;i++) {
        	 for(int j=0;j<n-1;j++) {
        		 if(arr[j]>arr[j+1]) {
        			 int temp = arr[j+1];
        			 arr[j+1]= arr[j];
        			 arr[j] = temp;
        		 }
        	 }
         }
         System.out.println(Arrays.toString(arr));
	}

}
