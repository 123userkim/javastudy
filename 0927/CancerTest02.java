import java.util.Scanner;
class CancerTest02{
 public static void main(String[]args){
	Scanner sc = new Scanner(System. in);
	String name;
	int UserYear,age;
	System. out. println(" 이름을 입력하시오.");
	name = sc. next();
	System. out. println(" 출생연도를 입력하시오.");
	UserYear = sc.nextInt();
	age = 2021-UserYear;
	
	if(age>=40)
	System. out. println(name+ "님, 올해 " + age + "세 입니다. 무료 암 검진 대상자입니다.");
	else 
	System. out. println(name+ "님, 올해 " + age + "세 입니다. 무료 암 검진 대상자가 아닙니다.");
}
}