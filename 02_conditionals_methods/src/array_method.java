
public class array_method {

	public static void main(String[] args) {
		// �� void : ���ϰ����� �ƹ��͵� ������� ����
		
		// �迭 ����
		String[] classgroup = {"������", "�󸶹ٻ�", "������ī"};
		System.out.println(classgroup[1]);
		System.out.println(classgroup.length);
		
		// �� �� �迭 ���� �� 1���� �Է�. �̸� �迭�� ũ�� ����
		String[] classgroupA = new String[2];
//		classgroupA[0] = "�ƾ�";
//		System.out.println(classgroupA.length);
		classgroupA[1] = "�����";
		System.out.println(classgroupA.length);
//		classgroupA[2] = "��������"; // Exception �߻� (out of bounds for length)
//		System.out.println(classgroupA.length);
		System.out.println(classgroupA);
		
		// �迭 - �ݺ��� ��Ʈ�� ����
		String[] members = {"���1", "���2", "���3"};
		for (int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "�� ����� �޾ҽ��ϴ�");
		}
	} // ���� main �޼ҵ带 ������ ���� method ¥��
		
		// �� method = ���̽㿡���� function (�Լ�)
		public static void numbering() { // �ۼ��ϴ� ���� �����ʿ� ��ϵ�
			int i = 0;
			int output = 0;
			while (i < 10) {
				System.out.println(i);
				output += i;
			}
//			return output;
		}
		
		// ���� main ���� �ҷ�����
//		public static void main(String[] args) {
//			numbering();
//			numbering();
//		}

}
