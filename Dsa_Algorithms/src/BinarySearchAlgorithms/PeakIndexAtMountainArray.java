package BinarySearchAlgorithms;

//LeetCode Problem 852
public class PeakIndexAtMountainArray {

	public static void main(String[] args) {
		/*
		 * Input =  [0,2,1,0]
		 * Output: 1  //return the index
		 */
		
		int arr[] = {0,2,1,0};
		System.out.println(bruteForceSolution(arr));
		System.out.println(optimizedSolution(arr));
		
	}
	
	//time complexity O(n)
	static int bruteForceSolution(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return i;
			}
		}
		
		return -1;
	}
	
	static int optimizedSolution(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid]>arr[mid+1]) {
				end = mid ;
			}else {
				start = mid + 1;
			}
		}
		
		return start;
	}

}
