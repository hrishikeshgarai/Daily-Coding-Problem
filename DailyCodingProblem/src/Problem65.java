import java.util.*;

public class Problem65 {
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		if (matrix.length == 0) {
			return list;
		}
		
		int rowStart = 0, rowEnd = matrix.length-1;
		int colStart = 0, colEnd = matrix[0].length-1;
		
		while (rowStart <= rowEnd && colStart <= colEnd) {
			for (int col = colStart; col <= colEnd; col++) {
				list.add(matrix[rowStart][col]);
			}
			for (int row = rowStart+1; row <= rowEnd; row++) {
				list.add(matrix[row][colEnd]);
			}
			if (rowStart < rowEnd && colStart < colEnd) {
				for (int col = colEnd-1; col > colStart; col--) {
					list.add(matrix[rowEnd][col]);
				}
				for (int row = rowEnd; row > rowStart; row--) {
					list.add(matrix[row][colStart]);
				}
			}
			rowStart++;
			rowEnd--;
			colStart++;
			colEnd--;
		}
		return list;
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		System.out.println(spiralOrder(matrix));
	}
	
}