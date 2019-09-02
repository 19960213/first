/* 자바의 논리연산자 
 * 1.&&(논리곱): 두개의 입력값이 모두 true인 경우만 결과도 true이다.
 * 2.||(논리합): 두개의 입력값중 하나라도 true이면 결과도 true이다.
 * 3.!(논리부정): 입력값이 false이면 true로, true면 false이다.
 */
public class Data07 {

	public static void main(String[] args) {
		boolean re=false;
		
		re=(true && true);
		System.out.println("true && true:"+re);
		
		re=(false || false);
		System.out.println("false || false:"+re);
		
		re=!false;
		System.out.println("!false:"+re);
		
	
	}

}
