package arrayProblemsStriver;

public class LargestElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int arr[] = {1,3,555,10,2,15};
	int n=arr.length;
	int max=arr[0];
	for(int i=1;i<=n-1;i++) {
		if(arr[i]>max){
			max=arr[i];
			}
		}
	System.out.println(max);

}
}
