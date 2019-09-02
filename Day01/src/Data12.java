
public class Data12 {

	public static void main(String[] args) {
		int score=32;
		
		String grade="";//학점을 저장할 변수
		
		if(score>=90 && score<=100) {
			grade="A";
	    }else if(score>=80 && score<=89) {
	    	grade="B";
	    }else if(score>=70 && score<=79) {
		    grade="C";
	    }else if(score>=60 && score<=69) {
		    grade="D";
	    }else {//60점 미만일때
	    	grade="F";
	    }//if else if 다중조건문
	System.out.println(score+"는 "+grade+"학점");
	/*if(조건식1){
	 * 조건식 1이 참일때 실행;
	 * }else if(조건식2){
	 * 조건식 2가 참일때 실행;
	 * }else if(조건식3){
	 * 조건식 3이 참일때 실행;
	 * }else{
	 * 조건식 1,2,3이 모두 거짓일때 실행;
	 */
	}
}
