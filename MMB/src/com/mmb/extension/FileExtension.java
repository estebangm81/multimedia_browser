package com.mmb.extension;

public class FileExtension {
	
	public static final String AMR = "amr";
	public static final String AVI = "avi";
	public static final String BMP = "bmp";
	public static final String DOC = "doc";
	public static final String DOCX = "docx";
	public static final String EXE = "exe";
	public static final String GIF = "gif";
	public static final String JPG = "jpg";
	public static final String JPEG = "jpeg";
	public static final String LOG  = "log";
	public static final String MKV = "mkv";
	public static final String MOV = "mov";
	public static final String MP3 = "mp3";
	public static final String MP4 = "mp4";
	public static final String ODT = "odt";
	public static final String OGG = "ogg";
	public static final String PDF = "pdf";
	public static final String PNG = "png";
	public static final String PPT = "ppt";
	public static final String PPTX = "pptx";
	public static final String RAR = "rar";
	public static final String SEVENZIP = "7z";
	public static final String TXT = "txt";
	public static final String WAV = "wav";
	public static final String WMA = "wma";
	public static final String XLS = "xls";
	public static final String XLSX = "xlsx";
	public static final String ZIP = "zip";
	
	public static String [] getExtensions() {
		return new String [] {AMR, AVI, BMP, DOC, DOCX, EXE, GIF, JPG, JPEG, LOG, MKV, MOV, MP3, MP4, ODT, OGG, PDF,
							  PNG, PPT, PPTX, RAR, SEVENZIP, TXT, WAV, WMA, XLS, XLSX, ZIP};
	}
	
	public static String getExtensionsAsString() {
		String extensions = "";
		for (String ext : getExtensions()) {
			extensions += ext + "  ";
		}
		return extensions;
	}
	
}
