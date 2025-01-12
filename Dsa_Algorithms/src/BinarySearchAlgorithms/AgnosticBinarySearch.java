package BinarySearchAlgorithms;

public class AgnosticBinarySearch {

	public static void main(String[] args) {
		/*
		 * we have to divide the array into two parts left and right
		 */
		int arr[] = {98,97,94,95,92,84,52,-8,-9,-2,-23,-96,-108};
		int arr2[] = {1,2,3,4,5,6,7,8,9,12,13,18,23,45,67,86,543,12434,56778};
		
		int index = agnosticBinarySearch(arr,-2);
	    int index2 = agnosticBinarySearch(arr2,2);
		System.out.println("We found the target value at index :- " + index);
		System.out.println("We found the target value at index :- " + index2);
	}
	
	
	//making method for binary search
		static int agnosticBinarySearch(int[] arr,int target) {
			
			//make start and end variable
			int start = 0;
			int end = arr.length-1;
			
			//chaecking weather the array is ascending/descending
			boolean check = false;
			if(arr[0]<arr[arr.length-1]) {
				check = true;
			}
			
			//making loop but condition should be start is not should be greater than end
			while(start <= end) {
				
				//dividing the array into two parts by taking mid value of the array
				int mid = start + (end-start)/2;
				if(check) {
					if(target>arr[mid]) {
						start = mid+1;
					}else if(target<arr[mid]) {
						end = mid - 1;
					}
				}else {
					if(target<arr[mid]) {
						start = mid+1;
					}else if(target>arr[mid]) {
						end = mid - 1;
					}
				}
				
				if(arr[mid]==target) {
					return mid;
				}
			}
			
			return -1;
		}
}
