//O pacote teste é para testar o programa.
//A classe teste é para testar todas as questões do trabalho.
//Essa classe possui o main, que só é para testes.

package teste;
import model.Album;
import model.Obra;
import q1.Conversor;
import q1.JSON;
import q1.XML;
import q2.HTML;
import q2.LATEX;
import q2.Relatorio;
import q2.TipoRelatorio;

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
	   
	   System.out.println();
	   System.out.println();
	   System.out.println();
	   
	   System.out.println("JSON" + "\n" + conversor1.converte(obra));

	   System.out.println();
	   System.out.println();
	   System.out.println();
	   
	   System.out.println("XML" + "\n" + conversor2.converte(obra));
	   
	   System.out.println();
	   System.out.println();
	   System.out.println();
	   
	   System.out.println("HTML - RELATORIO RESUMIDO" + "\n" + relatorio1.formatoRelatorio(obra, TipoRelatorio.RESUMIDO));
	   
	   System.out.println();
	   System.out.println();
	   System.out.println();

	   System.out.println("HTML - RELATORIO COMPLETO" + "\n" + relatorio1.formatoRelatorio(obra, TipoRelatorio.COMPLETO));

	   System.out.println();
	   System.out.println();
	   System.out.println();
	   
	   System.out.println("LATEX - RELATORIO RESUMIDO" + "\n" + relatorio2.formatoRelatorio(obra, TipoRelatorio.RESUMIDO));
	
	   System.out.println();
	   System.out.println();
	   System.out.println();

	   System.out.println("LATEX - RELATORIO COMPLETO" + "\n" + relatorio2.formatoRelatorio(obra, TipoRelatorio.COMPLETO));

	}
	
}
