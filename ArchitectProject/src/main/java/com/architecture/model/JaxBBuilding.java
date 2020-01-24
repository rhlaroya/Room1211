package com.architecture.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="Building")
public class JaxBBuilding {
	
	private int id;
	private String name;
	private int owner_id;
	
	@XmlElement
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlTransient
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public JaxBBuilding() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JaxBBuilding(Building b) {
		super();
		this.id = b.getId();
		this.name =b.getName();
		this.owner_id = b.getOwner();
	}
	
	@Override
	public String toString() {
		return "JaxBBuilding [id=" + id + ", name=" + name + ", owner_id=" + owner_id + "]";
	}
	
}
