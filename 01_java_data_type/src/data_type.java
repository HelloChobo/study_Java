
public class data_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 GB - TB - PB - EB - ZB
		 giga - tera - peta - exa - zetta
		 */
		
		/*
		 �޸��� �뷮�� �Ƴ��� ����! -> but ���ó� �޸� �뷮�� �þ��
		 -> ��������� ���� ������ int ���
		 
		 1. ������
		 byte | 1 byte | -128 ~ 127 | 2^8
		 short | 2 byte | -32,768 ~ 32,767 | 2^16
		 �� int | 4 byte | | 2^32
		 long | 8 byte | | 2^64
		 
		 2. �Ǽ���
		 float | 4 byte |
		 �� double | 8 byte | 
		 
		 3. ����
		 char | 2 byte | ��� �����ڵ� ����
		 */
		
		
		
		// ### �����(constant) ������ Ÿ��
		 
		// int a = 213455511545; // ������
		long b = 28947178294791L; // �� �ڹٿ����� ������ default�� int �̹Ƿ�

		// float a = 2.2; // ������
		float c = 2.2f; // �� �ڹٿ����� �Ǽ��� default�� double �̹Ƿ�
		double d = 2.2;
		
		/*
		 ������ ��� : 
		 8�� : 0~7�� �̷����. 023ó�� �� �տ� 0 ����
		 10��
		 16�� : 0~9�� a~f�� �̷����. ���� �տ� 0x ����
		 
		 */
		
		int i = 023;
		System.out.println(i); // print�ϸ� �⺻������ 10������
		
		// ### �� ��ȯ
		double e = 3.3F; // F�� �پ����� double �� �ڵ� �� ��ȯ��
		// float f = 3.0; // ��� : �⺻ double �ε� float �� ������ �� ���� �����̹Ƿ� ����
		
		// int -> float �� ��ȯ (O). �ݴ�� �Ұ�
		 
		
		// ### ����� �� ��ȯ
		int g = (int) 100.0F; // ��������
		
		
	}

}
