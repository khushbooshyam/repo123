package com.app.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Dao.ReleaseDao;
import com.app.Model.Release;

@Service("releaseService")
@Transactional
public class ReleaseServiceImpl implements ReleaseService {

	@Autowired
	ReleaseDao dao;
	
	@Override
	public String createRelease(Release r) {
		System.out.println("in service insert");
		dao.insert(r);
		return "success";
	}


	@Override
	public List<Release> getAllRelease() {
		return dao.getAllRelease();
	}

	@Override
	public List<Release> getReleaseByName(String title) {
	
		return dao.getReleaseByName(title);
	}


	@Override
	public List<Release> getAllReleaseForDelete(String title, String v1) {
		
		return dao.getReleaseForDelete(title, v1);
	}


	@Override
	public void ReleaseDelete(int id) {
		
		dao.deleteRelease(id);
	}


	@Override
	public Release getEditpojo(String t) {
		return dao.getEditModel(t);
	}




}
