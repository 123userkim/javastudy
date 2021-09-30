//사용자한테 두 개의 정수를 입력받아, 그중에 큰 수를 찾아 출력하는 프로그램을 작성해봅니다.
import java.util.Scanner;
class  Maxtest
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 int a, b, max;
         System.out.println("첫 번째 수를 입력하시오.");
		 a= sc.nextInt();
		 System.out.println("두 번째 수를 입력하시오.");
		 b= sc.nextInt();
		 if (a>b)
			 max= a;
		 else
			 max=b; 
		  System.out.println("큰 수는" + max+"입니다.");
		 {
		 }
	}
}
