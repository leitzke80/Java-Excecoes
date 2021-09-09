
public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Ini do main ");
		try {
		método1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void método1() throws MinhaExcecao {
		System.out.println("Ini do método1");
		 método2();
		System.out.println("Fim do método1");
	}
		
	private static void método2() throws MinhaExceção {
		System.out.println("Ini do método2");
		throw new NullPointException("deu muito errado");
		
		//System.out.println("Fim do método2");
	}
}
