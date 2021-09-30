class  RangByte
{
	public static void main(String[] args) 
	{
		 // 1byte은 8bit로 구성이 됩니다.
		 //1bit로 표현할 수 있는 수의 범위는 0,1 두가지 임
		 //bit는 전기선 하나로 생각하셈, 그럼 표현 할 수 있는 신호는 2가지 
		 //2bit는? 
	//1byte(8개의 bit) 맨 왼쪽의 bit는 음수 양수 판별, 나머지는 7개로 숫자표현
	//표현할 수 있는 수의 범위는 제한됨
	//음수 2의 7승부터 양수 2의 7승 -1까지 표현됨
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
