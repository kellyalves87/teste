package teste;

public class Primitivo {

	public static void main(String[] args) {

		// > simbolo de maior
		// >= simbolo de maior ou igual
		// < simbolo de menor
		// <= simbolo de menor ou igual
		// == simbolo de igualdade
		// = simbolo de atribuição
		
		double salario = 1000.00;

		boolean condicao = salario == 1000.00;
		System.out.println("Minha condicao eh " + condicao);
		
		boolean condicaoNegada = !condicao;
		System.out.println("Minha condicao quando for negada retorna " + condicaoNegada);
		
		boolean condicaoAnd = salario < 1000.00 && salario >= 500.00;
		System.out.println("Minha condicao AND e " + condicaoAnd);		
		
		boolean condicaoOr = salario < 1000.00 || salario >= 500.00;
		System.out.println("Minha condicao OR e " + condicaoOr);
				
		if (condicaoNegada) {
			System.out.println("Posso comprar muito");
		} else if (condicaoAnd) {
			System.out.println("Posso comprar so um pouco");
		} else if(condicaoOr){
			System.out.println("Tenho ainda pra gastar");
		}else {
			System.out.println("Tenho que economizar");
		}

//		AND & = DUAS CONDIÇÕES TEM QUE SER VERDADE
//		OR | = UMA DAS DUAS TEM QUE SER VERDADE
//		NOT ! = NEGA A CONDIÇÃO

	}

}
