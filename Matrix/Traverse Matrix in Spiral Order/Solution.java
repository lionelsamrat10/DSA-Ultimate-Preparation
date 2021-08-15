// Link to the Problem : https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> solution = new ArrayList<>();
        int top = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int dir = 0; // MARKS THE DIRECTION IN WHICH WE HAVE TO TRAVERSE
        while(top <= down && left <= right) {
            // LEFT TO RIGHT
            if(dir == 0){
                for(int i=left; i<=right; i++) {
                    solution.add(matrix[top][i]);
                }
                top++;
            } else if(dir == 1) { // TOP TO BOTTOM
                for(int i=top; i<=down; i++) {
                    solution.add(matrix[i][right]);
                }
                right--;
            } else if(dir == 2) { // RIGHT TO LEFT
                for(int i=right; i>=left; i--) {
                    solution.add(matrix[down][i]);
                }
                down--;
            } else if(dir == 3) { // DOWN TO TOP
                for(int i=down; i>=top; i--) {
                    solution.add(matrix[i][left]);
                }
                left++;
            }
            // TO ENSURE THAT THE VALUE OF dir DOES NOT EXCEED 3
            dir = (dir + 1) % 4;
        }
        return solution;
    }
}
// Better than 100% of the Java Solutions Online
