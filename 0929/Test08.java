import java.util.Scanner;
class  Test08
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("첫 번째 정수를 입력해주세요." );
		a=sc.nextInt();
		System.out.println("두 번째 정수를 입력해주세요." );
		b=sc.nextInt();
	    System.out.println((a>b)?b: a);
	}
}
