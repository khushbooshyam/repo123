package com.release.services;

import java.util.List;

import com.release.model.Release;

public interface ReleaseService {
	
	public Boolean addRelease(Release rel);
	public List<Release> showRelease();
	public Boolean deleteRelease(int rId);
	public Release editRelease(Release rel);
	
	public List<Release> searchRelease();
}
