import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class learn {

    public static void main(String[] args) {
        int a[] ={1,2,2};
        System.out.println(subsetsWithDup(a));
    }

    static List<List<Integer>> result;

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), 0);

        return result;
    }

    public static void backtrack(int[] nums, List<Integer> list, int idx) {

        result.add(new ArrayList<>(list));

        for (int i = idx; i < nums.length; i++) {

           

            list.add(nums[i]);
            backtrack(nums, list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
