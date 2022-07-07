package it.teorema.gestech.model;

import java.util.Date;

public class Auth
{
	private int id;
	private int id_risorsa;
	private String password;
	private Date data;

	public Auth() {}
	
	public Auth(int id, int id_risorsa, String password, Date data) {
		super();
		this.id = id;
		this.id_risorsa = id_risorsa;
		this.password = password;
		this.data = data;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	

}
