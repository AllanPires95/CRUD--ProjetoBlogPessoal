package org.generation.db_blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Fazer uma tabela = annotetion

@Entity
@Table(name="tb_postagens")
public class Postagem {
	
	
	//primary key  
	@Id
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)//auto_increment
		private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String titulo;
	
	public String texto;
	
	@UpdateTimestamp
	public LocalDateTime data;
	
	@ManyToOne	
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	  @ManyToOne
	    @JsonIgnoreProperties("postagem")
	    private Usuario usuario;

	public String getTitulo() {
		return titulo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
}
