package com.mmb.classifier;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mmb.file.GeneralFile;
import com.mmb.type.FileType;

public class Compilation implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1804113665309101630L;

	private Date startDate, endDate;
	
	private Map<FileType, List<GeneralFile>> compilationMap;
	
	public Compilation() {
		compilationMap = new HashMap<FileType, List<GeneralFile>>();
	}
	
	public Map<FileType, List<GeneralFile>> getCompilationMap() {
		return compilationMap;
	}

	public void setCompilationMap(Map<FileType, List<GeneralFile>> compilationMap) {
		this.compilationMap = compilationMap;
	}
	
	public void addFile(GeneralFile generalFile) {
		if (generalFile != null && generalFile.getFileType() != null) {
			if (!this.compilationMap.containsKey(generalFile.getFileType())) {
				this.compilationMap.put(generalFile.getFileType(), new ArrayList<GeneralFile>());
			}
			this.compilationMap.get(generalFile.getFileType()).add(generalFile);
		}
	}
	
	public void printAllFiles() {
		System.out.println("printAllFiles: START");
		startDate = new Date();
		// Get compilations names
		Set<FileType> keys = compilationMap.keySet();
		// Temporary list of files
		List<GeneralFile> tmpList;
		// Iteration over the lists
		for (FileType fileType: keys) {
			tmpList = compilationMap.get(fileType);
			// Iteration over a concrete list
			for (GeneralFile file: tmpList) {
				System.out.println(file.getFilePath() + file.getFileName());
			}
			System.out.println(" ********************************************");
		}
		System.out.println("printAllFiles: END");
		endDate = new Date();
		System.out.println("printAllFiles: elapsed time(ms) = " + (endDate.getTime() - startDate.getTime()));
	}
	
}
