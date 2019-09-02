/*자바의 비교(관계) 연산자
 * 1.비교연산자 결과값은 bloolean 타입이다. 즉 true 또는 false이다.
 * 2. >, <, >=, <=, ==, !=
 */
public class Data05 {

	public static void main(String[] args) {
		int a=10;
		int b=8;
		boolean result=false;
		
		result=a>b;
		System.out.println(a+">"+b+":"+result);
		
		result=a<b;
		System.out.println(a+"<"+b+":"+result);
		
		result=(a == b);
		System.out.println(a+" == "+b+":"+result);
		
		result=(a != b);
		System.out.println(a+" != "+b+":"+result);
		


	}

}
