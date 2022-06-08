
public class number_and_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1+2);
		System.out.println(1.2+1.3);
		System.out.println(1.6*1.6);
		System.out.println(10/3); // 나누기는 /
		System.out.println(10/3.0); // 자료형이 하나라도 float 면 결과도 float
		
		System.out.println("이클립스"); // ★ 작은 따옴표로 '이클립스' 를 쓰면 오류 (문자만 작은따옴표)
		System.out.println("이"); // 한글자라도 "" 로 감싸주었다면 문자열
		System.out.println('클');
		
		System.out.println("이클립스" + "입니다");
		System.out.println('이' + '클');
		System.out.println('이');
		System.out.println('클');
		System.out.println('1');
		System.out.println('1' + '2'); // ★ 문자의 합은 각 단어의 합이 아님
		System.out.println("1" + "2"); // 문자열의 합의 경우 + 를 쓰면 됨
		
		System.out.println("이스케이프 문자를 사용 \"를 표현할 수 있다"); // 이스케이프문자 \" 로 표현
		System.out.println("문장구분은\n \\n 으로 구분한다");
	}

}
