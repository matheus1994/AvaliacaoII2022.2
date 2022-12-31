//O pacote model possui as classes que já fazem parte do trabalho, e servem como base para as duas questões.
//Essa é a classe abstrata Obra.

package model;

public abstract class Obra {
	
	private String titulo;
	private Integer ano; 
	private Double avaliacao;
	
	public Obra(String titulo, Integer ano, Double avaliacao) {
		this.titulo = titulo;
		this.ano = ano;
		this.avaliacao = avaliacao;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public Integer getAno() {
		return this.ano;
	}
	public Double getAvaliacao() {
		return this.avaliacao;
	}
}
