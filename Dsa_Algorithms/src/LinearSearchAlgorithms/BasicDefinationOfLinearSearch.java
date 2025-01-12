package LinearSearchAlgorithms;

public class BasicDefinationOfLinearSearch {

	public static void main(String[] args) {
		System.out.println("Hello This is Linear Search \n "
				+ "We are searching the element by traversing to lenght of the array!!! \n" + 
				"---------------------------------------------------------------------");
		//array
		int arr[] = {1,4,54,56,65,56657,766,868};
		//number that need to find
		int target = 56657;
		boolean isLinear = findNumber(arr,target);
		System.out.println("It's" + isLinear + " and exist in the array");
	}
	
	
	//time complexity of linear search is
	/*
	 * O(n) worst case
	 * O(1) best case (if we found the element at index 1)
	 */
	static boolean findNumber(int arr[],int num) {
		
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return true;
			}
		}
		
		return false;
	}

}
