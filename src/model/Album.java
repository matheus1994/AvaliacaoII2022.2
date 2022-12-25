package model;

public class Album extends Obra {
		
    private String gravadora;
	private String estudio;
	private String autor;
	private Integer duracao;
		
	public Album(String titulo, Integer ano, Double avaliacao,
				 String gravadora, String estudio,
				 String autor, Integer duracao) {
		super(titulo, ano, avaliacao);
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

	
}
