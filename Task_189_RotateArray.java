import java.util.Arrays;

public class Task_189_RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        System.out.println(k);
        int rotate = nums.length - k;
        int[] tempArray = new int[nums.length];
        for (int i = 0; i < tempArray.length; i++) {
            if (rotate >= nums.length) rotate = 0;
            tempArray[i] = nums[rotate++];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempArray[i];
        }
    }    
}
