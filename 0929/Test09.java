import java.util.Scanner;
class Test09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("임의의 수 n을 입력해주세요." );
		n=sc.nextInt();
	//System.out.println(  n+"은"+( (n%2==0)? "짝수" :  "홀수") +"입니다.");
		String result = (n%2==0)? "짝수":"홀수";
		System.out.println(n+"은"+result +"입니다.");

	}
}
