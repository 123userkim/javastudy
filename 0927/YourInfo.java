import java. util. Scanner;
class YourInfo{
 	public static void main(String []args){
	Scanner sc = new Scanner(System. in);
	String name;
	int age;	
	System. out. println("당신의 이름은 무엇입니까?");
	name = sc.next();
	System. out. println("당신의 나이는 몇 살입니까?");
	age = sc.nextInt();
	System. out. println("반갑습니다! 당신의 이름은" + name + "이고, 나이는" + age + "살입니다.");
}
}