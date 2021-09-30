import java. util. Scanner;
class Exam02{
	public static void main(String []args){
	Scanner sc = new Scanner(System. in);
	double x;
	System.out.println("실수 x를 입력하시오.");
	x= sc. nextDouble();
	double r= 3*Math.pow(x,3) - 7*Math.pow(x,2) +9 ;
	System.out.println("결과" + r);


}
}