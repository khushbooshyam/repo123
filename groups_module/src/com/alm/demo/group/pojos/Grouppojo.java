package com.alm.demo.group.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
public class Grouppojo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="g_id")
	private int gId;

	private String description;

	private String name;

	private String status;

	//bi-directional many-to-one association to Userpojo
	@OneToMany(mappedBy="grouppojo")
	private List<Userpojo> userpojos;

	public Grouppojo() {
	}

	public int getGId() {
		return this.gId;
	}

	public void setGId(int gId) {
		this.gId = gId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Userpojo> getUserpojos() {
		return this.userpojos;
	}

	public void setUserpojos(List<Userpojo> userpojos) {
		this.userpojos = userpojos;
	}

	public Userpojo addUserpojo(Userpojo userpojo) {
		getUserpojos().add(userpojo);
		userpojo.setGrouppojo(this);

		return userpojo;
	}

	public Userpojo removeUserpojo(Userpojo userpojo) {
		getUserpojos().remove(userpojo);
		userpojo.setGrouppojo(null);

		return userpojo;
	}

}