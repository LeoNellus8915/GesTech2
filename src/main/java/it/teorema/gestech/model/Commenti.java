package it.teorema.gestech.model;

import java.util.Date;

public class Commenti
{
	private int id;
	private int id_file_risorsa;
	private String note;
	private Date data;
	
	public Commenti() {}

	public Commenti(int id, int id_file_risorsa, String note, Date data) {
		super();
		this.id = id;
		this.id_file_risorsa = id_file_risorsa;
		this.note = note;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_file_risorsa() {
		return id_file_risorsa;
	}

	public void setId_file_risorsa(int id_file_risorsa) {
		this.id_file_risorsa = id_file_risorsa;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
