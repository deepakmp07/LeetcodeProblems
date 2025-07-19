package javacode;

public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        // Merge from end to start (merging nums2 in nums1, then every elements are merged no need for nums1 to sort)
        while(j>=0) {
            //only if i>0 as no elements to sort
            if(i>=0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
    }
}

/*
Notes
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

Why merging from the back?

✅ Because if we merged from the front,
   we’d overwrite the original nums1 values.

How does it work?

- Compare the biggest elements from nums1 and nums2.
- Place the bigger one at the back of nums1.
- Move backwards using pointers.

 */