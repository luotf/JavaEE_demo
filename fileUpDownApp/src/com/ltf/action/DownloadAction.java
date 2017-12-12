package com.ltf.action;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;







import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	private String zhuanye;
	private String nianji;
	//读取下载文件的目录
    private String inputPath;
    //下载文件的文件名
    private String fileName;
    //读取下载文件的输入流
    private InputStream inputStream;
    //下载文件的类型
    private String conetntType;
    private String Download;
    @Override
    public String execute() throws Exception {
         this.setFileName(zhuanye+"_"+nianji);
         System.out.println("文件名："+fileName);
         Map request=(Map)ActionContext.getContext().get("request");
         request.put("fileName",fileName);
        return SUCCESS;
    }
        //创建InputStream输入流
    public InputStream getInputStream() throws FileNotFoundException {
  
        return ServletActionContext.getServletContext().getResourceAsStream(Download);
    }
	public String getInputPath() {
		return inputPath;
	}
	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}
	
	
	
	public String getDownload() {
		return Download;
	}
	public void setDownload(String download) {
		Download = download;
	}
	public String getFileName() throws UnsupportedEncodingException {
		
		ServletActionContext.getResponse().setHeader("charset","ISO8859-1");
		//fileName = new String(fileName.getBytes("ISO8859-1"), "utf-8");
		return new String(fileName.getBytes(), "ISO8859-1");
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getConetntType() {
		return conetntType;
	}
	public void setConetntType(String conetntType) {
		this.conetntType = conetntType;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	public String getNianji() {
		return nianji;
	}
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	public String getZhuanye() {
		return zhuanye;
	}
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

    
    
}
