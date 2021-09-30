import java.util.Scanner;
class Test01 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("첫 번째 정수를 입력하시오.");
		a=sc.nextInt();
		System.out.println("두 번째 정수를 입력하시오.");
		b=sc.nextInt();
		if(a>b)
		System.out.println("작은 수는 "+b+"입니다.");
		else
		System.out.println("작은 수는 "+a+"입니다.");
	}
}
