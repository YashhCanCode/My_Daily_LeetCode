class set_matrix_zeroes {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] zerow = new int[n];
        int[] zecol = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    zerow[i] = 1;
                    zecol[j] = 1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(zerow[i] == 1 || zecol[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    
    }
}