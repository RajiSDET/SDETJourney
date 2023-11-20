package dsa.week11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW04_2215_ArrayDiffrences {

	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> li = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        
        // Add all values from first Array nums1 inside this Set 1 
        
        for (int num : nums1) {
            set1.add(num);
        }
        
       // Add all values from Second Array nums2 inside this Set 2
        for (int num : nums2) {
            set2.add(num);
        }
        
       // Add only unique values in nums2 which is not present inside Set 1 inside this Set 3
        for (int num : nums2) {
            if (!set1.contains(num)) {
                set3.add(num);
            }
        }
        // Make Set 1 unique by removing all elements from Set 2 
        set1.removeAll(set2);
        li.add(new ArrayList<>(set1));
        li.add(new ArrayList<>(set3));
        

        return li;
    }
}

/*https://leetcode.com/problems/find-the-difference-of-two-arrays/description/
 2215. Find the Difference of Two Arrays

Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
-1000 <= nums1[i], nums2[i] <= 1000
 */
