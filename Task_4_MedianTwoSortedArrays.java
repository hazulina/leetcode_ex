package org.example;


import java.util.Arrays;

public class Task_4_MedianTwoSortedArrays {
  
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sumArray = new int[nums1.length + nums2.length];
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = addValue(nums1, nums2, i);
        }
        Arrays.sort(sumArray);
        return findMedian(sumArray);
    }

    private int addValue(int[] nums1, int[] nums2, int i) {
        if (nums1.length == 0) {
            return nums2[i];
        }
        if (i > nums1.length - 1) {
            return nums2[i - nums1.length];
        } else {
            return nums1[i];
        }
    }

    private double findMedian(int[] target) {
        int middle = target.length / 2;
        double median;
        if (target.length % 2 != 0 || middle == 0) {
            median = target[middle];
        } else {
            median = (double) (target[middle] + target[middle - 1]) / 2;
        }
        return median;
    }
}
