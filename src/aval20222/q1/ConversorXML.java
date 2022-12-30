package aval20222.q1;

import model.Album;
import model.Livro;
import model.Obra;
//o pacote aval20222.q1 significa que é a resposta da primeira questão.

public class ConversorXML implements Conversor{

	public String converte(Obra obra) {
		if(obra instanceof Livro) {
			Livro livro = (Livro) obra;
			return "<Livro titulo = " + obra.getTitulo() + "ano = " + obra.getAno() + ">" +"\n"
		          +"<avaliacao>"+ obra.getAvaliacao()+"<avaliacao>" + "\n"
				  +"<editora>"+ livro.getEditora()+"<editora>" + "\n"
			      +"<idioma>"+ livro.getIdioma()+"<idioma>" + "\n"
			      +"<autor>"+ livro.getAutor() +"<autor>"+ "\n"
			      +"<num_paginas>"+ livro.getNumeroPaginas()+"<num_paginas>" + "\n"
			      +"</Livro>";
		}
		
		else if(obra instanceof Album) {
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
			return null;
		}
		
	}
	

	public Conversor clone() {
		return new ConversorXML();
	}

}
