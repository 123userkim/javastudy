class SwapTestInt 
{
	public static void main(String[] args) 
	{
		int a =7;
		int b= 9;

		
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		//맞바꾸기 코딩하기

		/*int temp;
		temp=a;
		a=b;
		b=temp;*/	
		a= a^b;
		b= b^a;
		a= a^b;

		System.out.println("a와 b의 값을 서로 바꾸었습니다." );

		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}
