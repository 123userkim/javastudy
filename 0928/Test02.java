import java.util.Scanner;
class  Test02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	String data;
	System.out.println("문자열을 입력하시오.");
	data =sc.next();
	int cnt=0;
	char ch;
	for (int i=0; i<data.length() ;i=i+1 ){
		ch= data.charAt(i);

		if(ch=='o')
		cnt=cnt+1;

	}
 System.out.println("소문자 o의 수는"+cnt+"개입니다.");
	}}