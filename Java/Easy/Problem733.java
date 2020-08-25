class Problem733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // edge case if the newColor is same as the sr, sc color - no need to change
        if(image[sr][sc] == newColor)
            return image;

        // perform dfs and recursively call the function
        fillImageColor(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void fillImageColor(int [][] image, int i, int j, int color, int newColor){
        // edge case
        if(i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != color)
            return;

        // fill Color
        image[i][j] = newColor;

        // recursively call in all 4 directions

        // moves bottom
        fillImageColor(image, i + 1, j, color, newColor);

        // moves top
        fillImageColor(image, i - 1, j, color, newColor);

        // moves left
        fillImageColor(image, i, j - 1, color, newColor);

        // moves right
        fillImageColor(image, i, j + 1, color, newColor);
    }
}
