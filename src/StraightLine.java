import java.util.Scanner;

public class StraightLine {
	Scanner s = new Scanner(System.in);
	
	public void straightLine() {
		while(true) {
			System.out.println("\n공식을 선택하세요.");
			System.out.println("1.두 점 사이 거리  2.두 점 지나는 직선  3.점과 직선 사이 거리  4.근의 공식  종료:이 외 숫자 입력");
			int menu = s.nextInt();
			if(menu == 1) {
				disOfdots();
			}
			else if(menu == 2) {
				strLine();
			}
			else if(menu == 3) {
				disOfDotLine();
			}
			else if(menu == 4) {
				quadratic();
			}
			else
				break;
		}
	}
	//좌표평면상 두 점사이의 거리
	private void disOfdots() {
		System.out.println("두 점의 좌표를 순서대로 입력하시오.");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
	
		System.out.println("거리:"+Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)));
	
		return;
	}
	
	//좌표평면의 두 점을 지나는 직선
	private void strLine() {
		System.out.println("두 점의 좌표를 순서대로 입력하시오.");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		double x2 = s.nextDouble();
		double y2 = s.nextDouble();
		
		System.out.println("방정식: y="+(y2-y1)/(x2-x1)+"x+"+(y1-(y2-y1)/(x2-x1)*x1));
		
		return;
	}
	
	//점과 직선 사이의 거리
	private void disOfDotLine() {
		System.out.println("점의 좌표를 순서대로 입력하시오.");
		double x1 = s.nextDouble();
		double y1 = s.nextDouble();
		System.out.println("직선의 계수a,b,c를 순서대로 입력하시오.(ax+by+c=0)");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		
		double d = Math.abs(a*x1 + b*y1 + c)/Math.sqrt(a*a+b*b);
		System.out.println("거리: "+d);
		
		return;
	}
	//근의 공식
	private void quadratic() {
		System.out.println("방정식의 계수 a,b,c를 순서대로 입력하시오.(ax^2+bx+c=0)");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt(); 
		
		double x1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
		double x2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
		
		if(x1 == x2) {
			System.out.println("중근:"+x1);
			return;
		}
		System.out.println("근:"+x1+", "+x2);
		return;
	}
}
