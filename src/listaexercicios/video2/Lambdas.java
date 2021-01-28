package listaexercicios.video2;

import java.util.ArrayList;
import java.util.List;


public class Lambdas {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Editora casa do codigo");
		palavras.add("Caelum");

		palavras.forEach(s -> System.out.println(s));
		
		palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length())); 
		System.out.println(palavras);
		
	}

}
