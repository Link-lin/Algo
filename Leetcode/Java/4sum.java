import java.util.*;

public class 4sum{

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length, sum = target;
		List<Integer> res = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (n < 4)
			return result;
		
		Arrays.sort(nums);
		for (int i = 0; i < n-3; i++) {
			for (int j = i + 1; j < n-2; j++) {
				int l = j + 1;
				int r = n-1;
				while (l < r) {
					if (nums[i] + nums[j] + nums[l] + nums[r] == target) {
						res = new ArrayList<Integer>();
						res.add(nums[i]);
						res.add(nums[j]);
						res.add(nums[l]);
						res.add(nums[r]);
						if (!result.contains(res))
							result.add(res);
						l++;r--;
					}
					else if (nums[i] + nums[j] + nums[l] + nums[r] < target) {
						l++;
					}
					else {  // (nums[i] + num[j] + num[l] + num[r] > target)
						r--;
					}
				}
			}
		}

		return result;
    
    }

    public void main(String[] args){

    }
}