
public class variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; // 변수의 선언
		a = 1; // 변수에 값 할당
		System.out.println(a+2);
		a = 3;
		System.out.println(a+2);
		
		double b = 3.0;
		System.out.println(b+1);
		
//		string strr; // ★ 대문자 String 으로 선언
		String str, stringgg; // ★ 선언했으면 무조건 값을 넣어 초기화해 줘야한다
		str = "문자열";
		stringgg = "문"; // '문'(x) 문자열 선언을 했으므로 문자는 쓸 수 없다
		System.out.println(str);
		
	}

}
