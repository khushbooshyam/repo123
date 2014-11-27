package com.release.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="release_1")
public class Release implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int relId;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private String items;
	@Column
	private String manager;
	@Column
	private String version;
	@Column
	private String type;
	@Column
	private String too;
	@Column
	private String status;
	@Column
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Column
	@Temporal(TemporalType.DATE)
	private Date plannedDate;
	@Override
	public String toString() {
		return "Release [relId=" + relId + ", title=" + title
				+ ", description=" + description + ", items=" + items
				+ ", manager=" + manager + ", version=" + version + ", type="
				+ type + ", too=" + too + ", status=" + status + ", startDate="
				+ startDate + ", plannedDate=" + plannedDate + ", releaseDate="
				+ releaseDate + "]";
	}
	@Column
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	public int getRelId() {
		return relId;
	}
	public void setRelId(int relId) {
		this.relId = relId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
		System.out.println("in set vvtitle");
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
		System.out.println("in set descriptionm0");
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getToo() {
		return too;
	}
	public void setToo(String too) {
		this.too = too;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getPlannedDate() {
		return plannedDate;
	}
	public void setPlannedDate(Date plannedDate) {
		this.plannedDate = plannedDate;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public Release() {
		super();
		System.out.println("inside release constructor");
	}
	public Release(int relId, String title, String description, String items,
			String manager, String version, String type, String too,
			String status) {
		super();
		this.relId = relId;
		this.title = title;
		this.description = description;
		this.items = items;
		this.manager = manager;
		this.version = version;
		this.type = type;
		this.too = too;
		this.status = status;
		
	}
	
	
	
	
	
	
	
	
	
	
}
