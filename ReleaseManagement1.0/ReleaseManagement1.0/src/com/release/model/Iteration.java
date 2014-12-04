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
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="Iteration")
public class Iteration implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iteId;
	
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private String items;
	@Column
	private String type;
	@Column
	private String status;
	@Column
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Column
	@Temporal(TemporalType.DATE)
	private Date endDate;
	public Iteration() {
		super();
		System.out.println("in iteration construtor");
	}
	@Override
	public String toString() {
		return "Iteration [iteId=" + iteId + ", title=" + title
				+ ", description=" + description + ", items=" + items
				+ ", type=" + type + ", status=" + status + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}
	public int getIteId() {
		return iteId;
	}
	public void setIteId(int iteId) {
		this.iteId = iteId;
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
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Iteration( String title, String description, String items,
			String type, String status) {
		super();

		this.title = title;
		this.description = description;
		this.items = items;
		this.type = type;
		this.status = status;

	}
	
}
