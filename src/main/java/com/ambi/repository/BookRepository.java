package com.ambi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ambi.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	

}
