import java.util. Scanner;
class  Test
{      
	public static void main(String[] args) 
	{  Scanner sc= new Scanner(System.in);

	String a;
	System.out.println("문자를 입력하세요.");
	a= sc.next();
	char first = a.charAt(0);
	System.out.println("맨 처음에 있는 문자는 " +first +"입니다.");
	
		 
	//String first=a .charAt(0)+""; //String 으로 만들기 위해서 +"";
	//String first = a .substring(0,1);
	//System.out.println("맨 처음에 있는 문자는 " +first +"입니다.");







	}
}
