package com.ambi.entity;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOOK_INFO")
public class Book {

	@Id
	@GeneratedValue
	private Integer bookId;
	
	private String bookName;
	
	private Double bookPrice;
	
	private LocalDate BookIssued;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public LocalDate getBookIssued() {
		return BookIssued;
	}

	public void setBookIssued(LocalDate localDate) {
		BookIssued = localDate;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", BookIssued="
				+ BookIssued + "]";
	}
	
	
}
