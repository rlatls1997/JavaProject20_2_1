import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//각 공식 클래스 객체 생성
		Matrix m = new Matrix();
		Sequence se = new Sequence();
		StraightLine sl = new StraightLine();
		
		while(true) {
			System.out.println("수행할 공식의 범주를 선택하세요.");
			System.out.println("1:행렬  2:수열  3:선  종료:이 외 숫자입력");
			
			int menu = s.nextInt();
			
			if(menu == 1) {
				m.matrix();
			}
			else if(menu == 2) {
				se.sequence();
			}
			else if(menu == 3) {
				sl.straightLine();
			}
			
			else
				break;
			
			
			
		}

	}

}