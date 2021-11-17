package com.bolsa.quartaAvaliacao.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Partido {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String NomePartido;
	private String  Sigla;
	private String ideologia;
	private Date DataFundacao;
	

	
	public Partido(Long id, String nomePartido, String sigla, String ideologia, Date dataFundacao) {
	
		this.id = id;
		this.NomePartido = nomePartido;
		this.Sigla = sigla;
		this.ideologia = ideologia;
		this.DataFundacao = dataFundacao;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomePartido() {
		return NomePartido;
	}
	public void setNomePartido(String nomePartido) {
		NomePartido = nomePartido;
	}
	public String getSigla() {
		return Sigla;
	}
	public void setSigla(String sigla) {
		Sigla = sigla;
	}
	public String getIdeologia() {
		return ideologia;
	}
	public void setIdeologia(String ideologia) {
		this.ideologia = ideologia;
	}
	public Date getDataFundacao() {
		return DataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		DataFundacao = dataFundacao;
	}
	
	
	
}
