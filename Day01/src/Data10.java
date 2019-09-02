public class Data10 {

	public static void main(String[] args) {
	int k=10;
	int i=k--;//먼저 k변수값 10을 i변수에 대입저장하고 나중에 1감소
	System.out.println("i="+i);
	System.out.println("k--:"+k);//9
	
	k=k-3;//9-3=6
	System.out.println("9-3="+k);
	
	int j=--k;//먼저 1감소한 5값이 j변수에 저장
	System.out.println("j="+j);
	System.out.println("j-=2:"+(j-=2));//3
	

	}

}
