import java. util. Scanner;
class CalcTest02{
	public static void main (String []args){
	Scanner sc = new Scanner(System . in);
	int  first, second;
	System.out.println("첫 번째 수를 입력하세요");
	first = sc. nextInt();
	 System.out.println("두 번째 수를 입력하세요");
	second= sc. nextInt();
 
                           System.out.println("**결과 출력**");
	     System.out.println("더하기 : " + (first + second));
 	     System.out.println("빼기 : " + (first - second));
  	   System.out.println("곱하기 : " + (first * second));
   	  System.out.println("나누기 : " + (first / second));
	 
 

}
}