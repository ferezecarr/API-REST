package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Blog;

public interface BlogRepository extends JpaRepository<Blog , Long>{

	Blog findOne(Long id);
}
