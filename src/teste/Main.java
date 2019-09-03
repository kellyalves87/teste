package teste;

public class Main {
	
	public static void main(String[] args) {
		
		double salario = 800.00;
		boolean condicao = salario > 500.00;
		if(condicao) {
			System.out.println("Posso comprar muito");
		} else if(salario > 350.00) {
			System.out.println("Posso comprar so um pouco");
		}else {
			System.out.println("Tenho que economizar");
		}
		
		
		
		
	}

}
