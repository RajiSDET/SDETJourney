package dsa.week10;

public class Max_consequtive1s {

	public static int findIndexOfZero(int[] arr) {
        int maxLen = 0;       // Maximum length of continuous ones
        int maxIndex = -1;    // Index of zero to be replaced
        int left = 0;         // Left pointer for the sliding window
        int countZeros = 0;   // Count of zeros in the current window

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                countZeros++;
            }

            // If the window size exceeds (count of zeros > 1), move the left pointer
            while (countZeros > 1) {
                if (arr[left] == 0) {
                    countZeros--;
                }
                left++;
            }

            // Update the maximum length and index if a longer sequence is found
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                maxIndex = left;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 1, 1, 1};
        int index = findIndexOfZero(arr);
        
        if (index != -1) {
            System.out.println("Index of 0 to be replaced: " + index);
        } else {
            System.out.println("No 0 found in the array.");
        }
    }
}

/*

 
 INPUT - int[] array of 0's and 1's only 
 OUTPUT - return one index
 
PSEUDO CODE -

Initialization

maxLen: This variable keeps track of the maximum length of continuous ones found.
maxIndex: This variable stores the index of the zero that needs to be replaced for the maximum sequence.
left: It represents the left pointer of the sliding window.
countZeros: This variable keeps track of the count of zeros within the current window.
Iterating Through the Array

Loop through each element in the array:
If the current element is 0, increment the countZeros as it indicates we found a zero within the current window.
Adjusting the Window

The algorithm uses a sliding window approach where the left pointer (left) is adjusted whenever the count of zeros in the window exceeds one.
The while loop condition WHILE countZeros > 1 checks if the number of zeros within the window is more than one. If yes, it moves the left pointer (left) to exclude the earliest zero in the window. This helps maintain the window with at most one zero.
Tracking the Maximum Length Sequence

Within the main loop:
It calculates the current length of the continuous sequence of ones (right - left + 1).
Updates maxLen and maxIndex whenever a longer sequence is found.
maxLen stores the length of the longest continuous sequence of ones.
maxIndex keeps track of the index of the zero that, when replaced, gives the maximum continuous sequence of ones.
Return

After iterating through the entire array, the function returns the maxIndex, which holds the index of the zero that needs to be replaced to achieve the maximum length sequence of continuous ones.

 Raji- Should mark as redo
*/

/*

 Given a binary array, 
 find the index of 0 to be replaced with 1 to get a maximum length sequence of continuous ones.

For example, consider array { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 }. 
The index to be replaced is 7 to get a continuous sequence of length 6 containing all 1’s.

 */
