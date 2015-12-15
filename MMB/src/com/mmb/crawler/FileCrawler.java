package com.mmb.crawler;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.mmb.drive.DriveScanner;
import com.mmb.extension.FileExtension;
import com.mmb.file.GeneralFile;

public class FileCrawler {

	List<GeneralFile> filesList;
	private static Date INITIAL_DATE, FINAL_DATE, startDate, endDate;

	public FileCrawler() {
		filesList = new ArrayList<GeneralFile>();
	}
	
	public List<GeneralFile> getFilesList() {
		return filesList;
	}
	
	public void setFilesList(List<GeneralFile> filesList) {
		this.filesList = filesList;
	}
	
	public void runFullCrawler() {
		System.out.println("runFullCrawler: START");
		startDate = new Date();
		for (File path : DriveScanner.getDrives()) {
		    // prints file and directory paths
		    System.out.println("Drive Name: " + path + " - " + DriveScanner.getDriveDesc(path));
		    System.out.println("Extensions: " + FileExtension.getExtensionsAsString());
		    Collection<File> files = DriveScanner.listFiles(path, FileExtension.getExtensions());
		    feedCompilation(files);
		}
		System.out.println("runFullCrawler: END");
		endDate = new Date();
		System.out.println("runFullCrawler: elapsed time(ms) = " + (endDate.getTime() - startDate.getTime()));
	}

	public void runAudioCrawler(File path) {
		System.out.println("runAudioCrawler: START");
		startDate = new Date();
	    // prints file and directory paths
	    System.out.println("Drive Name: " + path + " - " + DriveScanner.getDriveDesc(path));
	    Collection<File> files = DriveScanner.getAudioFiles(path);
	    feedCompilation(files);
		System.out.println("runAudioCrawler: END");
		endDate = new Date();
		System.out.println("runAudioCrawler: elapsed time(ms) = " + (endDate.getTime() - startDate.getTime()));
	}
	
	public void runDocumentCrawler(File path) {
		System.out.println("runDocumentCrawler: START");
		startDate = new Date();
	    // prints file and directory paths
	    System.out.println("Drive Name: " + path + " - " + DriveScanner.getDriveDesc(path));
	    Collection<File> files = DriveScanner.getDocumentFiles(path);
	    feedCompilation(files);
		System.out.println("runDocumentCrawler: END");
		endDate = new Date();
		System.out.println("runDocumentCrawler: elapsed time(ms) = " + (endDate.getTime() - startDate.getTime()));
	}
	
	public void runImageCrawler(File path) {
		System.out.println("runImageCrawler: START");
		startDate = new Date();
	    // prints file and directory paths
	    System.out.println("Drive Name: " + path + " - " + DriveScanner.getDriveDesc(path));
	    Collection<File> files = DriveScanner.getImageFiles(path);
	    feedCompilation(files);
		System.out.println("runImageCrawler: END");
		endDate = new Date();
		System.out.println("runImageCrawler: elapsed time(ms) = " + (endDate.getTime() - startDate.getTime()));
	}
	
	public void runVideoCrawler(File path) {
		System.out.println("runVideoCrawler: START");
		startDate = new Date();
	    // prints file and directory paths
	    System.out.println("Drive Name: " + path + " - " + DriveScanner.getDriveDesc(path));
	    Collection<File> files = DriveScanner.getVideoFiles(path);
	    feedCompilation(files);
		System.out.println("runVideoCrawler: END");
		endDate = new Date();
		System.out.println("runVideoCrawler: elapsed time(ms) = " + (endDate.getTime() - startDate.getTime()));
	}
	
	public void runOtherCrawler(File path) {
		System.out.println("runOtherCrawler: START");
		startDate = new Date();
	    // prints file and directory paths
	    System.out.println("Drive Name: " + path + " - " + DriveScanner.getDriveDesc(path));
	    Collection<File> files = DriveScanner.getOtherFiles(path);
	    feedCompilation(files);
		System.out.println("runOtherCrawler: END");
		endDate = new Date();
		System.out.println("runOtherCrawler: elapsed time(ms) = " + (endDate.getTime() - startDate.getTime()));
	}
	
	private void feedCompilation(Collection<File> files) {
		System.out.println("feedCompilation: START");
		if (files != null) {
			System.out.println("feedCompilation: #files = " + files.size());
			for (File f : files) {
				getFilesList().add(new GeneralFile(f));
			}
		}
		System.out.println("feedCompilation: END");
	}
	
	/*
	 * a) Search all files from concrete path: listFiles(path)
	 * b) Search xxx files in a directory (not recursive): getXXXFiles
	 * c) Search ??
	 * 
	 */
	public static void main (String [] args) {
		INITIAL_DATE = new Date();
		
		FileCrawler fc = new FileCrawler();
		//fc.runFullCrawler();
		File tmpFile = new File("C:/Users/ESTEBAN/Downloads");
//		fc.runAudioCrawler(tmpFile);
//		fc.runDocumentCrawler(tmpFile);
//		fc.runImageCrawler(tmpFile);
		fc.runVideoCrawler(tmpFile);
//		fc.runOtherCrawler(tmpFile);
		
			
		FINAL_DATE = new Date();
		System.out.println("TOTAL ELAPSED TIME(ms) = " + (FINAL_DATE.getTime() - INITIAL_DATE.getTime()));
	}
}
