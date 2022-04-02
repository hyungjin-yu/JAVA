
public class use_static {
	public static void main(String[] args) {
		double result1 = 10 * 10 * static_member.pi;
		int result2 = static_member.plus(10, 5);
		int result3 = static_member.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
