package day04.loop;

public class Test02 {
	public static void main(String[] args) {
		int a = 9;
		if (a % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		// ���� ������( ���ǽ� ? ��1 : ��2 )
		String result = (a % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println(result);
		
		
		System.out.println((a % 2 == 0) ? "¦��" : "Ȧ��");
	}
}














