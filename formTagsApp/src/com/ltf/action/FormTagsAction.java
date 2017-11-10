package com.ltf.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ltf.bean.Book;
import com.ltf.bean.BookList;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FormTagsAction extends ActionSupport {
	//private Book book;
	private BookList booklist=new BookList();
	private List<Book> list=new ArrayList<Book>();
	HttpServletRequest request=ServletActionContext.getRequest();
	public String execute() throws Exception{
		list.add(new Book("Java1","罗廷方1"));
		list.add(new Book("Java2","罗廷方2"));
		list.add(new Book("Java3","罗廷方3"));
		list.add(new Book("Java4","罗廷方4"));
		 
		booklist.setBooks(list);
		/*System.out.println(booklist.getBooks().get(0).getName());
		System.out.println(booklist.getBooks().get(0).getAuthor());
		System.out.println(booklist.getBooks().size());*/
		Map<String, String> mappedBook = new HashMap<String, String>();
		for(int i=0;i<booklist.getBooks().size();i++){
		mappedBook.put(booklist.getBooks().get(i).getName(),booklist.getBooks().get(i).getAuthor());
		}
		//System.out.println(mappedBook.keySet());
		/*Map<String, Map<String, String>> request=(Map)ActionContext.getContext().get("request");
		request.put("mappedBook", mappedBook);*/
		
		request.setAttribute("mappedBook", mappedBook);
		return INPUT;		
	}
	
	public String selectCity() throws Exception{
		String dn=request.getParameter("dn");
		String n=request.getParameter("n");
		String book=request.getParameter("book");
		if(dn.equals("")||dn==null){
			dn="null";
		}
		if(n.equals("")||n==null){
			n="null";
		}
		if(book.equals("")||book==null){
			book="null";
		}
		request.setAttribute("book", book);
		request.setAttribute("dn", dn);
		request.setAttribute("n", n);
		/*System.out.println("选择的省份为:"+dn);
		System.out.println("城市为:"+n);
		System.out.println("作者为："+book);*/
		return SUCCESS;		
	}
}
