package it.teorema.gestech.model;

import java.util.Date;

public class Dettagli_risorsa
{
	private int id;
	private int id_risorsa;
	private String file_base64;
	private Date data;
	private int id_esito_colloquio;
	private int id_skill;
	private int id_tech1;
	private int id_tech2;
	private int id_tech3;
	private int id_tech4;
	private int id_lingua1;
	private int id_lingua2;
	private int id_lingua3;
	private int id_seniority;
	
	public Dettagli_risorsa() {}

	public Dettagli_risorsa(int id, int id_risorsa, String file_base64, Date data, int id_esito_colloquio, int id_skill,
			int id_tech1, int id_tech2, int id_tech3, int id_tech4, int id_lingua1, int id_lingua2, int id_lingua3,
			int id_seniority) {
		super();
		this.id = id;
		this.id_risorsa = id_risorsa;
		this.file_base64 = file_base64;
		this.data = data;
		this.id_esito_colloquio = id_esito_colloquio;
		this.id_skill = id_skill;
		this.id_tech1 = id_tech1;
		this.id_tech2 = id_tech2;
		this.id_tech3 = id_tech3;
		this.id_tech4 = id_tech4;
		this.id_lingua1 = id_lingua1;
		this.id_lingua2 = id_lingua2;
		this.id_lingua3 = id_lingua3;
		this.id_seniority = id_seniority;
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

	public String getFile_base64() {
		return file_base64;
	}

	public void setFile_base64(String file_base64) {
		this.file_base64 = file_base64;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getId_esito_colloquio() {
		return id_esito_colloquio;
	}

	public void setId_esito_colloquio(int id_esito_colloquio) {
		this.id_esito_colloquio = id_esito_colloquio;
	}

	public int getId_skill() {
		return id_skill;
	}

	public void setId_skill(int id_skill) {
		this.id_skill = id_skill;
	}

	public int getId_tech1() {
		return id_tech1;
	}

	public void setId_tech1(int id_tech1) {
		this.id_tech1 = id_tech1;
	}

	public int getId_tech2() {
		return id_tech2;
	}

	public void setId_tech2(int id_tech2) {
		this.id_tech2 = id_tech2;
	}

	public int getId_tech3() {
		return id_tech3;
	}

	public void setId_tech3(int id_tech3) {
		this.id_tech3 = id_tech3;
	}

	public int getId_tech4() {
		return id_tech4;
	}

	public void setId_tech4(int id_tech4) {
		this.id_tech4 = id_tech4;
	}

	public int getId_lingua1() {
		return id_lingua1;
	}

	public void setId_lingua1(int id_lingua1) {
		this.id_lingua1 = id_lingua1;
	}

	public int getId_lingua2() {
		return id_lingua2;
	}

	public void setId_lingua2(int id_lingua2) {
		this.id_lingua2 = id_lingua2;
	}

	public int getId_lingua3() {
		return id_lingua3;
	}

	public void setId_lingua3(int id_lingua3) {
		this.id_lingua3 = id_lingua3;
	}

	public int getId_seniority() {
		return id_seniority;
	}

	public void setId_seniority(int id_seniority) {
		this.id_seniority = id_seniority;
	}
}