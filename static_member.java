
public class static_member {
	static double pi = 3.14159;		// static : Ŭ������ ������ ���, ��ü�� �������� �ʰ� ����� �� �ִ� �ʵ�� �޼ҵ�
											// �ν��Ͻ� �ʵ带 �̿��ؼ� ���� -> �ν��Ͻ� �޼ҵ� ����
											// �ν��Ͻ� �ʵ� ��� ���ϰ� ���� -> ���� �޼ҵ�(static) ����
	static int plus(int x, int y) {		
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}
