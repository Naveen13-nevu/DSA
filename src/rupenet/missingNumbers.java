package rupenet;

public class missingNumbers {

	public static void main(String[] args) {

		int arr[] = {1,2,3,5};
		int n = 5;
		
		for(int i=1;i<n;i++) {
			
			boolean isFound = false;
			for(int j=0;j<arr.length;j++) {
				if(arr[j] == i) {
					isFound = true;
					break;
				}
			}
			if(!isFound) {
				System.out.println("Missing number is : "+i );
			}
			
		}

	}

}
