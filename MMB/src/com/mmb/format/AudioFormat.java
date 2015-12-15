package com.mmb.format;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mmb.extension.FileExtension;
import com.mmb.type.FileType;

/**
 * Audio format.
 * 
 * @author Esteban G.M.
 *
 */
public class AudioFormat extends FileFormat {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = -4746151623167870615L;

	public static List<String> audioFileExtensions = new ArrayList<String>(
			Arrays.asList(FileExtension.AMR,
						  FileExtension.MP3,
						  FileExtension.OGG,
						  FileExtension.WAV,
						  FileExtension.WMA));
	
	public AudioFormat() {
	}
	
	public AudioFormat(String fileExtension) {
		super.fileExtension = fileExtension;
	}
	
	public FileType getFileType() {
		return FileType.AUDIO;
	}
	
	public String[] getSupportedExtensions() {
		return getAudioFileExtensions();
	}
	
	public static String [] getAudioFileExtensions() {
		return (String []) Arrays.copyOf(audioFileExtensions.toArray(), audioFileExtensions.size(), String[].class);
	}
	
	public static boolean isAudioFormat(String fileExtension) {
		return audioFileExtensions.contains(fileExtension);
	}
	
	public static void main (String [] args) {
		Object [] exts = audioFileExtensions.toArray();
		for (int i = 0; i < exts.length; i ++) {
			System.out.println(exts[i].toString());
		}
		
		String [] strExts = Arrays.copyOf(audioFileExtensions.toArray(), audioFileExtensions.size(), String[].class);
		for (int i = 0; i < strExts.length; i ++) {
			System.out.println(strExts[i].toString());
		}
	}
}
