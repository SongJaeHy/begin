package day04.loop;

public class Test04 {
	public static void main(String[] args) {
		/*
		 *    1 - 2 - 4 - 3
		 *    
		 *    for (1 ; 2 �� or ���� ; 3) {
		 *    	  4 ���� ��� ����
		 * 	  }
		 * 
		 *    1
		 *    while (2 �� or ����) {
		 *    
		 *        4 ���ϰ�� ����
		 *        
		 *        3
		 *    }
		 */
		for (int i = 1; i < 11; i++) {
			System.out.println("for : " + i);
		}
		
		int i = 1;
		while (i < 11) {
			System.out.println("while : " + i);
			i++;
		}
	}
}










