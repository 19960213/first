/*증가연산자
 * 1. a++;(1씩증가=>후행증가), ++a;(선행증가), a=a+2;(2씩증가)
 * 2. j--;(1씩감소=>후행감소), --j;(선행감소), j=j-3;(3씩감소). j-=2(2씩감소)
 */
public class Data08 {

	public static void main(String[] args) {
		int a=10;
		++a;//선행 1증가
		System.out.println("++a:"+a);
		
		int b=10;
		b++;//후행 1증가
		System.out.println("=======>"+b);
		
		a=a+2;//11+2=>13
		System.out.println("a=a+2=>"+a);
		
		b+=2;//b=b+2;와 같다. 11+2=13
		System.out.println("b+=2=>"+b);

		

	}

}
