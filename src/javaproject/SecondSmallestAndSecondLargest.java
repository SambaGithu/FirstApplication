package javaproject;

public class SecondSmallestAndSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr = {3,1,5,3,6,7};
    int max = arr[0];
    int min = arr[0];
    int n  = arr.length;
    for(int i = 1;i<n;i++) {
    	if(arr[i]>max) {
    		max=arr[i];
    	}
    	if(arr[i]<min) {
    		min=arr[i];
    	}
    }
    System.out.println(min);
    System.out.println(max);
	}

}
