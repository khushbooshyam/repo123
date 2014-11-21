package com.app.Model;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Releases")
public class Release {

	@Id
	@GeneratedValue
	int id;
	@Column(length=20)
	String title;	
	@Column
	String description;
	@Column
	Date startDate;
	@Column
	Date plannedDate;
	@Column
	Date releaseDate;	
	@Column
	String releaseType;
	@Column
	String releaseTo;
	@Column
	String 	items;
	@Column
	String status;
	@Column
	String manager;
	@Column
	String version;
	@Column
	java.util.Date dateTime = (java.util.Date) Calendar.getInstance().getTime();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getReleaseType() {
		return releaseType;
	}
	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
	}
	public String getReleaseTo() {
		return releaseTo;
	}
	public void setReleaseTo(String releaseTo) {
		this.releaseTo = releaseTo;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public java.util.Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(java.util.Date dateTime) {
		if(this.dateTime == null)
			this.dateTime = (java.util.Date) Calendar.getInstance().getTime();
		else
			this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "Release [id=" + id + ", title=" + title + ", description="
				+ description + ", startDate=" + startDate + ", plannedDate="
				+ plannedDate + ", releaseDate=" + releaseDate
				+ ", releaseType=" + releaseType + ", releasTo=" + releaseTo
				+ ", items=" + items + ", status=" + status + ", manager="
				+ manager + ", version=" + version + ", dateTime=" + dateTime
				+ "]";
	}
	
	


}
