 
import java.util. Scanner;
import java.util. Date;
class CancerTest04 {
	public static void main(String []args){
	Scanner sc =new Scanner(System.in);
 	Date today=new Date();
	String name;
	int UserYear;
	int thisYear= today.getYear()+1900;

	System.out.println("이름을 입력하시오.");
	name= sc.next();
	System.out.println("출생연도를 입력하시오.");
	UserYear=sc.nextInt();
	int age= thisYear-UserYear;

	if(age>=40 && thisYear % 2 ==UserYear % 2)
	System.out.println(name+"님," + thisYear + "년도에 무료 암검진 대상자 입니다.");
	else
	 System.out.println(name+"님," + thisYear + "년도에 무료 암검진 대상자가 아닙니다.");
}}
