import java.util.ArrayList;
import java.util.List;

public class main_26 {
    public static int removeDuplicates(int[] nums) {
        List<Integer> newNums = new ArrayList<Integer>();
        int k = 0;
        for (int i : nums) {
            if (checkValue(newNums, i) == false) {
                newNums.add(i);
                k += 1;
            }
        }

        return k;
    }

    public static boolean checkValue(List<Integer> arr, int num) {
        for (int i : arr) {
            if (i == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        System.out.println(removeDuplicates(arr));
    }
}
