package model;

public class Album implements Obra {
	
	private String titulo;
	private Integer ano;
	private Double avaliacao;	
    private String gravadora;
	private String estudio;
	private String autor;
	private Integer duracao;
		
	public Album(String titulo, Integer ano, Double avaliacao,
				 String gravadora, String estudio,
				 String autor, Integer duracao) {
		this.titulo = titulo;
		this.ano = ano;
		this.avaliacao = avaliacao;
		this.gravadora = gravadora;
		this.estudio = estudio;
		this.autor = autor;
		this.duracao = duracao;
	}

	public String getGravadora() {
		return this.gravadora;
	}

	public String getAutor() {
		return this.autor;
	}

	public Integer getDuracao() {
		return this.duracao;
	}

	public String getEstudio() {
		return this.estudio;
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
