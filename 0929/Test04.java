import java.util.Scanner;
class  Test04
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		String name;
		int kor, eng, math,avg;
		System.out.println("이름을 입력하시오.");
		name=sc.next();
		System.out.println("국어 성적을 입력하시오.");
		kor=sc.nextInt();
		System.out.println("영어 성적을 입력하시오.");
		eng=sc.nextInt();
		System.out.println("수학 성적을 입력하시오.");
		math=sc.nextInt();
		avg=(kor+eng+math)/3;
		System.out.println("평균은 "+ avg+"점 입니다.");
		if(avg>=90 && kor>=90)
		System.out.println("장학금 지급 대상자입니다.");
		else
		System.out.println("장학금 지급 대상자가 아닙니다.");
		



	}
}
