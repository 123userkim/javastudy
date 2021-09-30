import java.util.Scanner;
class CancerTest{
	public static void main(String []args){
	 
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
System. out. println("이름을 입력하세요.");
name= sc.next();
System. out. println("나이를 입력하세요.");
age = sc.nextInt();

if (age >=40)
System.out.println (name + "님, 무료 암 검진 대상자입니다.");
else
System.out.println (name + "님, 무료 암 검진 대상자가 아닙니다.");

}

}