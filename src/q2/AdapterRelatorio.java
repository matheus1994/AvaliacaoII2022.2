//o pacote q2 significa, a resposta da segunda questão.
//Na segunda questão, nós utilizamos o padrão adpater, como forma de evitar a explosão de classes.
//Nós temos a classe AdapterRelatorio que possui uma inner class que é o adaptee;
//Nós temos um construtor.
//Nós temos temos o método geraRelatorio que vai retornar um método que está na classe AdapteeRelatorio. 

package q2;

import model.Obra;

public class AdapterRelatorio implements TargetRelatorio{

	private AdapteeRelatorio adaptee;
	
	public AdapterRelatorio(AdapteeRelatorio adaptee) {
		this.adaptee = adaptee;
	}
	
	public String geraRelatorio(Obra obra, TipoRelatorio tipo, FormatoRelatorio formato) {
		return this.adaptee.gerandoRelatorio(obra, tipo, formato);
	}

}
