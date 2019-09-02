import java.util.Scanner;

/* java.util 패키지의 Scanner클래스는 jdk1.5에서 추가되었고
 * 텍스트 모드로부터 무엇을 입력받기 위해 사용, 패키지는 폴더개념과 같다.
 * import예약어는 외부 패키지의 클래스를 읽어들일때 사용한다.
 */

/* if(조건식){
 *  조건식이 참일때 실행;
 *  }else{
 *  조건식이 거짓일때 실행;
 *  }
 */

public class Data11 {
     public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		//이클립스 임포트 단축키:ctrl+shift+영문자(o)
/* 1.System.in은 키보드 입력장치와 연결
 */
    	System.out.println("첫번째 정수숫자 입력:");
    	int a=Integer.parseInt(sc.nextLine());//입력받은값은
        //정수숫자로 바꿔서 좌측변수 a에 저장    	
    	System.out.println("두번째 정수숫자 입력:");
    	int b=Integer.parseInt(sc.nextLine());
        //println()에서ln은 줄 바뀜
    	int max=0;//최대값을 저장할 변수
    	int min=0;//최소값을 저장할 변수
    	
    	if(a>b) {//a가 b보다 크면 참
    		max=a; min=b;
        }else {//b>a
        	max=b; min=a;
        }
    	System.out.println("최대값:"+max);
    	System.out.println("최소값:"+min);
      }

}
