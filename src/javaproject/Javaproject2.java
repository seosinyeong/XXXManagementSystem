package javaproject;

public class Javaproject2 {

	public static void main(String[] args) {
	
			int [][] arr1 = { {1,0,2}, 
					          {-1,0,3} };
			
			int [][] arr2 = { {3,1}, 
					          {2,1},
			                  {1,0}};
			
			int arr1_row = arr1.length;
			int col = arr2.length;
			int arr2_row= arr2.length;
			
			int[][] arr3= new int[arr1_row][col];
			
			for(int i=0;i<arr1_row;i++){
				for(int j=0;j<col;j++) {
					for(int k=0;k<arr2_row;k++) {
						arr3[i][j] += arr1[i][j]*arr2[i][j];

					}
				}
			}
	
		}	
		
	}



