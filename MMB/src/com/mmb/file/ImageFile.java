package com.mmb.file;

import com.mmb.format.ImageFormat;

public class ImageFile extends GeneralFile {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -866969852182861467L;

	private String author;
	
	private String title;
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ImageFile(String fext) {
		this.setFileFormat(new ImageFormat(fext));
	}
}
