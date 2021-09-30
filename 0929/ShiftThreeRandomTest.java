import java.util.Random;
class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		
		int n = rand.nextInt();//int의 범위에서 아무거나 하나 무작위로 만들어줌,, 실행할 때마다 그 값이 다를수 있음
		System.out.println(n);
       

		//0과 9사이의 난수가 발생하도록 프로그램을 수정하기
		
		n= n>>> 1; //무조건 양수를 만드는 >>>1
		
		n = n%10;     //0과 9사이의 난수 발생하기 위해서는 나머지 연산자를 이용하면 됨 ex)5678%10=8
		System.out.println(n);

	
	}
}
