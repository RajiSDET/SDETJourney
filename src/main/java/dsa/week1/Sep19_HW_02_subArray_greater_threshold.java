package dsa.week1;

public class Sep19_HW_02_subArray_greater_threshold {
	
public int numOfSubarrays(int[] arr, int k, int threshold) {
       
	int counter=0;
	int start=0;
	int end=k-1;
	
	while(end<arr.length)
	{
	int temp=0;
	for (int i = start; i <=end;i++) 
	{
		
		temp+=arr[i];
	}
	
	if(temp/k>=threshold)
	{
		counter++;
	}
	start++;
	end++;
		
    }
	return counter;

}}

/*PSEUDO CODE
 Inputs - int[] arr, int k , int threshold
 Output - int counter
 
Initialize int start = 0, int end = k-1
while(end<arr.length)
{
for(int i = start ; i<=end;)
int tempsum=0;
{
 tempsum+=arr[i];
}
if(tempsum/k>=threshold)
{
counter++
}
}
start++;
end++;
return counter;
 
 */

/*https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
Given an array of integers arr and two integers k and threshold, 
return the number of sub-arrays of size k and average greater than or equal to threshold.

 

Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
Example 2:

Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
 

Constraints:

1 <= arr.length <= 105
1 <= arr[i] <= 104
1 <= k <= arr.length
0 <= threshold <= 104
 */
