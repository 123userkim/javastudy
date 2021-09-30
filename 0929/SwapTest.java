class  SwapTest
{
	public static void main(String[] args) 
	{
		String  cup1="커피";
		String  cup2="녹차";
		System.out.println("컵1:" + cup1);
		System.out.println("컵2:" + cup2);

		//코딩하기:서로 컵1,2의 내용물을 맞바꾼다고 한다면?
		String  temp="빈컵";
		temp=cup1;
		cup1=cup2;
		cup2=temp;

		
		System.out.println("두개의 컵의 내용을 서로 바꾸었습니다.");
		System.out.println("컵1:" + cup1);
		System.out.println("컵2:" + cup2);
	}
}
