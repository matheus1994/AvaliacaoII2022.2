//o pacote q1 significa, a resposta da primeira questão.
//Na primeira questão, nós utilizamos o padrão adpater, como forma de evitar a explosão de classes.
//Nós temos o método gerandoConversao que recebe como parametro uma obra e um tipo de formato e retorna o formato em string.

package q1;

import model.Album;
import model.Livro;
import model.Obra;

public class AdapteeFormato {
  
   public String gerandoConversao(Obra obra, TipoFormato tipo) {
	   if(obra instanceof Livro && tipo == TipoFormato.JSON) {
			Livro livro = (Livro) obra;
			return "titulo: " + obra.getTitulo() + "," + "\n"
				  +"ano: " + obra.getAno() + "," + "\n"
			      +"avalicao: " + obra.getAvaliacao() + "," + "\n"
				  +"editora: " + livro.getEditora() + "," + "\n"
			      +"idioma: " + livro.getIdioma() + "," + "\n"
				  +"autor: " + livro.getAutor() + "," + "\n"
			      +"numero de paginas: " + livro.getNumeroPaginas();
		}
	   else if(obra instanceof Livro && tipo == TipoFormato.XML) {
			Livro livro = (Livro) obra;
			return "<Livro titulo = " + obra.getTitulo() + "ano = " + obra.getAno() + ">" +"\n"
		          +"<avaliacao>"+ obra.getAvaliacao()+"<avaliacao>" + "\n"
				  +"<editora>"+ livro.getEditora()+"<editora>" + "\n"
			      +"<idioma>"+ livro.getIdioma()+"<idioma>" + "\n"
			      +"<autor>"+ livro.getAutor() +"<autor>"+ "\n"
			      +"<num_paginas>"+ livro.getNumeroPaginas()+"<num_paginas>" + "\n"
			      +"</Livro>";
		}
	   else if(obra instanceof Album && tipo == TipoFormato.JSON) {
			Album album = (Album) obra;
			return "titulo: " + obra.getTitulo() + "," +"\n"
				  +"avaliacao: "+ obra.getAvaliacao() + "," + "\n"
			      +"estudio: "+ album.getEstudio() + "," + "\n"
				  +"gravadora: " + album.getGravadora() + "," + "\n" 
			      +"autor: " + album.getAutor() + "," + "\n"
				  +"duracao: " + album.getDuracao();
		}
	   
	   else if(obra instanceof Album && tipo == TipoFormato.XML) {
			Album album = (Album) obra;
		    return "<Album titulo = " + obra.getTitulo()+">" + "\n"
		    +"<avaliacao>"+ obra.getAvaliacao()+"<avaliacao>" + "\n"
		    +"<estudio>"+ album.getEstudio()+"<estudio>" + "\n"
		    +"<gravadora>"+album.getGravadora()+"<gravadora>" + "\n"
		    +"<autor>"+album.getAutor()+"<autor>"+"\n"
		    +"<duracao>"+album.getDuracao()+"<duracao>"+ "\n"
		    +"</Album>";
		
		}
	   else {
		   return "";
	 }
   }
}
