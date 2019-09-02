import java.util.Scanner;

/*switch case 다중선택문)
 * switch(정수식){
 *     case 값: 해당 문장 실헹; break;
 *     case 값: 정수식과 값이 일치하면 실행;break;
 *     default: 정수식과 값이 일치하는 부분이 없을때 실행;
 *     }
 * break문은 switch case 다중 조건문(선택문)을 빠져나갈때 사용.     
 */
public class Data13 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 //자동임포트 단축키 ctrl+shift+영문자(o)
	 System.out.println("정수로 점수입력:");
	 int score=Integer.parseInt(sc.nextLine());
	 //입력받은 점수를 정수 숫자로 바꿔서 지정
	 int num=score/10;//10으로 나눈 몫만 구함
	 String grade="";//학점을 저장할 변수
	 
	 switch(num) {
	 case 10: case 9: grade="A"; break;//몫이 10,9일때
	 case 8: grade="B"; break;
	 case 7: grade="C"; break;
	 case 6: grade="D"; break;
	 default: grade="F";
	 }//switch case
	 System.out.println(score+"는 "+grade+"학점");
	}
}
