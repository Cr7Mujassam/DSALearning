package BinarySearchAlgorithms;


//this is basic binary search algorithm
//remember the array has to be in sorted either in ascending order or descending order
/*
 * Time Complexity of this algorithm is
 * O(log n) worst case
 * O(1) in best case
 */
public class BasicBinarySearchDefination {

	public static void main(String[] args) {
		/*
		 * we have to divide the array into two parts left and right
		 */
		int arr[] = {1,2,3,4,5,6,7,8,9,12,13,18,23,45,67,86,543,12434,56778};
		
		int index = binarySearch(arr,45);
		System.out.println("We found the target value at index :- " + index);
	}
	
	//making method for binary search
	static int binarySearch(int[] arr,int target) {
		
		//make start and end variable
		int start = 0;
		int end = arr.length-1;
		
		//making loop but condition should be start is not should be greater than end
		while(start <= end) {
			
			//dividing the array into two parts by taking mid value of the array
			int mid = start + (end-start)/2;
			if(target>arr[mid]) {
				start = mid+1;
			}else if(target<arr[mid]) {
				end = mid - 1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}

}
