package com.mmb.format;

import java.io.Serializable;

import com.mmb.type.FileType;

public abstract class FileFormat implements Serializable {
	
	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 553216259489880934L;
	
	public String fileExtension;
	
	public abstract FileType getFileType();
	
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	
	public String getFileExtension() {
		return fileExtension;
	}
	
	public String toString() {
		return getFileExtension();
	}
	
	public abstract String[] getSupportedExtensions();
	
}
