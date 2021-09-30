import java.util.Scanner;
class  Test01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println( "양수n을 입력해주세요");
		n=sc.nextInt();
		if(n>=0)
			System.out.println(n*100+"작업종료");
		else
			System.out.println(Math.pow(n, 2)+"작업종료");

	}
}
 