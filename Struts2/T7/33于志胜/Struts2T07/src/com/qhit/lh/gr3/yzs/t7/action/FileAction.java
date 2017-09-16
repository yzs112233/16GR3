package com.qhit.lh.gr3.yzs.t7.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 于志胜
 *TODO
 *2017年9月15日 下午8:15:40
 */
public class FileAction extends ActionSupport {
	private String username;
	private File uploadFile;
	
	private String uploadFileFileName;//文件名
	private String uploadFileContentType;//文件夹类型
	
	/**
	 * 处理上传文件
	 * @return
	 */
	public String upload() {
        if(uploadFile !=null) {
			/**
			 * 上传业务
			 * 1读取上传文件
			 *    读：输入流--先获取上传文件输入流
			 * 2保存到服务器
			 * 创建保存的文件（）
			 *    写：输出流   
			 * 
			 */
        	try {
				InputStream is = new FileInputStream(uploadFile);
				String savepath = ServletActionContext.getServletContext().getRealPath("/")+"upload";
				File file =new File(savepath);
				if(!file.exists()) {
					file.mkdirs();
					
				}
				FileOutputStream os = new FileOutputStream(savepath+"/"+uploadFileFileName);
				byte[] buffer = new byte[8096];
				int len = 0;
				try {
					while((len=is.read(buffer))!= -1) {
						os.write(buffer,0,len);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					super.addFieldError("uploadFile", "文件未找到");
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				super.addFieldError("uploadFile", "文件保存失败");
				
			}
        	
		}else {
			//文件未找到
			super.addFieldError("uploadFile", "文件未找到");
		}
		return "uplaodSuccess";
	}
	
	

	public String getUsername() {
		
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}
	
	

}
