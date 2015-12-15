package com.mmb.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mmb.extension.FileExtension;
import com.mmb.type.FileType;

/**
 * Document format.
 * 
 * @author Esteban G.M.
 *
 */
public class DocumentFormat extends FileFormat {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -6241249773837693455L;

	private static List<String> documentFileExtensions = new ArrayList<String>(
			Arrays.asList(FileExtension.DOC,
						  FileExtension.DOCX,
						  FileExtension.LOG,
						  FileExtension.ODT,
						  FileExtension.PDF,
						  FileExtension.TXT));

	public DocumentFormat() {
	}
	
	public DocumentFormat(String fext) {
		super.fileExtension = fext;
	}

	public FileType getFileType() {
		return FileType.DOCUMENT;
	}

	public String[] getSupportedExtensions() {
		return getDocumentFileExtensions();
	}
	
	public static String [] getDocumentFileExtensions() {
		return (String []) Arrays.copyOf(documentFileExtensions.toArray(), documentFileExtensions.size(), String[].class);
	}
	
	public static boolean isDocumentFormat(String fileExtension) {
		return documentFileExtensions.contains(fileExtension);
	}
}
