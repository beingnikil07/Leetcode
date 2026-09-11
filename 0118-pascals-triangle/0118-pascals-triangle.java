class Solution {

    public static int funNCR(int n, int r) {
        int res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }

    public List<List<Integer>> generate(int n) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 0; row < n; row++) {

            List<Integer> temp = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                int e = funNCR(row, col);
                temp.add(e);
            }

            ans.add(temp);
        }

        return ans;
    }
}