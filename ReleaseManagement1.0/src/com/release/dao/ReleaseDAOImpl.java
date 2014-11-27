package com.release.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.release.model.Release;



@Repository
public class ReleaseDAOImpl implements ReleaseDao {
	
	@PersistenceContext
	private EntityManager em;
	
    @Override
	public Boolean addRelease(Release rel) {
		
		System.out.println("in release dao before pesist"+rel);
	    em.persist(rel);
	    System.out.println("after persisty");
	    return true;
		
	}


	@Override
	public List<Release> showRelease() {
	
		
		Query query = em.createQuery("select c from Release c");
		@SuppressWarnings("unchecked")
		List<Release> releaseList=query.getResultList();
	
		
	    em.close();
		
		return releaseList;
	}


	@Override
	public Boolean deleteRelease(int rId) {
		
		
		Query query = em.createQuery("delete from Release c where relId='"+rId+"'");
		
		int deleted=query.executeUpdate();
		
         em.close();
         if(deleted <1)
         {
      	   return false;
         }
         else
         {
      	   return true;
         }
		
	}


	@Override
	public Release editRelease(Release rel) {

		
	    try{
	    	em.merge(rel);
		    em.close();
		    }
		 catch(Exception e)
		    {
		   	e.printStackTrace();
		    }
	  //  logger.info("Release updated");
	  return rel;
	}


	

	@SuppressWarnings("unchecked")
	@Override
	public List<Release> searchRelease() {
		
		
		List<Release> releaselist=null;
	    /*if(seachType.equals("status"))
	     * where  status='"+searchKey+"'
	    {*/	
	    
		Query query = em.createQuery("select d from Release d ");
		releaselist=query.getResultList();
		System.out.println("the list is" + releaselist);
		
	    em.close();
	    return releaselist;
	
	}
}