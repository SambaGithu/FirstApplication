package arrayProblemsStriver;
import java.util.ArrayList;
import java.util.Arrays;
public class MoveZorosToTheEndBrute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,3,4,0,5,0,0,0,0,6,0,5};
		ArrayList<Integer> temp=new ArrayList<>();
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			if(arr[i]!=0) {
				temp.add(arr[i]);
			}
		}
		for(int i = 0;i<temp.size();i++) {
			arr[i]=temp.get(i);
		}
		for(int i =temp.size();i<n;i++) {
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
	}

}
