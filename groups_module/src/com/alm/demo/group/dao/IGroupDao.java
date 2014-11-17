package com.alm.demo.group.dao;

import java.util.ArrayList;


import com.alm.demo.group.pojos.Grouppojo;


public interface IGroupDao {
	public boolean addGroup(Grouppojo g);
	public ArrayList<Grouppojo> getAllGroups();
	public ArrayList<Grouppojo> getGroupByGroupName(String name);
	public Grouppojo getGroupById(int gid);
	public boolean remove(int gid);
	public boolean update(Grouppojo grouppojo);
	public ArrayList<Grouppojo> getAllMembers(int id);


	
}
