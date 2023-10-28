package arrayProblemsStriver;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr = {1,3,6,9,12,16,15,14,17,18};
     int n= arr.length;
     int lar = arr[0];
     int secLar = arr[0];
     for(int i=0;i<n-1;i++) {
    	 if(arr[i+1]>arr[i]) {
    		 secLar=lar;
    		 lar = arr[i+1];
    		 
    	 }else if(arr[i+1]<arr[i]&& arr[i+1]>secLar) {
    		 secLar = arr[i+1];
    	 }
     }
     System.out.println(secLar);
	}

}
