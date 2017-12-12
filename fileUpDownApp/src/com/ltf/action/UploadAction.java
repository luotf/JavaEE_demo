package com.ltf.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {
	private String username;
	private String nianji;
	private String zhuanye;
	// 封装上传文件属性
    private File[] upload;

    // 封装上传文件的类型
    private String[] uploadContentType;

    // 封装上传文件名称
    private String[] uploadFileName;

    // 封装文件上传的路径
    private String savePath;
    
    public String execute() throws Exception {
		
    	byte[] buffer = new byte[1024];
    	String path=getSavePath()+"\\"+username;
    	File folder = new File(path);
    	folder.mkdirs();
        for (int i = 0; i < upload.length; i++) {
            FileInputStream fis = new FileInputStream(getUpload()[i]);
            FileOutputStream fos = new FileOutputStream(path+"\\"
                    + this.getUploadFileName()[i]);
            int length = fis.read(buffer);
            while (length > 0) {
                fos.write(buffer, 0, length);
                length = fis.read(buffer);
            }
            fos.flush();
            fos.close();
            fis.close();
        }
        Map request=(Map)ActionContext.getContext().get("request");
        String pa=ServletActionContext.getServletContext().getContextPath()+"/upload/"+username+"/"+uploadFileName[0];
        request.put("path", pa);
		return SUCCESS;
	}
   
    
    
	public File[] getUpload() {
		return upload;
	}



	public void setUpload(File[] upload) {
		this.upload = upload;
	}



	public String[] getUploadContentType() {
		return uploadContentType;
	}



	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}



	public String[] getUploadFileName() {
		return uploadFileName;
	}



	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}



	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}



	public String getSavePath() {
        return ServletActionContext.getServletContext().getRealPath(savePath);
      }
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
