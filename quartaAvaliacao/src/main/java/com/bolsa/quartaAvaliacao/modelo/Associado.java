package com.bolsa.quartaAvaliacao.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

@Repository
@Entity
public class Associado {
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String NomeAssociado;
	private String  cargo;
	private Date dataNascimento;
	private String sexo;
	
	
	
	public Associado(Long id, String nomeAssociado, String cargo, Date dataNascimento, String sexo) {
		this.id = id;
		NomeAssociado = nomeAssociado;
		this.cargo = cargo;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeAssociado() {
		return NomeAssociado;
	}
	public void setNomeAssociado(String nomeAssociado) {
		NomeAssociado = nomeAssociado;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	

}