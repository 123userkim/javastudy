import java.util.Scanner;
class  Test07
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		int age1, age2;
		System.out.println("첫 번째 사람의 나이를 입력하시오 ");
		age1=sc.nextInt();
		System.out.println("두 번째 사람의 나이를 입력하시오 ");
		age2=sc.nextInt();
		if(age1>=20 & age2 >=20)
		System.out.println("두 사람 모두 20살이상입니다");
		else
		System.out.println("두 사람 모두 20살이상이 아닙니다");
	}
}
