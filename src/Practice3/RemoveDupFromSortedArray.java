package Practice3;

public class RemoveDupFromSortedArray {
	
	
	public static int removeDuplicates(int arr[]) {
		
		int n = arr.length;
		int i=0;
		
		if(n==0) {
			return 0;
		}
		for(int j=0;j<n;j++) {
			if(arr[j]!= arr[i]) {
				i++;
				arr[i] = arr[j];
			}
		}
		
		
		return i+1;
	}

	public static void main(String[] args) {

		int arr[] = {1,1,2,2,3,4,5,6,6,7,10};
		int result = removeDuplicates(arr);
		System.out.print(result);
		

	}

}
