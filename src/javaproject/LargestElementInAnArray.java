package javaproject;

import java.util.Arrays;

public class LargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int  [] arr= {2,3,6,1,21,2,4,5};
         int len = arr.length;
         int max = arr[0] ;
         for(int j =0;j<len;j++) {
        	
        	if(arr[j]>max) {
        		max=arr[j];
        	}
         }
         
         System.out.println(max);
	}
	

}
