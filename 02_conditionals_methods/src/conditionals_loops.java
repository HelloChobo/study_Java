
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
		
		/* // �� ������Ʈ �ۿ��� args �� �Է����� �޾� if ����
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
		
		
		/*// �� ������ : &&, ||
		 if(id.equals("egoing") && password.equals("1111")) {
		 	System.out.println("pass!");
		 	}
		 */
		
		switch(1) { // �� �ش� �Էº��� ���������� ��� switch���� �����
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		}
		
		switch(2) { // �ش� �Է¿� ���� switch���� ���ٰ� ��������
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
		
		// for (�ʱ�ȭ; ��������; �ݺ�����) {}
		for (int j = 0; j < 10; j++) {
			System.out.println("for statement going");
		}
		
	}

}
