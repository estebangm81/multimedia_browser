package com.mmb.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mmb.extension.FileExtension;
import com.mmb.type.FileType;

/**
 * Software format.
 * 
 * @author Esteban G.M.
 *
 */
public class OtherFormat extends FileFormat {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 4514341054069343608L;

	private static List<String> otherFileExtensions = new ArrayList<String>(
			Arrays.asList(FileExtension.EXE,
						  FileExtension.RAR,
						  FileExtension.SEVENZIP,
						  FileExtension.ZIP));

	public OtherFormat() {
	}
	
	public OtherFormat(String fext) {
		super.fileExtension = fext;
	}
	
	public FileType getFileType() {
		return FileType.OTHER;
	}
	
	public String[] getSupportedExtensions() {
		return getOtherFileExtensions();
	}
	
	public static String [] getOtherFileExtensions() {
		return (String []) Arrays.copyOf(otherFileExtensions.toArray(), otherFileExtensions.size(), String[].class);
	}
	
	public static boolean isOtherFormat(String fileExtension) {
		return otherFileExtensions.contains(fileExtension);
	}
}
