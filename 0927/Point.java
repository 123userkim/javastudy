 import java. util. Scanner; 
 class Point{
	public static void main(String []args){  
	Scanner sc=new Scanner (System. in); 
	int com,clang,eng,math,avg;
 	System.out.println("컴퓨터 개론 과목의 점수를 입력하시오==>");
	com = sc.nextInt();
	System.out.println(" c언어 프로그래밍  과목의 점수를 입력하시오==>");
	clang = sc.nextInt();
	System.out.println("영어 과목의 점수를 입력하시오==>");
	eng = sc.nextInt();
	System.out.println("일반수학의 점수를 입력하시오==>");
	math = sc.nextInt(); 
 	avg=(com+clang+eng+math) / 4 ;
	System.out.println("**결과출력**");
	System.out.println("평균점수는" + avg+"점입니다.");


}
}