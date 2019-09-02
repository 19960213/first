/* 자바의 한줄 주석문.
 * 주석문이란 소스에 대한 설명문이다. 실행안됨.
 * 
 * 자바의 기본 자료형
 *  1.정수숫자: byte(크기 1바이트),short(2바이트)
 *  ,int(4바이트),long(8바이트)
 *  2.실수숫자: float(4바이트), double(8바이트)
 *  3.true(참),false(거짓):boolean
 *  4.단일문자:char
 *  기본 자료형 8개를 제외한 자료형을 참조형이라 한다.
 *  참조형(레퍼런스타입):클래스형,배열형,인터페이스형
 */
public class Data01 {
/* 1.public 은 누구나 다 접근가능하게 하는 접근제어자
 * 2.class는 클래스명을 정의할 때 사용 
 */
	public static void main(String[] args) {
      System.out.println("정수숫자:"+7);		
      System.out.println("실수숫자:"+10.3);
      System.out.println("참:"+true);
      
      char ch='a';
      System.out.println("단일문자:"+ch);
     String name="홍길동";//String은 문자열 클래형
     //참조타입
      System.out.println("이름:"+name);
	}
}




