package com.release.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.release.dao.ReleaseDao;
import com.release.model.Release;

@Service
public class ReleaseServiceImpl implements ReleaseService {

	@Autowired
	private ReleaseDao releaseDao;
	
	@Transactional
	@Override
	public Boolean addRelease(Release rel) {
		System.out.println("in release service"+rel);
		releaseDao.addRelease(rel);
		return true;
	}

	@Transactional
	@Override
	public List<Release> showRelease() {
		// TODO Auto-generated method stub
		return releaseDao.showRelease();
	}

	
	
	
	@Transactional
	public List<Release> searchRelease(/*String searchType, String searchKey*/) {
		
		System.out.println("me servie");
		return releaseDao.searchRelease();
	}



	


    @Transactional
	@Override
	public Boolean deleteRelease(int rId) {
		// TODO Auto-generated method stub
		return releaseDao.deleteRelease(rId);
	}


  @Transactional
	@Override
	public Release editRelease(Release rel) {
		// TODO Auto-generated method stub
		return releaseDao.editRelease(rel);
	}

}
