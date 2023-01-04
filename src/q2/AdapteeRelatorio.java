//o pacote q2 significa, a resposta da segundaa questão.
//Na segunda questão, nós utilizamos o padrão adpater, como forma de evitar a explosão de classes.
//Nós temos o método gerandoRelatorio que recebe como parametro uma obra, um tipo de relatório, um tipo de formato de relatório e retorna o formato em string.


package q2;

import model.Album;
import model.Livro;
import model.Obra;

public class AdapteeRelatorio {

	public String gerandoRelatorio(Obra obra, TipoRelatorio tipo, FormatoRelatorio formato) {
		if(obra instanceof Livro && tipo == TipoRelatorio.RESUMIDO && formato == FormatoRelatorio.HTML) {
			Livro livro = (Livro) obra;
			return "<HTML>"+"\n"
				  +"<HEAD>"+"</HEAD>"+"\n"
			      +"<BOLD>"+"\n"
				  +"<!-- "+livro.getTitulo() + " -->" + "\n"
			      +"<bold>"+livro.getTitulo()+"</bold>"+"\n"
				  +"<italic>"+livro.getAutor() + " (" + livro.getAno() +")"+"</italic>"+"\n"
			      +"</BOLD>";
		}
		else if(obra instanceof Livro && tipo == TipoRelatorio.COMPLETO && formato == FormatoRelatorio.HTML) {
			Livro livro = (Livro) obra;
			return "<HTML>"+"\n"
				  +"<HEAD>"+"</HEAD>"+"\n"
			      +"<BOLD>"+"\n"
				  +"<!-- "+livro.getTitulo() + " -->" + "\n"
			      +"<bold>"+livro.getTitulo()+"</bold>"+"\n"
				  +"<italic>"+livro.getAutor() + " (" + livro.getAno() +")"+"</italic>"+"\n"
			      +"Editora: "+livro.getEditora()+"\n"
			      +"Numero de paginas: "+livro.getAno()+"\n"
			      +"Avalicao: "+livro.getAvaliacao()
			      +"</BOLD>";
		}
		else if(obra instanceof Album && tipo == TipoRelatorio.RESUMIDO && formato == FormatoRelatorio.HTML) {
			Album album = (Album) obra;
			return "<HTML>"+"\n"
					  +"<HEAD>"+"</HEAD>"+"\n"
				      +"<BOLD>"+"\n"
					  +"<!-- "+album.getTitulo() + " -->" + "\n"
				      +"<bold>"+album.getTitulo()+"</bold>"+"\n"
				      +"<italic>"+album.getAutor() + " " + album.getAno()+"</italic>"+"\n"
				      +"</BOLD>";
		}
		else if(obra instanceof Album && tipo == TipoRelatorio.COMPLETO && formato == FormatoRelatorio.HTML) {
			Album album = (Album) obra;
			return "<HTML>"+"\n"
					  +"<HEAD>"+"</HEAD>"+"\n"
				      +"<BOLD>"+"\n"
					  +"<!-- "+album.getTitulo() + " -->" + "\n"
				      +"<bold>"+album.getTitulo()+"</bold>"+"\n"
				      +"<italic>"+album.getAutor() + " " + album.getAno()+"</italic>"+"\n"
				      +"Gravadora: "+album.getGravadora()+"\n"
				      +"Estudio: "+album.getEstudio()+"\n"
				      +"Avaliacao: "+album.getAvaliacao()+"\n"
				      +"</BOLD>";
		}
		else if(obra instanceof Livro && tipo == TipoRelatorio.RESUMIDO && formato == FormatoRelatorio.LATEX) {
			Livro livro = (Livro) obra;
			return "% " + livro.getTitulo() + "\n"
			      +"\textbf {"+livro.getTitulo()+"}" + "\n"
			      +"emph{"+livro.getAutor()+ " ("+livro.getAno()+")"+"}";
		}
        else if(obra instanceof Livro && tipo == TipoRelatorio.COMPLETO && formato == FormatoRelatorio.LATEX) {
			Livro livro = (Livro) obra;
			return "% " + livro.getTitulo() + "\n"
		      +"\textbf {"+livro.getTitulo()+"}" + "\n"
		      +"emph{"+livro.getAutor()+ " ("+livro.getAno()+")"+"}"+"\n"
		      +"Editora: " +livro.getEditora()+"\n"
		      +"Numero de paginas: "+livro.getNumeroPaginas()+"\n"
		      +"Avaliacao: "+livro.getAvaliacao();
        }
		else if(obra instanceof Album && tipo == TipoRelatorio.RESUMIDO && formato == FormatoRelatorio.LATEX) {
			Album album = (Album) obra;
			return "% " + album.getTitulo() + "\n"
			      +"\textbf {"+album.getTitulo()+"}" + "\n"
			      +"emph{"+album.getAutor()+ " "+album.getAno()+"}";
		}
		else if(obra instanceof Album && tipo == TipoRelatorio.COMPLETO && formato == FormatoRelatorio.LATEX) {
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
	
}
