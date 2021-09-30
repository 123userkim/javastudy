import java.util. Date;
import java.util. Scanner;
class CancerTest03 {
public static void main(String []args){
 	Scanner sc = new Scanner (System.in);
 	Date today= new Date();
	String name;
	int age, Useryear;
	int thisyear;
	thisyear= today.getYear()+1900;

	System.out.println("이름을 입력하시오.");
	name = sc. next();
	System.out.println("출생연도를 입력하시오.");
	Useryear= sc. nextInt();
	age=thisyear-Useryear;
	
	System.out.println("올해는"+thisyear+"입니다.");
	if (age>=40)
	System.out.println(name+"님, 올해에" + age +"세 입니다. 무료 암검진 대상자 입니다.");
	else
	System.out.println(name+"님, 올해에" + age +"세 입니다. 무료 암검진 대상자가 아닙니다.");

}
}