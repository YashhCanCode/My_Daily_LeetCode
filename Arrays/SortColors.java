public class SortColors {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = 0;
        while (i <= right) {
            switch (nums[i]) {
                case 0 -> {
                    int temp = nums[i];
                    nums[i] = nums[left];
                    nums[left] = temp;
                    i++;
                    left++;
                }
                case 2 -> {
                    int temp = nums[i];
                    nums[i] = nums[right];
                    nums[right] = temp;
                    right--;
                }
                default -> i++;
            }
        }
    }
}