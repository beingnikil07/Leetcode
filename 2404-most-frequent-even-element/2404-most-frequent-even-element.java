    class Solution {
        public int mostFrequentEven(int[] nums) {
            int freq[] = new int[100001];
            //count frequencies 
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    freq[nums[i]]++;
                }
            }

            //find max
            int max = 0;
            int ans = -1;
            for (int i = 0; i <= 100000; i++) {
                if (freq[i] > max) {
                    max = freq[i];
                    ans = i;
                }
            }
            return ans;
        }
    }