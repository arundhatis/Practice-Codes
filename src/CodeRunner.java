public class CodeRunner {
    public static void main(String[] args) {
        runTwoSumLeetCode();
    }

    private static void runTwoSumLeetCode() {
        int[] input = {3,2,4};
        int target = 6;
        TwoSumLeetCode twoSumLeetCode = new TwoSumLeetCode();
        int[] twoSumResult = twoSumLeetCode.twoSum(input, target);
        System.out.println(twoSumResult[0] + "  ,  " + twoSumResult[1]);
    }
}
