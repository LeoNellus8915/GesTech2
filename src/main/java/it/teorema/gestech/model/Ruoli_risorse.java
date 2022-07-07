package it.teorema.gestech.model;

public class Ruoli_risorse
{
	private int id;
	private int id_risorsa;
	private int id_ruolo;
	
	public Ruoli_risorse() {}

	public Ruoli_risorse(int id, int id_risorsa, int id_ruolo) {
		super();
		this.id = id;
		this.id_risorsa = id_risorsa;
		this.id_ruolo = id_ruolo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_risorsa() {
		return id_risorsa;
	}

	public void setId_risorsa(int id_risorsa) {
		this.id_risorsa = id_risorsa;
	}

	public int getId_ruolo() {
		return id_ruolo;
	}

	public void setId_ruolo(int id_ruolo) {
		this.id_ruolo = id_ruolo;
	}
}
