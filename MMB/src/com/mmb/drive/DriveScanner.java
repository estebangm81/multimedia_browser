package com.mmb.drive;

import java.io.File;
import java.util.Collection;
import java.util.Date;

import javax.swing.filechooser.FileSystemView;

import org.apache.commons.io.FileUtils;

import com.mmb.format.AudioFormat;
import com.mmb.format.DocumentFormat;
import com.mmb.format.ImageFormat;
import com.mmb.format.OtherFormat;
import com.mmb.format.VideoFormat;

public class DriveScanner {
	
	private static Date startDate, endDate;
	
	public static File[] getDrives() {
		System.out.println("getDrives: STARTING...");
		return File.listRoots();
	}
	
	public static String getDriveDesc(File f) {
		System.out.println("getDriveDesc: START");
		startDate = new Date();
		String desc = null;
		if (f != null) {
			FileSystemView fsv = FileSystemView.getFileSystemView();
			desc = fsv.getSystemTypeDescription(f);
		}
		System.out.println("getDriveDesc: END");
		endDate = new Date();
		System.out.println("getDriveDesc: Time elapsed(ms) = " + (endDate.getTime() - startDate.getTime()));
		return desc;
	}
	
	public static Collection<File> listFiles(File path, String [] extensions) {
		System.out.println("listFiles: START");
		startDate = new Date();
		Collection<File> files = null;
		try {
			files = FileUtils.listFiles(path, extensions, true);
		} catch (IllegalArgumentException iae) {
			System.out.println("Directory not available");
		}
		System.out.println("listFiles: END");
		endDate = new Date();
		System.out.println("listFiles: Time elapsed(ms) = " + (endDate.getTime() - startDate.getTime()));
		return files;
	}
	
	public static Collection<File> getAudioFiles(File path) {
		System.out.println("getAudioFiles: START");
		startDate = new Date();
		
		Collection<File> files = null;
		try {
			files = FileUtils.listFiles(path, AudioFormat.getAudioFileExtensions(), true);
		} catch (IllegalArgumentException iae) {
			System.out.println("Directory not available");
		}
		
		System.out.println("getAudioFiles: END");
		endDate = new Date();
		System.out.println("getAudioFiles: Time elapsed(ms) = " + (endDate.getTime() - startDate.getTime()));
		return files;
	}

	public static Collection<File> getDocumentFiles(File path) {
		System.out.println("getDocumentFiles: START");
		startDate = new Date();
		
		Collection<File> files = null;
		try {
			files = FileUtils.listFiles(path, DocumentFormat.getDocumentFileExtensions(), true);
		} catch (IllegalArgumentException iae) {
			System.out.println("Directory not available");
		}
		
		System.out.println("getDocumentFiles: END");
		endDate = new Date();
		System.out.println("getDocumentFiles: Time elapsed(ms) = " + (endDate.getTime() - startDate.getTime()));
		return files;
	}
	
	public static Collection<File> getImageFiles(File path) {
		System.out.println("getImageFiles: START");
		startDate = new Date();
		
		Collection<File> files = null;
		try {
			files = FileUtils.listFiles(path, ImageFormat.getImageFileExtensions(), true);
		} catch (IllegalArgumentException iae) {
			System.out.println("Directory not available");
		}
		
		System.out.println("getImageFiles: END");
		endDate = new Date();
		System.out.println("getImageFiles: Time elapsed(ms) = " + (endDate.getTime() - startDate.getTime()));
		return files;
	}
	
	public static Collection<File> getVideoFiles(File path) {
		System.out.println("getVideoFiles: START");
		startDate = new Date();
		
		Collection<File> files = null;
		try {
			files = FileUtils.listFiles(path, VideoFormat.getVideoFileExtensions(), true);
		} catch (IllegalArgumentException iae) {
			System.out.println("Directory not available");
		}
		
		System.out.println("getVideoFiles: END");
		endDate = new Date();
		System.out.println("getVideoFiles: Time elapsed(ms) = " + (endDate.getTime() - startDate.getTime()));
		return files;
	}
	
	public static Collection<File> getOtherFiles(File path) {
		System.out.println("getOtherFiles: START");
		startDate = new Date();
		
		Collection<File> files = null;
		try {
			files = FileUtils.listFiles(path, OtherFormat.getOtherFileExtensions(), true);
		} catch (IllegalArgumentException iae) {
			System.out.println("Directory not available");
		}
		
		System.out.println("getOtherFiles: END");
		endDate = new Date();
		System.out.println("getOtherFiles: Time elapsed(ms) = " + (endDate.getTime() - startDate.getTime()));
		return files;
	}
	
	

}
