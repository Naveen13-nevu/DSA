package Practice3;

public class KadanesAlgorithm {

	public static void main(String[] args) {

		int arr[] = {-2,1,-3,4,-1,2,3,4,-5};
		
		int sum = arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(sum<0) {
				sum = arr[i];
			}
			else {
				sum = sum + arr[i];
			}
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println(max);
		
	}

}
