package com.release.services;

import java.util.List;

import com.release.model.Iteration;

public interface IterationService {
	
	public Boolean addIteration(Iteration iter) throws Exception;
	public List<Iteration> showIteration();
	public Boolean deleteIteration(int Iid);
	public Iteration editIteration(Iteration iter);
	//public List<Iteration> searchIteration(String seachType, String searchKey);
	public List<Iteration> searchIteration();	

}
