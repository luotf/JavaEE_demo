package com.ltf.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport {
  
	private String bookName;
	private String author;
	private String bookNo;
	private String publisher;
	private Date publishDate;
	private Double bookPrice;
	private Integer bookSum;

	public String execute() throws Exception {
		if (!checkBookNo()) {
			addFieldError("bookNo", "请输入正确的书号");
		} else if (!publisher.contains("出版社")) {
			addFieldError("publisher", "请输入正确的出版社名称");
		}
		if (hasErrors()) {
			return INPUT;
		}
		return SUCCESS;
	}

	public boolean checkBookNo() {
		int sum = 0; // 求和
		int M, N;
		String bookNoPre;
		int checkNo; // 尾号
		String sb = ""; // 12位字符串
		String[] str = bookNo.split("-");
		int[] nums = new int[str.length]; // nums：以“-”隔开的整型数组
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null) {
				nums[i] = Integer.parseInt(str[i]);
			}
		}

		// 将字符串数组转换成字符串
		for (int i = 0; i < str.length; i++)
			sb += str[i];

		// 将获取的字符串存到bookNoPre中
		bookNoPre = bookNo.substring(0, bookNo.length() - 1);
		// System.out.println("字符串为："+sb);

		// 将字符串转换成12位的整型数组并求和
		int[] num = new int[sb.length()]; // num表示把字符串变成12位数组
		int lastNum = Integer.parseInt(sb.substring(sb.length() - 1,
				sb.length()));
		System.out.println("最后一个数为:" + lastNum);
		for (int i = 0; i < sb.length() - 1; i++) {
			num[i] = Integer.parseInt(sb.substring(i, i + 1));
			// System.out.println("num["+i+"]="+num[i]);
			if (i % 2 == 0)
				sum += num[i];
			else
				sum += num[i] * 3;
		}
		System.out.println("sum=" + sum);
		M = sum % 10;
		N = 10 - M;
		if (N == 10)
			checkNo = 0;
		else
			checkNo = N;
		System.out.println("尾号=" + bookNoPre + checkNo);
		return lastNum == checkNo;

	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookNo() {
		return bookNo;
	}

	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Integer getBookSum() {
		return bookSum;
	}

	public void setBookSum(Integer bookSum) {
		this.bookSum = bookSum;
	}

}
