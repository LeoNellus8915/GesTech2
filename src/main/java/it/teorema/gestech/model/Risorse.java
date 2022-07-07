package it.teorema.gestech.model;

import java.util.Date;

public class Risorse
{
	private int id;
	private String nome_cognome;
	private String recapito;
	private String email;
	private String profilo_linkedin;
	private String citta;
	private String ruolo;
	private String competenza_principale;
	private Date data_colloquio;
	private int anno_colloquio;
	private String fonte_reperimento;
	private double costo_giornaliero;
	private String possibilita_lavorativa;
	private String tech_campo_libero;
	private String competenza_totali;
	private String certificazioni;
	
	public Risorse() {}
	
	public Risorse(int id, String nome_cognome, String recapito, String email, String profilo_linkedin, String citta,
			String ruolo, String competenza_principale, Date data_colloquio, int anno_colloquio,
			String fonte_reperimento, double costo_giornaliero, String possibilita_lavorativa, String tech_campo_libero,
			String competenza_totali, String certificazioni) {
		super();
		this.id = id;
		this.nome_cognome = nome_cognome;
		this.recapito = recapito;
		this.email = email;
		this.profilo_linkedin = profilo_linkedin;
		this.citta = citta;
		this.ruolo = ruolo;
		this.competenza_principale = competenza_principale;
		this.data_colloquio = data_colloquio;
		this.anno_colloquio = anno_colloquio;
		this.fonte_reperimento = fonte_reperimento;
		this.costo_giornaliero = costo_giornaliero;
		this.possibilita_lavorativa = possibilita_lavorativa;
		this.tech_campo_libero = tech_campo_libero;
		this.competenza_totali = competenza_totali;
		this.certificazioni = certificazioni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome_cognome() {
		return nome_cognome;
	}

	public void setNome_cognome(String nome_cognome) {
		this.nome_cognome = nome_cognome;
	}

	public String getRecapito() {
		return recapito;
	}

	public void setRecapito(String recapito) {
		this.recapito = recapito;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfilo_linkedin() {
		return profilo_linkedin;
	}

	public void setProfilo_linkedin(String profilo_linkedin) {
		this.profilo_linkedin = profilo_linkedin;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getCompetenza_principale() {
		return competenza_principale;
	}

	public void setCompetenza_principale(String competenza_principale) {
		this.competenza_principale = competenza_principale;
	}

	public Date getData_colloquio() {
		return data_colloquio;
	}

	public void setData_colloquio(Date data_colloquio) {
		this.data_colloquio = data_colloquio;
	}

	public int getAnno_colloquio() {
		return anno_colloquio;
	}

	public void setAnno_colloquio(int anno_colloquio) {
		this.anno_colloquio = anno_colloquio;
	}

	public String getFonte_reperimento() {
		return fonte_reperimento;
	}

	public void setFonte_reperimento(String fonte_reperimento) {
		this.fonte_reperimento = fonte_reperimento;
	}

	public double getCosto_giornaliero() {
		return costo_giornaliero;
	}

	public void setCosto_giornaliero(double costo_giornaliero) {
		this.costo_giornaliero = costo_giornaliero;
	}

	public String getPossibilita_lavorativa() {
		return possibilita_lavorativa;
	}

	public void setPossibilita_lavorativa(String possibilita_lavorativa) {
		this.possibilita_lavorativa = possibilita_lavorativa;
	}

	public String getTech_campo_libero() {
		return tech_campo_libero;
	}

	public void setTech_campo_libero(String tech_campo_libero) {
		this.tech_campo_libero = tech_campo_libero;
	}

	public String getCompetenza_totali() {
		return competenza_totali;
	}

	public void setCompetenza_totali(String competenza_totali) {
		this.competenza_totali = competenza_totali;
	}

	public String getCertificazioni() {
		return certificazioni;
	}

	public void setCertificazioni(String certificazioni) {
		this.certificazioni = certificazioni;
	}
}