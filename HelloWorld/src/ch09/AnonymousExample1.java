package ch09;

public class AnonymousExample1 {

	public static void main(String[] args) {
		Anonymous1 anony = new Anonymous1();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("Ʈ���� �޸��ϴ�.");
		}
		}
				
				
				);

	}

}
