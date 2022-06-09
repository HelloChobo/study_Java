
public class conditionals_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = false;
		if (a == true) {
			System.out.println("1. result : " + a);
		} else if (a != true) {
			System.out.println("2. result : " + a);
		} else {
			System.out.println("3. result : " + a);
		}
		
		/* // ★ 프로젝트 밖에서 args 를 입력으로 받아 if 검증
		String id = args[0]; 
		String password = args[1];
		if (id.equals("egoing")) {
			if (password.equals("1111")) {
				System.out.println("Right! Logging in");
			} else {
				System.out.println("Nope!");
			}
		} else {
			System.out.println("There is no id like that");
		}
		*/
		
		
		/*// 논리 연산자 : &&, ||
		 if(id.equals("egoing") && password.equals("1111")) {
		 	System.out.println("pass!");
		 	}
		 */
		
		switch(1) { // ★ 해당 입력부터 순차적으로 모든 switch문이 실행됨
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		}
		
		switch(2) { // 해당 입력에 대한 switch문만 들어갔다가 빠져나옴
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		}
		
		int i = 0;
		while (i < 10) {
			System.out.println("while statement going");
			i++;
		}
		
		// for (초기화; 종료조건; 반복실행) {}
		for (int j = 0; j < 10; j++) {
			System.out.println("for statement going");
		}
		
	}

}
