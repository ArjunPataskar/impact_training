public class MaxInRows {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] maxElements = findMaxInRows(matrix);

        System.out.println("Maximum elements in each row:");
        for (int i = 0; i < maxElements.length; i++) {
            System.out.println("Row " + (i + 1) + ": " + maxElements[i]);
        }
    }

    public static int[] findMaxInRows(int[][] matrix) {
        int numRows = matrix.length;
        int[] maxElements = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxElements[i] = max;
        }
        return maxElements;
    }
}