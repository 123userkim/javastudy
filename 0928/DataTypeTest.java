class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		//int age;
		long age;
		age= 27;
	System.out.println("��þ��� ���� :"+age+"���Դϴ�.");
	
	
	//double height;
	float height;
	//height=173.8f;
	height = (float)173.8;
	System.out.println("��þ��� Ű : "+height);


	char gender;
		gender = 'M' ;
		System.out.println("��þ��� ������ : "+gender+"�Դϴ�.");
    
	// �ֵ���ǥ�� ������ String���� ��� cha�� ������ ���� ����

	boolean isVaccine;
	isVaccine = true;
	System.out.println("��þ��� 1�� ��� �������� : "+ isVaccine);
}
}
	/*
	C:\javastudy\0928>javac DataTypeTest.java
DataTypeTest.java:15: error: incompatible types: possible lossy conversion from double to float
        height=173.8;
		
		===>float�� 4����Ʈ�� �뷮�� ����(doubled�� 8����Ʈ). �׷����� �ұ��ϰ� ������ �ϰ� �ʹٸ�?
		1)�Ǽ� �� �ڿ� f�� ���̴� ��� ex) height=173.8f;
		2)�տ� float������ �ٲ� �ž� ��� �����ϱ� ex) height = (float)173.8
	
		*/

		

	