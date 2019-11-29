package org.part.spring.pojo;

import java.util.Date;

public class TraceDevelopPo {

	private Integer traceId;
	private String traceFileName;
	/** 文件创建时间**/
	private Date fileCreateTime;
	/** 最后一次修改时间**/
	private Date fileLastUpdateTime;
	/** 文件类型**/
	private String fileType;
	/** 文件大小**/
	private Integer fileSize;

	
	public Integer getTraceId() {
		return traceId;
	}

	public void setTraceId(Integer traceId) {
		this.traceId = traceId;
	}

	public String getTraceFileName() {
		return traceFileName;
	}

	public void setTraceFileName(String traceFileName) {
		this.traceFileName = traceFileName;
	}

	public Date getFileCreateTime() {
		return fileCreateTime;
	}

	public void setFileCreateTime(Date fileCreateTime) {
		this.fileCreateTime = fileCreateTime;
	}

	public Date getFileLastUpdateTime() {
		return fileLastUpdateTime;
	}

	public void setFileLastUpdateTime(Date fileLastUpdateTime) {
		this.fileLastUpdateTime = fileLastUpdateTime;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

}
