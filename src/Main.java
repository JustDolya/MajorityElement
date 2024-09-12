import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution n = new Solution();
        int[] arr = {1, 3, 2, 3, 3, 4, 5, 3, 3, 6};
        n.majorityElement(arr, 0.51);
        }
}
class Solution {
    public void majorityElement(int[] nums, double majorityValue) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int majority = 0;

        for (int n : nums) {
            hash.put(n, 1 + hash.getOrDefault(n, 0));
            if (hash.get(n) > majority) {
                res = n;
                majority = hash.get(n);
            }
        }

        if ((double) hash.get(res) / nums.length >= majorityValue){
            System.out.println(res);
        }else{
            System.out.println("No majority element has been found");
        }
    }
}