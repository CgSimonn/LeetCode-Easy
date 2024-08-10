public class main_35 {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        if (nums.length == 0 || target < nums[0]) {
            return res;
        } else if (target > nums[nums.length - 1]) {
            res = nums.length;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (target == nums[i]) {
                    return i;
                } else if (target > nums[i] && target < nums[i + 1]) {
                    return i + 1;
                }
            }
        }
        return res;
    }
}
