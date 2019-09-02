/* 삼항조건연산자 형식)
 * 조건식?조건식이 참일때 실행; 조건식이 거짓일때 실행; 
 */
public class Data06 {

	public static void main(String[] args) {
		int age=26;
		String result="";//""는 빈공백
		
		result=(age>=20 && age <= 29)?"20대":"20대아님";
		System.out.println(age+"는 "+result);
/* 자바의 논리연산자
 * &&(논리곱): 입력값이 모두 참일때만 결과값이 참이고, 나머지는 거짓이다.		
 */
	}

}
