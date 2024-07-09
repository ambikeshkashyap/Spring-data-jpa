package com.ambi;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;

import com.ambi.entity.Book;
import com.ambi.repository.BookRepository;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ct	= SpringApplication.run(SpringDataJpa2Application.class, args);
	
	BookRepository repo = ct.getBean(BookRepository.class);
	
//	Book b1 = new Book();
//	b1.setBookName("Fear");
//	b1.setBookPrice(3660.00);
//	b1.setBookIssued(LocalDate.of(2020, 8, 29));
//	
//	Book b2 = new Book();
//	b2.setBookName("Wind");
//	b2.setBookPrice(1500.00);
//	b2.setBookIssued(LocalDate.of(2015, 12, 1));
//	
//	Book b3 = new Book();
//	b3.setBookName("Green");
//	b3.setBookPrice(879.25);
//	b3.setBookIssued(LocalDate.of(2023, 4, 14));
//	
//	repo.saveAll(Arrays.asList(b1,b2,b3));
	
	Sort s = Sort.by("bookPrice");
	
	List<Book> l = repo.findAll(s);
	
	l.forEach(x -> System.out.println(x));
	
	PageRequest p = PageRequest.of(1, 2, s);
	
      Page<Book>   pg= 	repo.findAll(p);
      List<Book> l1 = pg.getContent();
      l1.forEach(x -> System.out.println(x));
	
	}

}
