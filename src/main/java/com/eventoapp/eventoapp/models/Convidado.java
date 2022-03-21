package com.eventoapp.eventoapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Convidado {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo_conv;
	
	private String rg;
	private String nomeConvidado;
	
	@ManyToOne
	private Evento evento;
	
	
	public long getCodigo() {
		return codigo_conv;
	}
	public void setCodigo(long codigo) {
		this.codigo_conv = codigo;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	
	
}
