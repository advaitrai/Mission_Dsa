class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            // 1. Top row → 
            for (int i = startcol; i <= endcol; i++) {
                ans.add(matrix[startrow][i]);
            }
            startrow++;

            // 2. Right column ↓
            for (int j = startrow; j <= endrow; j++) {
                ans.add(matrix[j][endcol]);
            }
            endcol--;

            // 3. Bottom row ←
            if (startrow <= endrow) {
                for (int i = endcol; i >= startcol; i--) {
                    ans.add(matrix[endrow][i]);
                }
                endrow--;
            }

            // 4. Left column ↑
            if (startcol <= endcol) {
                for (int j = endrow; j >= startrow; j--) {
                    ans.add(matrix[j][startcol]);
                }
                startcol++;
            }
        }

        return ans;
    }
}