class  RangByte
{
	public static void main(String[] args) 
	{
		 // 1byte�� 8bit�� ������ �˴ϴ�.
		 //1bit�� ǥ���� �� �ִ� ���� ������ 0,1 �ΰ��� ��
		 //bit�� ���⼱ �ϳ��� �����ϼ�, �׷� ǥ�� �� �� �ִ� ��ȣ�� 2���� 
		 //2bit��? 
	//1byte(8���� bit) �� ������ bit�� ���� ��� �Ǻ�, �������� 7���� ����ǥ��
	//ǥ���� �� �ִ� ���� ������ ���ѵ�
	//���� 2�� 7�º��� ��� 2�� 7�� -1���� ǥ����
	//-128~127

	byte data;
	data = -128;
    System.out.println(data);
	data =(byte) (data-1); //underFlow
	System.out.println(data);
	

    /*C:\javastudy\0928>java RangByte
-128
127
*/


	
	/*data =127;
    System.out.println(data);
    data = (byte)(data+1);
	data 
	System.out.println(data);  */ 
	
/*
C:\javastudy\0928>java RangByte
127
-128
*/ //overFlow

	}
}