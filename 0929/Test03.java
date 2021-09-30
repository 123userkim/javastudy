import java.util.Scanner;
class Test03 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age1,age2;
		System.out.println("첫 번째 사람의 나이를 입력하시오.");
		age1=sc.nextInt();
		System.out.println("두 번째 사람의 나이를 입력하시오.");
		age2=sc.nextInt();
		if(age1 == age2)
		System.out.println("둘은 동갑입니다");
		else
		System.out.println("나이가 다릅니다");
	}
}
