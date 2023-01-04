//o pacote q1 significa, a resposta da primeira questão.
//Na primeira questão, nós utilizamos o padrão adpater, como forma de evitar a explosão de classes.
//Nós temos a interface TargetFormato que tem o método geraConversao.
package q1;

import model.Obra;

public interface TargetFormato {
   public String geraConversao(Obra obra, TipoFormato tipo);
}
