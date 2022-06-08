
public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ### operator : 대입, 산술, 비교, 논리 연산자
		
		// ### 산술 연산자 : +, -, *, /, %
		
		// ### 단항 연산자 : +, -, ++, --
		// 좌항, 우항이 필요하지 않은 연산자. 한 쪽 항에서만 씀
		int a = 3;
		System.out.println(a++); // ★ 함수 처리 후, ++ 1 더해짐
		System.out.println(++a); // 함수 처리 전, 1 더해짐
		
		// ### 비교 연산자 : ==, !=, >, >=, .equals
		String b = "Hi";
		String C = "Hello";
		String D = "hi";
		String e = "Hi";
		System.out.println(b.equals(C));
		System.out.println(b.equals(D)); // 대소문자 불일치
		System.out.println(b.equals(e));
		
	}

}
