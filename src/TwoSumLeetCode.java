import java.util.HashMap;

public class TwoSumLeetCode {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> processedNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            processedNums.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int residue = target - nums[i];
            if(processedNums.get(residue)!=null && processedNums.get(residue)!= i){
                result[0] = i;
                result[1] = processedNums.get(residue);
                break;
            }
        }
        return result;
    }

}
