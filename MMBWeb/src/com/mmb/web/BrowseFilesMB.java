package com.mmb.web;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.mmb.crawler.FileCrawler;
import com.mmb.file.GeneralFile;

@ManagedBean(name = "browseFiles")
@ApplicationScoped
public class BrowseFilesMB implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1191297905459937776L;

	private String path;
	private List<GeneralFile> fileList = new ArrayList<GeneralFile>();
	private List<GeneralFile> filteredList;
	private List<GeneralFile> selectedFiles;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public List<GeneralFile> getFilteredList() {
		return filteredList;
	}

	public void setFilteredList(List<GeneralFile> filteredList) {
		this.filteredList = filteredList;
	}
	
	public List<GeneralFile> getFileList() {
		if (this.fileList.isEmpty()) {
			loadFileList();
		}
		return this.fileList;
	}
	
	public void loadFileList() {
		File tmpFile = new File("C:/Users/ESTEBAN/Downloads");
		FileCrawler fileCrawler = new FileCrawler();
		fileCrawler.runVideoCrawler(tmpFile);
		this.fileList = fileCrawler.getFilesList();
	}

	public void setFileList(List<GeneralFile> fileList) {
		this.fileList = fileList;
	}

	public List<GeneralFile> getSelectedFiles() {
		return selectedFiles;
	}

	public void setSelectedFiles(List<GeneralFile> selectedFiles) {
		this.selectedFiles = selectedFiles;
	}

	public BrowseFilesMB() {
		System.out.println("BrowseFilesMB: START");
		//fc.runFullCrawler();
//		fileCrawler.runAudioCrawler(tmpFile);
//		fileCrawler.runDocumentCrawler(tmpFile);
//		fileCrawler.runImageCrawler(tmpFile);
		//fileCrawler.runVideoCrawler(tmpFile);
//		fileList = fileCrawler.obtainFileList();
		System.out.println("BrowseFilesMB: END");
	}

	@PostConstruct
    public void init() {
        System.out.println("init: START");
//        fileList = fileCrawler.obtainFileList();
        System.out.println("init: END");
		
	}

	
}
