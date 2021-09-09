
public class FluxoComErro {
	
	public static void main(String[] args) {
		System.out.println("Ini do main ");
		try {
		método1();
		} catch(ArithmeticException 1 NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void método1() {
		System.out.println("Ini do método1");
		 método2();
		System.out.println("Fim do método1");
	}
	
	private static void método2() {
		System.out.println("ini do método 2");
		método2();
		System.out.println("fim do método 2");
	}
}
