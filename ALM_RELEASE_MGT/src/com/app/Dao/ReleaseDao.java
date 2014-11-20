package com.app.Dao;


import java.util.List;



import com.app.Model.Release;

public interface ReleaseDao {
	
	public void insert(Release r);
	public void edit(Release r);
	public Release getEditModel(String t);
	public List<Release> getAllRelease();
	public List<Release> getReleaseByName(String title);
	public List<Release> getReleaseForDelete(String title,String v1);
	public void deleteRelease(int id);
	

}
