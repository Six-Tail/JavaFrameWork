package com.rubypaper.dto;

import lombok.Data;

@Data
public class BookDTO {
	private String bookTitle;
	private String bookAuthor;
	private String bookPublisher;
	private double bookPrice;

	public BookDTO() {
		super();
	}
	
	public BookDTO(String bookTitle, String bookAuthor, String bookPublisher, double bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "BookDTO [bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookPublisher=" + bookPublisher
				+ ", bookPrice=" + bookPrice + "]";
	}

}
