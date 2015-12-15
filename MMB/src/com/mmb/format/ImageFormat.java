package com.mmb.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mmb.extension.FileExtension;
import com.mmb.type.FileType;

/**
 * Image format.
 * 
 * @author Esteban G.M.
 *
 */
public class ImageFormat extends FileFormat {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 983534576770469750L;

	private static List<String> imageFileExtensions = new ArrayList<String>(
			Arrays.asList(FileExtension.BMP,
						  FileExtension.GIF,
						  FileExtension.JPEG,
						  FileExtension.JPG,
						  FileExtension.PNG));

	public ImageFormat() {
	}

	public ImageFormat(String fext) {
		super.fileExtension = fext;
	}

	public FileType getFileType() {
		return FileType.IMAGE;
	}
	
	public String[] getSupportedExtensions() {
		return getImageFileExtensions();
	}
	
	public static String [] getImageFileExtensions() {
		return (String []) Arrays.copyOf(imageFileExtensions.toArray(), imageFileExtensions.size(), String[].class);
	}
	
	public static boolean isImageFormat(String fileExtension) {
		return imageFileExtensions.contains(fileExtension);
	}
}
