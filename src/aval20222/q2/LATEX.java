//O pacote aval20222.q2 significa que é a resposta da segunda questão.
//A classe LATEX implementa a interface Relatorio.
//O método formatoRelatorio recebe uma obra e um tipo de relatório e a exibe no formato LATEX.
//O método clone retorna um clone de um objeto.
//Na segunda questão nós utilizamos o padrão prototype.

package aval20222.q2;
import model.Album;
import model.Livro;
import model.Obra;

public class LATEX implements Relatorio{

	public String formatoRelatorio(Obra obra, TipoRelatorio tipo) {
		if(obra instanceof Livro && tipo == TipoRelatorio.RESUMIDO) {
			Livro livro = (Livro) obra;
			return "% " + livro.getTitulo() + "\n"
			      +"\textbf {"+livro.getTitulo()+"}" + "\n"
			      +"emph{"+livro.getAutor()+ " ("+livro.getAno()+")"+"}";
		}
        else if(obra instanceof Livro && tipo == TipoRelatorio.COMPLETO) {
			Livro livro = (Livro) obra;
			return "% " + livro.getTitulo() + "\n"
		      +"\textbf {"+livro.getTitulo()+"}" + "\n"
		      +"emph{"+livro.getAutor()+ " ("+livro.getAno()+")"+"}"+"\n"
		      +"Editora: " +livro.getEditora()+"\n"
		      +"Numero de paginas: "+livro.getNumeroPaginas()+"\n"
		      +"Avaliacao: "+livro.getAvaliacao();
        }
		else if(obra instanceof Album && tipo == TipoRelatorio.RESUMIDO) {
			Album album = (Album) obra;
			return "% " + album.getTitulo() + "\n"
			      +"\textbf {"+album.getTitulo()+"}" + "\n"
			      +"emph{"+album.getAutor()+ " "+album.getAno()+"}";
		}
		else if(obra instanceof Album && tipo == TipoRelatorio.COMPLETO) {
			Album album = (Album) obra;
			return "% " + album.getTitulo() + "\n"
			      +"\textbf {"+album.getTitulo()+"}" + "\n"
			      +"emph{"+album.getAutor()+ " "+album.getAno()+"}" + "\n"
			      +"Gravadora: " +album.getGravadora() + "\n"
			      +"Estudio: "+album.getEstudio() + "\n"
			      +"Avaliacao: " + album.getAvaliacao();
		}
		else {
			return "";
		}
		
	}

	public Relatorio clone() {
		return new LATEX();
	}
	
}
