package dsa.week6;

public class OCT_26_HW_02_flipAndInvertImage {

}

/*PSEUDO CODE-
 Input: int[][] image
 image = [[1,1,0],[1,0,1],[0,0,0]]
 Output: int[][] image
 [[1,0,0],[0,1,0],[1,1,1]]
 
 iterate through each image[x,y,z]
 have temp list and read this as z y x and write it again back to the image with flipped values 
 
 Only new thing is how to iterate though this 3*3 array 
 [(0,0),(0,1),(0,2)], [(1,0),(1,1),(1,2)],[(2,0),(2,1),(2,2)]
 */

/*https://leetcode.com/problems/flipping-an-image/
 832. Flipping an Image
Easy
3.3K
233
Companies
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
 

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 

Constraints:

n == image.length
n == image[i].length
1 <= n <= 20
images[i][j] is either 0 or 1.
 */
