
public class FluxoComTratamento {
	
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
		System.out.println("Ini do método2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			//Conta c = null;
			//c.deposita();
		}
		System.out.println("Fim do método2");
	}
}
