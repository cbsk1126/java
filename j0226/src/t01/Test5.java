package t01;

public class Test5 {
	public static void main(String[] args) {
		int su = 30;
		System.out.printf("숫//자 : %d\n", su);
		
		int su2 = 70;
		System.out.println("숫자2 : " + su2);
		
		int su3, su4;
		su3 = 10;
		su4 = 20;
		System.out.println("su3 : " + su3 + " , su4 : " + su4);
		
		int su5 = 5, su6 = 6;
		System.out.println("su5 : " + su5 + " , su6 : " + su6);
		
		int _su7 = 100, $su8 = 200, su$9 = 300, main = 400;   // public = 500;  예약어를 변수로 사용할수 없다.
		System.out.println("_su7 : " + _su7 + " , $su8 : " + $su8 + " , su$9 : " + su$9 + " , main : " + main);
		
		int su10, su11;	// 사용하지 않는 변수는 선언하지 않는것이 좋다.
		su10 = 50;
		//su11 = 60;
		//su10 = su10 + su11;	// 초기화 되지 않은 변수는 사용할 수 없다.
		System.out.println("su10 : " + su10);
	}
}
