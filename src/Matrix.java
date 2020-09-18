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
	
	private void inverseMatrix() { //2차 정사각행렬의 역행렬
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
	private void mulMatrix() { //2차 정사각행렬끼리의 곱셈
		 System.out.println("행렬1을 입력하시오.");
		 int matrix1[][] = new int[2][2];
		 for(int i = 0; i<2; i++) {
			 for(int j = 0; j<2; j++) {
				 matrix1[i][j] = s.nextInt();
			 }
		 }
		 System.out.println("행렬2를 입력하시오.");
		 int matrix2[][] = new int[2][2];
		 for(int i = 0; i<2; i++) {
			 for(int j = 0; j<2; j++) {
				 matrix2[i][j] = s.nextInt();
			 }
		 }
		 
		 System.out.println((matrix1[0][0]*matrix2[0][0]+matrix1[0][1]*matrix2[1][0])+"  "
				 +(matrix1[0][0]*matrix2[0][1]+matrix1[0][1]*matrix2[1][1])+"\n"
				 +(matrix1[1][0]*matrix2[0][0]+matrix1[1][1]*matrix2[1][0])+"  "
				 +(matrix1[1][0]*matrix2[0][1]+matrix1[1][1]*matrix2[1][1])+"\n");
		 return;
	}
	
	
}
