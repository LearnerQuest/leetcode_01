class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        boolean arr[]=new boolean[row];
        boolean []arr1=new boolean[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    arr[i]=true;
                    arr1[j]=true;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i]||arr1[j]){
                    matrix[i][j]=0;
                }
            }
        }
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<row;i++){
            List<Integer>tar=new ArrayList<>();
            for(int j=0;j<col;j++){
                tar.add(matrix[i][j]);
            }
            res.add(tar);
        }
    }

}