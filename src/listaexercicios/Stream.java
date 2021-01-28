package listaexercicios;

import java.util.Arrays;
import java.util.List;

public class Stream {
	
	// Feito anteriormente baseado no mesmo material para entendimento do Lambda 

	public static void main(String[] args) {
				
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,9,6,2,2,1,1);
		list.stream().distinct() // M�todo/Opera��o intermedi�ria distinct ignora dados repetidos
		.forEach(e -> System.out.println(" Distinct: "+e));
		System.out.println("");
		
		list.stream().filter(e -> e % 2 == 0).distinct().forEach(e -> System.out.println(" Filter: "+e));
		System.out.println("");
		
		list.stream().skip(2) // M�todo/Opera��o intermedi�ria Skip ignora os dois primeiros dados do stream
		.forEach(e -> System.out.println(" Skip: "+e));
		System.out.println("");
		
		list.stream().limit(2) // M�todo/Opera��o intermedi�ria limit ignora os demais dados do stream
		.forEach(e -> System.out.println(" Limit: "+e));
		System.out.println("");
		
		list.stream().map(e -> e *2) //multiplicar os numeros por 2 (tranforma��o dos dados)
		// a lista original n�o � modificada, a transforma��o � apenas no stream
		.forEach(e -> System.out.println(" Map: "+e));
		
		System.out.println(list);

	}

}
