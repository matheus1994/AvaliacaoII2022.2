package aval20222.q2;

import model.Obra;

public interface Relatorio {
	public String formatoRelatorio(Obra obra, TipoRelatorio tipo);
	public Relatorio clone();
}

