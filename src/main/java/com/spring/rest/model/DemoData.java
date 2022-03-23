package com.spring.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="demodata")
public class DemoData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String fileName;
	private String location;
	private long size;
	public DemoData() {
		// TODO Auto-generated constructor stub
	}
	public DemoData(long id, String fileName, String location, long size) {
		Id = id;
		this.fileName = fileName;
		this.location = location;
		this.size = size;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "DemoData [Id=" + Id + ", fileName=" + fileName + ", location=" + location + ", size=" + size + "]";
	}
	
	
	

}
