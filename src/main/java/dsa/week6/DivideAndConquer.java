package dsa.week6;

public class DivideAndConquer {
	
	int divideAndConquerSearch(int[] arr, int target) {
	    int left = 0;
	    int right = arr.length - 1;
	    
	    return binarySearch(arr, target, left, right);
	}
	
	int binarySearch(int[] arr, int target, int left, int right) {
	    if (left > right) {
	        // Element not found
	        return -1;
	    }
	    
	    int mid = left + (right - left) / 2;
	    
	    if (arr[mid] == target) {
	        // Element found at index 'mid'
	        return mid;
	    } 
	    // If the middle element is less than the target, search the right half
	    else if (arr[mid] < target) {
	        // Search the right half
	        return binarySearch(arr, target, mid + 1, right);
	    } 
	    // If the middle element is greater than the target, search the left half
	    else {
	        // Search the left half
	        return binarySearch(arr, target, left, mid - 1);
	    }
	}

}



/*Divide and Conquer -> detailed pseudo-code:

The divideAndConquerSearch function is the entry point. 
It initializes the binary search by calling binarySearch with the initial parameters.

The binarySearch function is a recursive function that performs the binary search. 
It follows the divide and conquer strategy:

//BREAKING CONDITION COMPUTATION-
It first checks if the left index is greater than the right index. 
If it is, this means that the target element is not in the array, so it returns -1.

It calculates the middle index (mid) to divide the array into two halves.
If the middle element is the target, it returns the index of that element.
If the middle element is less than the target, it recursively searches the right half of the array.
If the middle element is greater than the target, it recursively searches the left half of the array.

Function divideAndConquerSearch(arr, target):
    # Call the binarySearch function with the initial parameters
    return binarySearch(arr, target, 0, length(arr) - 1)

Function binarySearch(arr, target, left, right):
    # Base case: If left is greater than right, the element is not in the array
    If left > right:
        Return -1

    # Calculate the middle index
    mid = left + (right - left) / 2

    # If the middle element is the target, return its index (mid)
    If arr[mid] == target:
        Return mid

    # If the middle element is less than the target, search the right half
    If arr[mid] < target:
        Return binarySearch(arr, target, mid + 1, right)

    # If the middle element is greater than the target, search the left half
    Return binarySearch(arr, target, left, mid - 1)

*/
