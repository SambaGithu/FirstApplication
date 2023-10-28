package arrayProblemsStriver;

import java.util.Arrays;

public class MoveZerosToTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]  = {3,5,0,0,2,1,5};
		int n = arr.length;
		int i =0;
		
		for(int j = 1;j<n;j++) {
			if(arr[i]==0&& arr[j]>0) {
				
				arr[i]=arr[j];
				arr[j]=0;
				i++;
			}//else if(arr[i]==0 && )
		}
		System.out.println(Arrays.toString(arr));
	}

}
