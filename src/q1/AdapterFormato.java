//o pacote q1 significa, a resposta da primeira questão.
//Na primeira questão, nós utilizamos o padrão adpater, como forma de evitar a explosão de classes.
//Nós temos a classe AdapterFormato que possui uma inner class que é o adaptee;
//Nós temos um construtor.
//Nós temos temos o método geraConversao que vai retornar um método que está na classe AdapteeFormato. 

package q1;

import model.Obra;

public class AdapterFormato implements TargetFormato{

	private AdapteeFormato adaptee;
	
	public AdapterFormato(AdapteeFormato adaptee) {
		this.adaptee = adaptee;
	}
	
	@Override
	public String geraConversao(Obra obra, TipoFormato tipo) {
		return this.adaptee.gerandoConversao(obra, tipo);
	}

}
