
public class is_return {
		int plus (int x, int y) { 	
			int result = x + y;
			return result;
	}
		
		void run() {		// void�� return ���� ������ return�� ����� �� �ִ�. 
			int gas = 10;
			while(true) {
				if( gas > 0) {
					System.out.println("�޸��ϴ�.(gas �ܷ� :" + gas + ")");
					gas -= 1;
				} else {
					System.out.println("����ϴ�. (gas �ܷ� : " + gas + ")");
					return;	// void()���� return : �޼ҵ� ���� ���� ����
				}
			}
		}
}
