//O pacote teste é para testar o programa.
//A classe teste é para testar todas as questões do trabalho.
//Essa classe possui o main, que só é para testes.

package teste;

import model.Album;
import model.Obra;
import q1.AdapteeFormato;
import q1.AdapterFormato;
import q1.TipoFormato;
import q2.AdapteeRelatorio;
import q2.AdapterRelatorio;
import q2.FormatoRelatorio;
import q2.TipoRelatorio;


public class Teste {

	public static void main(String args[]) {
	   
	   Obra obra = new Album("A", 2022, 5.0, "B", "C", "X", 100);
	   AdapteeFormato a = new AdapteeFormato();
	   AdapterFormato af = new AdapterFormato(a);
	 
	   System.out.println("PRIMEIRA QUESTÃO");
	   System.out.println("Tipo de Formato - XML");
	   System.out.println(af.geraConversao(obra, TipoFormato.XML));
	   
	   System.out.println();
	   
	   System.out.println("PRIMEIRA QUESTÃO");
	   System.out.println("Tipo de Formato - JSON");
	   System.out.println(af.geraConversao(obra, TipoFormato.JSON));
	   
	   System.out.println();
	   
	   AdapteeRelatorio a1 = new AdapteeRelatorio();
	   AdapterRelatorio ar = new AdapterRelatorio(a1);
	 
	   System.out.println();
	   
	   System.out.println("SEGUNDA QUESTÃO");
	   System.out.println("Formato de Relatorio - HTML - RESUMIDO");
	   System.out.println(ar.geraRelatorio(obra, TipoRelatorio.RESUMIDO, FormatoRelatorio.HTML));

	   System.out.println();
	   
	   System.out.println("SEGUNDA QUESTÃO");
	   System.out.println("Formato de Relatorio - LATEX - RESUMIDO");
	   System.out.println(ar.geraRelatorio(obra, TipoRelatorio.RESUMIDO, FormatoRelatorio.LATEX));
	   
	}
	
}
