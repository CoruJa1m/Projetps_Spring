package com.transportadora.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nome;
	
	@Column
	private String cidade;
	
	@Column
	private Integer quantidade;
	
	@Column
	private Integer valor;
	
	public Cliente() {
		this(0,"","",0,0);
	}

	public Cliente(Integer id, String nome, String cidade, Integer quantidade, Integer valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.cidade = cidade;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade1(String cidade) {
		this.cidade = cidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result= 1;
		result = prime * result + ((id == null)? 0 :id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id==null) {
			if (other.id != null) {
				return false;
			}else if (!id.equals(other.id)) 
				return false;
					return true;
		}
		return Objects.equals(id, other.id);
	}
	
}