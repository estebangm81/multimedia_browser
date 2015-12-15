package com.mmb.drive;

public enum DriveType {
	HD ("Hard Disk"),
	CD ("CD/DVD"),
	NET ("Network"),
	USB ("Pen Drive");
	
	private String unitTypeDesc;
	
	DriveType(String desc) {
		this.unitTypeDesc = desc;
	}
	
	public String getUnitTypeDesc() {
		return unitTypeDesc;
	}

}
