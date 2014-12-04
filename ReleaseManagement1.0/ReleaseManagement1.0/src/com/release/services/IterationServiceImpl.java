package com.release.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.release.dao.IterationDao;
import com.release.model.Iteration;

@Service
public class IterationServiceImpl implements IterationService {

	@Autowired
	private IterationDao iterationDao;
	
	@Override
	@Transactional
	public Boolean addIteration(Iteration iter) throws Exception {
	
		Boolean result=iterationDao.addIteration(iter);
		return result;
		
	}

	@Override
	@Transactional
	public List<Iteration> showIteration() {
		return iterationDao.showIteration();
	}



	@Override
	@Transactional
	public List<Iteration> searchIteration(/*String seachType, String searchKey*/) {
		// TODO Auto-generated method stub
		System.out.println("service");
		return iterationDao.searchIteration(/*seachType, searchKey*/);
	}

	@Override
	@Transactional
	public Boolean deleteIteration(int Iid) {
		// TODO Auto-generated method stub
		return iterationDao.deleteIteration(Iid);
	}

	@Override
	@Transactional
	public Iteration editIteration(Iteration iter) {
		// TODO Auto-generated method stub
		return iterationDao.editIteration(iter);
	}

}
