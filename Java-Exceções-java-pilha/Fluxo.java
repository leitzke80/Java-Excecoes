
public class Fluxo {
	
	public static void main(String[] args) {
		System.out.println("Ini do main ");
		try {
		m�todo1();
		} catch(Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void m�todo1() throws MinhaExcecao {
		System.out.println("Ini do m�todo1");
		 m�todo2();
		System.out.println("Fim do m�todo1");
	}
		
	private static void m�todo2() throws MinhaExce��o {
		System.out.println("Ini do m�todo2");
		throw new NullPointException("deu muito errado");
		
		//System.out.println("Fim do m�todo2");
	}
}
