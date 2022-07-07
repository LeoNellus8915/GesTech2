package it.teorema.gestech.model;

public class Avvisi
{
	private int id;
	private int id_ruolo;
	private int id_risorsa;
	private String note;
	
	public Avvisi() {}

	public Avvisi(int id, int id_ruolo, int id_risorsa, String note) {
		super();
		this.id = id;
		this.id_ruolo = id_ruolo;
		this.id_risorsa = id_risorsa;
		this.note = note;
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

	public int getId_risorsa() {
		return id_risorsa;
	}

	public void setId_risorsa(int id_risorsa) {
		this.id_risorsa = id_risorsa;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
