
public class data09 {

	public static void main(String[] args) {
		int a=10;
		System.out.println("a++:"+(a++));
		//먼저 a변수값을 출력하고 나중에 1증가한다.
		System.out.println("후행증가한값:"+a);//11
		
		int b=10;
		System.out.println("++b:"+(++b));//먼저 1증가한
		//11출력
		System.out.println("선행증가한 값:"+b);
		
		int c=10;
		int d=c++;//먼저 c변수값 10을 좌측 변수 d에 대입하고
		//나중에 1 증가한다.
		
		System.out.println("d="+d);//10
		System.out.println("c++:"+c);//11
		
	}

}
