import java.util.Scanner;
public class Matrix {
	Scanner s = new Scanner(System.in);
	
	public void matrix() {
		while(true) {
			System.out.println("공식을 선택하세요.");
			System.out.println("1.역행렬  2.행렬의 곱  종료:이 외  숫자 입력");
			int menu = s.nextInt();
			if(menu == 1) {
				inverseMatrix();
			}
			else if(menu == 2) {
				mulMatrix();
			}
			else
				break;
		}
	}
	//행렬의 곱
	private void mulMatrix() {
		System.out.print("행렬 1의 행과 열의 개수를 입력하시오. \n행:");
		int col1 = s.nextInt();
		System.out.print("열:");
		int row1 = s.nextInt();
		System.out.print("행렬 2의 행과 열의 개수를 입력하시오. \n행:");
		int col2 = s.nextInt();
		System.out.print("열:");
		int row2 = s.nextInt();
		
		//두 행열의 행, 열이 일치하는 부분이 없을 경우
		if(row1 != col2 && col1 != row2) {
			System.out.println("서로 곱할 수 없는 행렬입니다.\n");
			return;
		}
		int matrix1[][] = new int[col1][row1];
		int matrix2[][] = new int[col2][row2];
		System.out.println("행렬 1을 입력하시오.");
		for(int i = 0; i<col1; i++) {
			for(int j = 0; j<row1; j++) {
				matrix1[i][j] = s.nextInt();
			}
		}
		System.out.println("행렬 2을 입력하시오.");
		for(int i = 0; i<col2; i++) {
			for(int j = 0; j<row2; j++) {
				matrix2[i][j] = s.nextInt();
			}
		}
		
		int matrix3[][];
		//행렬1의 열과 행렬2의 행이 같을 경우
		if(row1 == col2) {
			matrix3 = new int[col1][row2];
			for(int i = 0; i<col1; i++) {
				for(int j = 0; j<row2; j++) {
					int sum = 0;
					for(int k = 0; k<row1; k++) {
						sum += matrix1[i][k]*matrix2[k][j];
					}
					matrix3[i][j] = sum;
				}
			}
			
			//출력
			for(int i = 0; i<col1; i++) {
				for(int j = 0; j<row2; j++) {
					System.out.print(matrix3[i][j]+"  ");
				}
				System.out.println();
			}
			
			return;
		}
		//행렬2의 열과 행렬1의 행이 같을 경우
		else {
			matrix3 = new int[col2][row1];
			for(int i = 0; i<col2; i++) {
				for(int j = 0; j<row1; j++) {
					int sum = 0;
					for(int k = 0; k<row2; k++) {
						sum += matrix1[i][k]*matrix2[k][j];
					}
					matrix3[i][j] = sum;
				}
			}
			//출력
			for(int i = 0; i<col2; i++) {
				for(int j = 0; j<row1; j++) {
					System.out.print(matrix3[i][j]+"  ");
				}
				System.out.println();
			}
			
			return;
					
		}	
	}
	
	//2차 정사각행렬의 역행렬
	private void inverseMatrix() { 
		 System.out.println("역행렬을 구할 행렬을 입력하시오.");
		 int matrix[][] = new int[2][2];
		 for(int i = 0; i<2; i++) {
			 for(int j = 0; j<2; j++) {
				 matrix[i][j] = s.nextInt();
			 }
		 }
		 double d = matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
		 if(d == 0) {
			 System.out.println("역행렬이 존재하지 않습니다.");
			 return;
		 }
		 System.out.println(matrix[1][1]/d+"  "+(-matrix[0][1]/d)+"\n"
				 +(-matrix[1][0]/d)+"  "+(matrix[0][0]/d)+"\n");
		 return;
	}
}
