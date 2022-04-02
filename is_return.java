
public class is_return {
		int plus (int x, int y) { 	
			int result = x + y;
			return result;
	}
		
		void run() {		// void는 return 값이 없지만 return을 사용할 수 있다. 
			int gas = 10;
			while(true) {
				if( gas > 0) {
					System.out.println("달립니다.(gas 잔량 :" + gas + ")");
					gas -= 1;
				} else {
					System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
					return;	// void()에서 return : 메소드 실행 강제 종료
				}
			}
		}
}
