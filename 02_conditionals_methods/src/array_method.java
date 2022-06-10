
public class array_method {

	public static void main(String[] args) {
		// ★ void : 리턴값으로 아무것도 출력하지 않음
		
		// 배열 선언
		String[] classgroup = {"가나다", "라마바사", "아자차카"};
		System.out.println(classgroup[1]);
		System.out.println(classgroup.length);
		
		// ★ 빈 배열 선언 후 1개씩 입력. 미리 배열의 크기 지정
		String[] classgroupA = new String[2];
//		classgroupA[0] = "아야";
//		System.out.println(classgroupA.length);
		classgroupA[1] = "어여오요";
		System.out.println(classgroupA.length);
//		classgroupA[2] = "우유으이"; // Exception 발생 (out of bounds for length)
//		System.out.println(classgroupA.length);
		System.out.println(classgroupA);
		
		// 배열 - 반복문 세트로 간다
		String[] members = {"멤버1", "멤버2", "멤버3"};
		for (int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다");
		}
	} // 앞의 main 메소드를 끝내고 새로 method 짜기
		
		// ★ method = 파이썬에서의 function (함수)
		public static void numbering() { // 작성하는 순간 오른쪽에 등록됨
			int i = 0;
			int output = 0;
			while (i < 10) {
				System.out.println(i);
				output += i;
			}
//			return output;
		}
		
		// 이후 main 에서 불러오기
//		public static void main(String[] args) {
//			numbering();
//			numbering();
//		}

}
