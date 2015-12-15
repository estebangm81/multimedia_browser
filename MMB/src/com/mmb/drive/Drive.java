package com.mmb.drive;

public class Drive {
	
	private DriveLocation location;
	private DriveType type;
	
	public Drive(DriveLocation location, DriveType type) {
		this.location = location;
		this.type = type;
	}

	public DriveLocation getLocation() {
		return location;
	}

	public void setLocation(DriveLocation location) {
		this.location = location;
	}

	public DriveType getType() {
		return type;
	}

	public void setType(DriveType type) {
		this.type = type;
	}
	
	

}
