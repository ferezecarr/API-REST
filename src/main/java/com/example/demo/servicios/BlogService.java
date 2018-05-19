package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Blog;
import com.example.demo.repository.BlogRepository;

//Se especifica que es un servicio
@Service
public class BlogService {

	@Autowired//Identifico que la variable se esta Inyectando
	private BlogRepository blogRepository;
	
	public List<Blog> consulta(){
		return blogRepository.findAll();
	}
	
	public Blog consultaPorId(Long id) {
		return blogRepository.findOne(id);
	}
	
	public Blog registro(Blog blog) {
		return blogRepository.save(blog);
	}
	
	public void eliminar(Blog blog) {
		blogRepository.delete(blog);
	}
	
}
