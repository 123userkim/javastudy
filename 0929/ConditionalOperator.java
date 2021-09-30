import java.util.Scanner;
class ConditionalOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,min;
		System.out.println("첫 번째 수를 입력하기");
		a = sc.nextInt();
		System.out.println("두 번째 수를 입력하기");
		b = sc.nextInt();
		min = (a<b)?a:b;
		System.out.println("작은 수는" + min +"입니다.");
	}
}
