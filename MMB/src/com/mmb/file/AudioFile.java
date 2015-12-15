package com.mmb.file;

import java.io.File;
import java.util.Date;

import com.mmb.format.AudioFormat;
import com.mmb.format.FileFormat;
import com.mmb.type.FileType;

public class AudioFile extends GeneralFile {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -8532659099885970639L;

	private String artist;
	
	private String title;
	
	private Integer lengthInSec;

	// TODO create enum for styles
	private String style;

	private String album;

	public AudioFile() {
		super();
		super.setFileFormat(new AudioFormat());
		super.setFileType(FileType.AUDIO);
	}
	
	public AudioFile(String fileExtension, File fileContent) {
		super(fileContent);
		super.setFileFormat(new AudioFormat(fileExtension));
		super.setFileType(FileType.AUDIO);
	}
	
	public AudioFile(String artist, String title, Integer lengthInSec) {
		super();
		super.setFileFormat(new AudioFormat());
		super.setFileType(FileType.AUDIO);
		this.artist = artist;
		this.title = title;
		this.lengthInSec = lengthInSec;
	}
	
	public AudioFile(FileType fileType, FileFormat fileFormat, String fileName,
			   		 String filePath, Date date, File content, String artist,
			   		 String title, Integer lengthInSec) {
		super(fileType, fileFormat, fileName, filePath, date, content);
		this.artist = artist;
		this.title = title;
		this.lengthInSec = lengthInSec;
	}
	
	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getLengthInSec() {
		return lengthInSec;
	}


	public void setLengthInSec(Integer lengthInSec) {
		this.lengthInSec = lengthInSec;
	}


	public String getStyle() {
		return style;
	}


	public void setStyle(String style) {
		this.style = style;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}

	public AudioFile(String fext) {
		this.setFileFormat(new AudioFormat(fext));
	}
}
