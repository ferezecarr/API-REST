package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Blog {

	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String contenido;
	
	public Blog() {
		
	}
	
	public Blog(String titulo , String contenido) {
		this.titulo = titulo;
		this.contenido = contenido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	
}
