package com.ltf.action;

import java.util.List;

import com.ltf.model.Isbn;
import com.opensymphony.xwork2.ActionSupport;

public class Converter2Action extends ActionSupport {
private List<Isbn> isbn;
	
	public String execute() throws Exception{
		
		return SUCCESS;
	}

	/**
	 * @return the isbn
	 */
	public List<Isbn> getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(List<Isbn> isbn) {
		this.isbn = isbn;
	}
	
	
}
