package com.mmb.file;

import com.mmb.format.DocumentFormat;

public class DocumentFile extends GeneralFile {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -3032585379098139275L;

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

	public DocumentFile(String fext) {
		this.setFileFormat(new DocumentFormat(fext));
	}
}
