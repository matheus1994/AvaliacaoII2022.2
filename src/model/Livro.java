package model;

public class Livro implements Obra{
	
	private String titulo;
	private Integer ano;
	private Double avaliacao;	
	private String editora;
	private String idioma;
	private String autor;
	private Integer numeroPaginas;
	
		
	public Livro(String titulo, Integer ano, Double avaliacao,
				 String editora, String idioma,
				 String autor, Integer numeroPaginas) {
		this.avaliacao = avaliacao;
		this.editora = editora;
		this.idioma = idioma;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
		this.idioma = idioma;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	public String getEditora() {
		return this.editora;
	}


	public String getIdioma() {
		return this.idioma;
	}


	public String getAutor() {
		return this.autor;
	}


	public Integer getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return this.titulo;
	}

	@Override
	public Integer getAno() {
		// TODO Auto-generated method stub
		return this.ano;
	}

	@Override
	public Double getAvaliacao() {
		// TODO Auto-generated method stub
		return this.avaliacao;
	}

	

}
