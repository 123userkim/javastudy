//자료형 생성할 때는 무조건 Spring 사용하기
class NotDefine{
	public static void main(String[] args) {
		 
		name = "김시아";
		System.out.println("이름은"+name);

	}
}
/*
error: Class names, 'NotDefinejava', are only accepted if annotation processing is explicitly requested
1 error

C:\javastudy\0928>javac NotDefine.java
NotDefine.java:4: error: cannot find symbol
                name = "김시아";
                ^
  symbol:   variable name
  location: class NotDefine
NotDefine.java:5: error: cannot find symbol
                System.out.println("이름은"+name);
                                         ^
  symbol:   variable name
  location: class NotDefine
*/