import java.util.Arrays;

/**
 * NO EXTERNAL LIBRARIES OR PACKAGES SHOULD BE IMPORTED
 * Sorts an array into WiggleSort format
 *
 * @author 
 */
public class WiggleSort {
    /**
     * Given an integer array nums, reorders it such that nums[0] < nums[1]  >  nums[2] <  nums[3]...
     * @param nums array to sort
     * @return sorted array
    */

    public static int[] wiggleSort(int[] nums) {

        //created new array to fill with result
        int [] newArr = new int [nums.length];

        //temp variable for swap algorithm
        int temp;

        //sorts array in ascending order
        //by sorting the array in ascending order,
        // we can then sort the array into result we want by taking the middle and end,
        //then the following adjacent ones in the rest of the array
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] > nums[j])
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        //I was determined to find a way to make this work with loops and I could not figure it out
        //Basically I wanted to take the middle and then the pair the following adjacent ones
        newArr[0] = nums[nums.length/2-1];
        newArr[1] = nums[nums.length-1];

        newArr[2] = nums[nums.length/2-2];
        newArr[3] = nums[nums.length-2];

        newArr[4] = nums[nums.length/2-3];
        newArr[5] = nums[nums.length-3];


        return newArr;
    }
}