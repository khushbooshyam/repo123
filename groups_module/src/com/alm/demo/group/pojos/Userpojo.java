package com.alm.demo.group.pojos;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Userpojo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="u_id")
	private int uId;

	private String username;

	//bi-directional many-to-one association to Grouppojo
	@ManyToOne
	@JoinColumn(name="g_id")
	private Grouppojo grouppojo;

	public Userpojo() {
	}

	public int getUId() {
		return this.uId;
	}

	public void setUId(int uId) {
		this.uId = uId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Grouppojo getGrouppojo() {
		return this.grouppojo;
	}

	public void setGrouppojo(Grouppojo grouppojo) {
		this.grouppojo = grouppojo;
	}

}