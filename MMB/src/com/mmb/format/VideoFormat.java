package com.mmb.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mmb.extension.FileExtension;
import com.mmb.type.FileType;

/**
 * Video format.
 * 
 * @author Esteban G.M.
 *
 */
public class VideoFormat extends FileFormat {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 2387141083197611719L;

	public static List<String> videoFileExtensions = new ArrayList<String>(
			Arrays.asList(FileExtension.AVI,
						  FileExtension.MKV,
						  FileExtension.MOV,
						  FileExtension.MP4));
	
	public VideoFormat() {
	}
	
	public VideoFormat(String fext) {
		super.fileExtension = fext;
	}

	public FileType getFileType() {
		return FileType.VIDEO;
	}
	
	public String[] getSupportedExtensions() {
		return getVideoFileExtensions();
	}
	
	public static String [] getVideoFileExtensions() {
		return (String []) Arrays.copyOf(videoFileExtensions.toArray(), videoFileExtensions.size(), String[].class);
	}
	
	public static boolean isVideoFormat(String fileExtension) {
		return videoFileExtensions.contains(fileExtension);
	}
	
}
