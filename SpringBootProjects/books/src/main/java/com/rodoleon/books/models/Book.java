package com.rodoleon.books.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Book {
    @Size(min = 3, max = 20)
    private String title;
    
    @Size(min = 5, max = 200)
    private String description;
    
    @Size(min = 3, max = 40)
    private String language;
    
    @Min(100)
    private int numberOfPages;
	
	public Book() {
		
	}
	
	public Book(String title, String desc, String lang, int pages) {
		this.title=title;
		this.description=desc;
		this.language=lang;
		this.numberOfPages=pages;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getLanguage() {
		return this.language;
	}
	
	public int getPages() {
		return this.numberOfPages;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public void setDescription(String desc) {
		this.description=desc;
	}
	
	public void setLanguage(String lang) {
		this.language=lang;
	}
	
	public void setPages(int pages) {
		this.numberOfPages=pages;
	}

}
