package BinarySearchAlgorithms;

public class DescendingOrderBinarySearch {

	public static void main(String[] args) {
		/*
		 * we have to divide the array into two parts left and right
		 */
		int arr[] = {98,97,94,95,92,84,52,-8,-9,-2,-23,-96,-108};
		
		int index = reverseBinarySearch(arr,-2);
		System.out.println("We found the target value at index :- " + index);
	}
	
	//making method for binary search
	static int reverseBinarySearch(int[] arr,int target) {
		
		//make start and end variable
		int start = 0;
		int end = arr.length-1;
		
		//making loop but condition should be start is not should be greater than end
		while(start <= end) {
			
			//dividing the array into two parts by taking mid value of the array
			int mid = start + (end-start)/2;
			if(target<arr[mid]) {
				start = mid+1;
			}else if(target>arr[mid]) {
				end = mid - 1;
			}else {
				return mid;
			}
		}
		
		return -1;
	}
}
