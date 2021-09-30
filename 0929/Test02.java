import java.util.Scanner;
class  Test02
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int kor,eng,math,tot;
		double avg;
		System.out.println("이름을 입력하시오.");
		name=sc.next();
		System.out.println("국어 점수를 입력하시오.");
		kor=sc.nextInt();
		System.out.println("영어 점수를 입력하시오.");
		eng=sc.nextInt();
		System.out.println("수학 점수를 입력하시오.");
		math=sc.nextInt();

		tot=kor+eng+math;
		System.out.println("총점은"+tot+"입니다.");
		avg=double(tot)/3;
		System.out.println("평균은"+avg+"입니다.");
	
		if(avg>=60)
		System.out.println("합격");
		else
		System.out.println("불합격");


	}
}
