package day02.operator;

public class Test04 {
	public static void main(String[] args) {
		/*
		 *  ++이 변수이름 앞에 있을때
		 *  a = a + 1;  
		 *  int b = a;
		 *  
		 *  
		 *  ++이 변수이름 뒤에 있을때
		 *  int b = a;
		 *  a = a + 1;  
		 */
		{
			int a = 5;
			int b = ++a;
			System.out.println(a);
			System.out.println(b);
		}
		
		{
			int a = 5;
			int b = a++;
			System.out.println(a);
			System.out.println(b);
		}
		
		{
			int a = 5;
			/*
			 *   a = a + 1;
			 *   System.out.println(a);
			 *   
			 *   
			 *   System.out.println(a);
			 *   a = a + 1;
			 *   
			 *   System.out.println(a);
			 */
			System.out.println(a++);
			System.out.println(a);
		}
	}
}













