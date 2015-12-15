package com.mmb.file;

import java.io.File;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;

import com.mmb.format.AudioFormat;
import com.mmb.format.DocumentFormat;
import com.mmb.format.FileFormat;
import com.mmb.format.ImageFormat;
import com.mmb.format.OtherFormat;
import com.mmb.format.VideoFormat;
import com.mmb.type.FileType;

public class GeneralFile implements Serializable {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 9136161369590003831L;

	private static Date startDate, endDate;
	
	private String id;
	private String fileExtension;
	private FileType fileType;
	private FileFormat fileFormat;
	private String fileName;
	private String filePath;
	private Date date;
	private File fileContent;
	
	public GeneralFile() {
		this.id = getRandomId();
		this.fileExtension = null;
		this.fileType = null;
		this.fileFormat = null;
		this.fileName = null;
		this.filePath = null;
		this.date = null;
	}
	
	public GeneralFile(FileType fileType, FileFormat fileFormat, String fileName,
					   String filePath, Date date, File fileContent) {
		this.id = getRandomId();
		this.fileExtension = FilenameUtils.getExtension(fileContent.getName());
		this.fileType = fileType;
		this.fileFormat = fileFormat;
		this.fileName = fileName;
		this.filePath = filePath;
		this.date = date;
		this.fileContent = fileContent;
	}
	
	public GeneralFile(File file) {
		this.id = getRandomId();
		this.fileExtension = FilenameUtils.getExtension(file.getName());
		this.fileType = FileType.getFileType(fileExtension);
		this.fileFormat = getFileFormat(fileExtension);
		this.fileContent = file;
		this.fileName = file.getName();
		this.filePath = file.getAbsolutePath();
		this.fileExtension = FilenameUtils.getExtension(file.getName());
	}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FileType getFileType() {
		return fileType;
	}

	public void setFileType(FileType fileType) {
		this.fileType = fileType;
	}
	
	public static String getExtension(String fileName) {
		System.out.println("getGeneralFiles: START");
		startDate = new Date();
		String extension = "";
		int index = fileName.lastIndexOf('.');
		if (index != -1) {
			extension = fileName.substring(index);
		}
		System.out.println("getGeneralFiles: END");
		endDate = new Date();
		System.out.println("getGeneralFiles: elapsed time(ms) = " + (endDate.getTime() - startDate.getTime()));
		return extension;
	}
	
	public static FileFormat getFileFormat(String fileExtension) {
		FileFormat fileFormat = null;
		if (AudioFormat.isAudioFormat(fileExtension)) {
			fileFormat = new AudioFormat(fileExtension);
		} else if (DocumentFormat.isDocumentFormat(fileExtension)) {
			fileFormat = new DocumentFormat(fileExtension);
		} else if (ImageFormat.isImageFormat(fileExtension)) {
			fileFormat = new ImageFormat(fileExtension);
		} else if (VideoFormat.isVideoFormat(fileExtension)) {
			fileFormat = new VideoFormat(fileExtension);
		} else if (OtherFormat.isOtherFormat(fileExtension)) {
			fileFormat = new OtherFormat(fileExtension);
		}
		return fileFormat;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public String getFileExtension() {
		return fileExtension;
	}
	
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public FileFormat getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(FileFormat fileFormat) {
		this.fileFormat = fileFormat;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public File getFileContent() {
		return fileContent;
	}
	
	public void setFileContent(File fileContent) {
		this.fileContent = fileContent;
	}
	
	private String getRandomId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
	
	public String toString() {
		return "[fileType = " + fileType + ", fileFormat = " + fileFormat + ", fileExtension = "
				+ fileExtension + ", fileName = " + fileName + ", filePath = " + filePath
				+ ", date = " + date + ", fileContent = " + fileContent + "]";
	}
}
