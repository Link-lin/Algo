public class searchMatrix{

    public boolean searchMatrix1(int[][] matrix, int target){
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int width = matrix[0].length;
        for(int i =0; i < matrix.length; i++){
            if(matrix[i][width -1] < target){
                continue;
            }
            else{
                // To imporve us 
                for(int j =0; j < width; j++){
                    if(matrix[i][j] == target) return true;
                }
            }
        }
        return false;

        /*
    int row_num = matrix.length;
	int col_num = matrix[0].length;
	
	int begin = 0, end = row_num * col_num - 1;
	
	while(begin <= end){
		int mid = (begin + end) / 2;
		int mid_value = matrix[mid/col_num][mid%col_num];
		
		if( mid_value == target){
			return true;
		
		}else if(mid_value < target){
			//Should move a bit further, otherwise dead loop.
			begin = mid+1;
		}else{
			end = mid-1;
		}
	}
	
    return false;
    */
    }

    public static void main(String[] args) {
        
    }
}