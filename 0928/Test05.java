import java.util.Scanner;
class Test05
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("n�� �Է��Ͻÿ�.");
		n= sc.nextInt();
		boolean flag;
		flag = n % 6== 0 ;

		System.out.println(flag);
	}
}