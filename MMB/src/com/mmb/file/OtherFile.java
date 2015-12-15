package com.mmb.file;

import com.mmb.format.OtherFormat;

public class OtherFile extends GeneralFile {

	/**
	 * Serial version UID.
	 */
	private static final long serialVersionUID = 2551812024040565691L;

	public OtherFile(String fext) {
		this.setFileFormat(new OtherFormat(fext));
	}
}
