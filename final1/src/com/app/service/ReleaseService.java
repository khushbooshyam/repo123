package com.app.service;

import java.util.List;

import com.app.Model.Release;

public interface ReleaseService {
	
      String createRelease(Release r);
      Release getEditpojo(String t);
      public List<Release> getAllRelease();
  	public List<Release> getReleaseByName(String title);
  	public List<Release> getAllReleaseForDelete(String title,String v1);
  	public void ReleaseDelete(int id);
}
