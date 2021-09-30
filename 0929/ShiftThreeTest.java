class  ShiftThreeTest
{
	public static void main(String[] args) 
	{
		int data = -4;
		System.out.println(data >> 1 );//-2(음수이여도 부호를 유지)
		System.out.println(data >>>1 );//무조건 양수가 나옴, 엄청 큰 수, 예측은 노의미
	}
}
