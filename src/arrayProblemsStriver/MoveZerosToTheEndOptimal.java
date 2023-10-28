package arrayProblemsStriver;

import java.util.Arrays;

public class MoveZerosToTheEndOptimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int [] ar = moveZeros();
		System.out.println(Arrays.toString(ar));
	}
	public static int[] moveZeros() {
		int [] arr = {1,2,0,5,0,6,0,2,0};
		int n = arr.length;
		int j=-1;
		for(int i= 0;i<n;i++) {
			if(arr[i]==0) {
				j=i;
				break;
			}
		}
		if(j==-1) {
			return arr;
		}
		for(int i=j+1;i<n;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
				j++;
			}
			
		}
		return arr;
	}

}
