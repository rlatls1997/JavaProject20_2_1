import java.util.InputMismatchException;
import java.util.Scanner;
public class Sequence {
	Scanner s = new Scanner(System.in);
	
	public void sequence() {
		while(true) {
			System.out.println("\n공식을 선택하세요.");
			System.out.println("1.등차수열의 합  2.등비수열의 합  종료:이 외 입력");
			try {
			int menu = s.nextInt();
			if(menu == 1) {
				arithProgression();
			}
			else if(menu == 2) {
				geoProgression();
			}
			else
				break;
			}
			catch(InputMismatchException e){
				break;
			}
		}
	}
	
	//등차수열의 합
	private void arithProgression() { 
		System.out.println("첫째항, 공차, 항의 개수를 순서대로 입력하시오.");
		int a = s.nextInt();
		int d = s.nextInt();
		int n = s.nextInt();
		System.out.println((n*(2*a + (n-1)*d))/2.0);
		
		return;
	}
	
	//등비수열의 합
	private void geoProgression() {	
		System.out.println("첫째항, 공비, 항의 개수를 순서대로 입력하시오.");
		int a = s.nextInt();
		double r = s.nextDouble();
		int n = s.nextInt();
		if(r == 1) {
			System.out.println("잘못된 등비입니다.");
		}
		System.out.println((a*(Math.pow(r, n)-1)/(r-1)));
		
		return;
	}
}
