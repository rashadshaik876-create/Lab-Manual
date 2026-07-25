class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int currentDx = coordinates[i][0] - coordinates[0][0];
            int currentDy = coordinates[i][1] - coordinates[0][1];

            if (dy * currentDx != dx * currentDy) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case
        int[][] testCoordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        
        boolean result = solution.checkStraightLine(testCoordinates);
        System.out.println("Is straight line: " + result);
    }
}
