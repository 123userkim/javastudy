import java. util. Scanner; 
class CalcTest{
	public static void main (String []arge){
	Scanner sc = new Scanner(System. in);
	int first, second, add, sub, multi, div;
	System.out.println("첫 번째 수를 입력하시오");
	first = sc.nextInt();
	System.out.println("두 번째 수를 입력하시오");
	second = sc.nextInt();
	add=first + second;
	sub = first - second;
	multi = first * second;
	div = first / second;
	
	System.out.println("**결과 출력**");
	System.out.println("더하기 : " + add);
	System.out.println("빼기 : " + sub);
	System.out.println("곱하기 : " + multi);
	System.out.println("나누기 : " + div);



}
}