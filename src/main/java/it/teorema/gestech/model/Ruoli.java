package it.teorema.gestech.model;

public class Ruoli
{
	private int id;
	private String nome;
	
	public Ruoli() {}

	public Ruoli(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
