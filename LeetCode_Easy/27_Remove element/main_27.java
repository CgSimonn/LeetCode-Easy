import java.util.ArrayList;
import java.util.List;

class main_27 {
    public static int[] removeElement(int[] nums, int val) {
        int k = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }

        return nums;
    }

    // public static int[] removeAtIndex(int[] arr, int index) {
    // int[] newArr = new int[arr.length - 1];
    // int j = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (i != index) {
    // newArr[j++] = (arr[i]);
    // }
    // }
    // return newArr;
    // }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        System.out.println(removeElement(arr, val));

        List<Integer> newNums = new ArrayList<Integer>();
        newNums.add(1);
        System.out.println(newNums.get(0));
    }
}