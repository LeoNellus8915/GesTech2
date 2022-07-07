package it.teorema.gestech.model;

public class Menu
{
	private int id;
	private int id_ruolo;
	private String categoria;
	private String label;
	private String url;
	
	public Menu() {}

	public Menu(int id, int id_ruolo, String categoria, String label, String url) {
		super();
		this.id = id;
		this.id_ruolo = id_ruolo;
		this.categoria = categoria;
		this.label = label;
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_ruolo() {
		return id_ruolo;
	}

	public void setId_ruolo(int id_ruolo) {
		this.id_ruolo = id_ruolo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
