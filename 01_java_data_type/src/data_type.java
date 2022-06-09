
public class data_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 GB - TB - PB - EB - ZB
		 giga - tera - peta - exa - zetta
		 */
		
		/*
		 메모리의 용량을 아끼기 위해! -> but 오늘날 메모리 용량이 늘어났음
		 -> 결과적으로 정수 지정시 int 써라
		 
		 1. 정수형
		 byte | 1 byte | -128 ~ 127 | 2^8
		 short | 2 byte | -32,768 ~ 32,767 | 2^16
		 ▶ int | 4 byte | | 2^32
		 long | 8 byte | | 2^64
		 
		 2. 실수형
		 float | 4 byte |
		 ▶ double | 8 byte | 
		 
		 3. 문자
		 char | 2 byte | 모든 유니코드 문자
		 */
		
		
		
		// ### 상수형(constant) 데이터 타입
		 
		// int a = 213455511545; // 에러남
		long b = 28947178294791L; // ★ 자바에서는 정수형 default가 int 이므로

		// float a = 2.2; // 에러남
		float c = 2.2f; // ★ 자바에서는 실수형 default가 double 이므로
		double d = 2.2;
		
		/*
		 정수형 상수 : 
		 8진 : 0~7로 이루어짐. 023처럼 맨 앞에 0 붙임
		 10진
		 16진 : 0~9와 a~f로 이루어짐. 숫자 앞에 0x 붙임
		 
		 */
		
		int i = 023;
		System.out.println(i); // print하면 기본적으로 10진으로
		
		// ### 형 변환
		double e = 3.3F; // F가 붙었지만 double 로 자동 형 변환됨
		// float f = 3.0; // 상수 : 기본 double 인데 float 는 범위가 더 작은 형식이므로 에러
		
		// int -> float 형 변환 (O). 반대는 불가
		 
		
		// ### 명시적 형 변환
		int g = (int) 100.0F; // 수동으로
		
		
	}

}
