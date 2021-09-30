class CharAndStringTest 
{
	public static void main(String[] args) 
	{

 //자바에서는 단일문자 처리는 홋따옴펴, 문자열 처리는 쌍따옴표
 //만약 하나의 문자이지만, 쌍따옴으로 굳이 쓰고 싶다면?
 //char에 저장은 불가하고, String으로 저장해야함 

		char firstName;
		firstName = '박';
		System.out.println(firstName);

		String name;
		name = "박성미";
		System.out.println(name);

		//char LastName;
		String LastName;
		LastName = "미";
		System.out.println(LastName);
		
		String data;
		data = "Hello";
		char last = data.charAt(4);
		//charAt은 String의 위치(index)에 있는 문자 하나를 알려주는 기능입니다. 
		//위치 index는 0부터 출바함.
				System.out.println("맨 마지막에 있는 문자는 " +last +"입니다.");
		

	
	}
}



/*CharAndStringTest.java:20: error: cannot find symbol
                System.out.println(lastname);
                                   ^
  symbol:   variable lastname
  location: class CharAndStringTest*/


 