class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		//int age;
		long age;
		age= 27;
	System.out.println("김시아의 나이 :"+age+"살입니다.");
	
	
	//double height;
	float height;
	//height=173.8f;
	height = (float)173.8;
	System.out.println("김시아의 키 : "+height);


	char gender;
		gender = 'M' ;
		System.out.println("김시아의 성별은 : "+gender+"입니다.");
    
	// 쌍따옴표로 묶으면 String으로 취급 cha에 저장할 수가 없음

	boolean isVaccine;
	isVaccine = true;
	System.out.println("김시아의 1차 백신 접종여부 : "+ isVaccine);
}
}
	/*
	C:\javastudy\0928>javac DataTypeTest.java
DataTypeTest.java:15: error: incompatible types: possible lossy conversion from double to float
        height=173.8;
		
		===>float이 4바이트라서 용량이 딸림(doubled은 8바이트). 그럼에도 불구하고 무조건 하고 싶다면?
		1)실수 값 뒤에 f를 붙이는 방법 ex) height=173.8f;
		2)앞에 float형으로 바꿀 거야 라고 명명하기 ex) height = (float)173.8
	
		*/

		

	
