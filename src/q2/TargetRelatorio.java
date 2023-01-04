//o pacote q2 significa, a resposta da segunda questão.
//Na segunda questão, nós utilizamos o padrão adpater, como forma de evitar a explosão de classes.
//Nós temos a interface TargetRelatorio que tem o método geraRelatorio.

package q2;

import model.Obra;

public interface TargetRelatorio {
   public String geraRelatorio(Obra obra, TipoRelatorio tipo, FormatoRelatorio formato);
}
