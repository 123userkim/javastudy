import java.util.Scanner;
class Test05
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("n을 입력하시오.");
		n= sc.nextInt();
		boolean flag;
		flag = n % 6== 0 ;

		System.out.println(flag);
	}
}
