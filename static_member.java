
public class static_member {
	static double pi = 3.14159;		// static : 클래스에 고정된 멤버, 객체를 생성하지 않고 사용할 수 있는 필드와 메소드
											// 인스턴스 필드를 이용해서 실행 -> 인스턴스 메소드 선언
											// 인스턴스 필드 사용 안하고 실행 -> 정적 메소드(static) 선언
	static int plus(int x, int y) {		
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
