/**
 * 
 */
package com.mmb.type;

import java.io.Serializable;

import com.mmb.format.AudioFormat;
import com.mmb.format.DocumentFormat;
import com.mmb.format.ImageFormat;
import com.mmb.format.OtherFormat;
import com.mmb.format.VideoFormat;

/**
 * File types supported.
 * 
 * @author Esteban G.M.
 *
 */
public enum FileType implements Serializable {
	AUDIO ("audio"),
	DOCUMENT ("document"),
	IMAGE ("image"),
	VIDEO ("video"),
	OTHER ("other");
	
	private String desc;
	
	FileType(String desc) {
		this.desc = desc;
	}
	
	public static FileType getFileType(String fileExtension) {
		FileType fileType = null;
		if (AudioFormat.isAudioFormat(fileExtension)) {
			fileType = AUDIO;
		} else if (DocumentFormat.isDocumentFormat(fileExtension)) {
			fileType = DOCUMENT;
		} else if (ImageFormat.isImageFormat(fileExtension)) {
			fileType = IMAGE;
		} else if (VideoFormat.isVideoFormat(fileExtension)) {
			fileType = VIDEO;
		} else if (OtherFormat.isOtherFormat(fileExtension)) {
			fileType = OTHER;
		}
		return fileType;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String toString() {
		return getDesc();
	}
}
