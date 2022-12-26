package aval20222.main;

import aval20222.q1.Conversor;
import aval20222.q1.ConversorJSON;
import aval20222.q1.ConversorXML;
import aval20222.q2.Relatorio;
import aval20222.q2.RelatorioHTML;
import aval20222.q2.RelatorioLATEX;
import aval20222.q2.TipoRelatorio;
import model.Album;
import model.Obra;

public class Teste {

	public static void main(String args[]) {
	   
	   Obra obra = new Album("A", 2022, 5.0, "B", "C", "X", 100);
	   
	   Conversor conversor1 = new ConversorJSON();
	   System.out.println(conversor1.clone());
	   
	   Conversor conversor2 = new ConversorXML();
	   System.out.println(conversor2.clone());
	   
	   Relatorio relatorio1 = new RelatorioHTML();
	   System.out.println(relatorio1.clone());
	   
	   Relatorio relatorio2 = new RelatorioLATEX();
	   System.out.println(relatorio2.clone());
	   
	}
	
}
