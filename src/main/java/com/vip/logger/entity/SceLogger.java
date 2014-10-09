package com.vip.logger.entity;

public class SceLogger {

	private Long id;

	private String classPathName;

	private String level;

	private Boolean isEnable;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClassPathName() {
		return classPathName;
	}

	public void setClassPathName(String classPathName) {
		this.classPathName = classPathName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Boolean getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}

}
