//O pacote q2 significa que é a resposta da segunda questão.
//Essa é a interface Relatorio.
//Na segunda questão nós utilizamos o padrão prototype.

package q2;
import model.Obra;

public interface Relatorio {
	public String formatoRelatorio(Obra obra, TipoRelatorio tipo);
	public Relatorio clone();
}

