
public class FluxoComErro {
	
	public static void main(String[] args) {
		System.out.println("Ini do main ");
		try {
		m�todo1();
		} catch(ArithmeticException 1 NullPointerException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void m�todo1() {
		System.out.println("Ini do m�todo1");
		 m�todo2();
		System.out.println("Fim do m�todo1");
	}
	
	private static void m�todo2() {
		System.out.println("ini do m�todo 2");
		m�todo2();
		System.out.println("fim do m�todo 2");
	}
}
