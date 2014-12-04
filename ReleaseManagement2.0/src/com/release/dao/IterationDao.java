package com.release.dao;

import java.util.List;

import com.release.model.Iteration;

public interface IterationDao {

	public Boolean addIteration(Iteration it) throws Exception;
	public List<Iteration> showIteration();
	public boolean deleteIteration(int Iid);
    //public List<Iteration> searchIteration(String seachType, String searchKey);
	public Iteration editIteration(Iteration iter);
	public List<Iteration> searchIteration();
}
