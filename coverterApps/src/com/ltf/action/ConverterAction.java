package com.ltf.action;

import com.ltf.model.Isbn;
import com.opensymphony.xwork2.ActionSupport;

public class ConverterAction extends ActionSupport {
	private Isbn isbn;
	
	public String execute() throws Exception{
		
		return SUCCESS;
	}
	/**
	 * @return the isbn
	 */
	public Isbn getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}
	
}
