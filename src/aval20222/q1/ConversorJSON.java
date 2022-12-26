package aval20222.q1;

import model.Album;
import model.Livro;
import model.Obra;

public class ConversorJSON implements Conversor{

	public String converte(Obra obra) {
		
		if(obra instanceof Livro) {
			Livro livro = (Livro) obra;
			return "titulo: " + obra.getTitulo() + "," + "\n"
				  +"ano: " + obra.getAno() + "," + "\n"
			      +"avalicao: " + obra.getAvaliacao() + "," + "\n"
				  +"editora: " + livro.getEditora() + "," + "\n"
			      +"idioma: " + livro.getIdioma() + "," + "\n"
				  +"autor: " + livro.getAutor() + "," + "\n"
			      +"numero de paginas: " + livro.getNumeroPaginas();
		}
		
		else if(obra instanceof Album) {
			Album album = (Album) obra;
			return "titulo: " + obra.getTitulo() + "," +"\n"
				  +"avaliacao: "+ obra.getAvaliacao() + "," + "\n"
			      +"estudio: "+ album.getEstudio() + "," + "\n"
				  +"gravadora: " + album.getGravadora() + "," + "\n" 
			      +"autor: " + album.getAutor() + "," + "\n"
				  +"duracao: " + album.getDuracao();
		}
		
		else {
			return null;
		}
		
	}
	
	public Conversor clone() {
		return new ConversorJSON();
	}

}
