import java.util.Scanner;
class Test12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double pou, g;
		System.out.println("파운드를 입력하세요.");
		pou=sc.nextDouble();
		g=pou * 454;
		System.out.println(g+"g입니다.");

	}
}



