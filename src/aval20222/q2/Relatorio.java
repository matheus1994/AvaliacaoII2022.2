package aval20222.q2;

import model.Obra;

public interface Relatorio {
	public String formatoRelatorio(Obra obra, TipoRelatorio tipo);
	public Relatorio clone();
}
//Essa é a segunda questão do trabalho, nós utilizamos o padrão prototype, onde temos a interface Relatorio, onde as classes concretas RelatorioLaTex e RelatorioHTML implementam a interface Relatorio. 

