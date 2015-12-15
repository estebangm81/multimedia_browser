package com.mmb.file;

import java.io.File;

import com.mmb.format.VideoFormat;
import com.mmb.type.FileType;

public class VideoFile extends GeneralFile {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 354108623740841053L;

	private String title;
	
	private int lengthInSec;

	public VideoFile() {
		super();
		super.setFileFormat(new VideoFormat());
		super.setFileType(FileType.VIDEO);
	}
	
	public VideoFile(String fileExtension, File fileContent) {
		super(fileContent);
		super.setFileFormat(new VideoFormat(fileExtension));
		super.setFileType(FileType.VIDEO);
	}
	
	public VideoFile(String artist, String title, Integer lengthInSec) {
		super();
		super.setFileFormat(new VideoFormat());
		super.setFileType(FileType.VIDEO);
		this.title = title;
		this.lengthInSec = lengthInSec;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLengthInSec() {
		return lengthInSec;
	}

	public void setLengthInSec(int lengthInSec) {
		this.lengthInSec = lengthInSec;
	}

	public VideoFile(String fext) {
		this.setFileFormat(new VideoFormat(fext));
	}
}
