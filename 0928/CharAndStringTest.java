class CharAndStringTest 
{
	public static void main(String[] args) 
	{

 //�ڹٿ����� ���Ϲ��� ó���� Ȫ������, ���ڿ� ó���� �ֵ���ǥ
 //���� �ϳ��� ����������, �ֵ������� ���� ���� �ʹٸ�?
 //char�� ������ �Ұ��ϰ�, String���� �����ؾ��� 

		char firstName;
		firstName = '��';
		System.out.println(firstName);

		String name;
		name = "�ڼ���";
		System.out.println(name);

		//char LastName;
		String LastName;
		LastName = "��";
		System.out.println(LastName);
		
		String data;
		data = "Hello";
		char last = data.charAt(4);
		//charAt�� String�� ��ġ(index)�� �ִ� ���� �ϳ��� �˷��ִ� ����Դϴ�. 
		//��ġ index�� 0���� �����.
				System.out.println("�� �������� �ִ� ���ڴ� " +last +"�Դϴ�.");
		

	
	}
}



/*CharAndStringTest.java:20: error: cannot find symbol
                System.out.println(lastname);
                                   ^
  symbol:   variable lastname
  location: class CharAndStringTest*/


 