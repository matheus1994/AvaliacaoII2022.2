//O pacote aval20222.main é para testar o programa.
//Essa é a classe teste para todas as questões do trabalho.
//Essa classe possui o main, que só é para testes.

package aval20222.main;
import aval20222.q1.Conversor;
import aval20222.q1.JSON;
import aval20222.q1.XML;
import aval20222.q2.Relatorio;
import aval20222.q2.HTML;
import aval20222.q2.LATEX;
import aval20222.q2.TipoRelatorio;
import model.Album;
import model.Obra;

public class Teste {

	public static void main(String args[]) {
	   
	   Obra obra = new Album("A", 2022, 5.0, "B", "C", "X", 100);
	 
	   Conversor conversor1 = new JSON();
	   System.out.println(conversor1.clone());
	   
	   Conversor conversor2 = new XML();
	   System.out.println(conversor2.clone());
	   
	   Relatorio relatorio1 = new HTML();
	   System.out.println(relatorio1.clone());
	   
	   Relatorio relatorio2 = new LATEX();
	   System.out.println(relatorio2.clone());
	   
	}
	
}
