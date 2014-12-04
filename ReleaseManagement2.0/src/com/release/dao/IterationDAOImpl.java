package com.release.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.release.model.Iteration;


@Repository
public class IterationDAOImpl implements IterationDao {
	
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public Boolean addIteration(Iteration iter)throws Exception {
                   
		em.persist(iter);
		return true;
		
	}

	@Override
	
	public List<Iteration> showIteration() {
		
	
		Query query = em.createQuery("select c from Iteration c");
		System.out.println(query);
		@SuppressWarnings("unchecked")
		List<Iteration> iterationlist=query.getResultList();
		System.out.println("the list is" + iterationlist);
		
	    em.close();
		
		return iterationlist;
		
		
	}

	@Override
	public boolean deleteIteration(int Iid) {
		
		
	   
		Query query = em.createQuery("delete from Iteration c where iteId='"+Iid+"'");
		
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
	public Iteration editIteration(Iteration iter) {
		
		
	   
	    try{
	    	
		   
		    em.merge(iter);
		   
		    em.close();
		    }
		 catch(Exception e)
		    {
		   	e.printStackTrace();
		    }
	  //  logger.info("iteration updated");
	  return iter;
	}

	

	@SuppressWarnings("unchecked")
	@Override
	public List<Iteration> searchIteration(/*String seachType, String searchKey*/) {
		
		
	    List<Iteration> iterationlist=null;
	    /*if(seachType.equals("status"))
	     * where  status='"+searchKey+"'
	    {*/	
	    
		Query query = em.createQuery("select c from Iteration c ");
		iterationlist=query.getResultList();
		System.out.println("the list is" + iterationlist);
		
	    em.close();
		
	
	   /* }
	    if(seachType.equals("type"))
	    {	
	   
		Query query = em.createQuery("select c from Iteration c where  type='"+searchKey+"'");
		iterationlist=query.getResultList();
		System.out.println("the list is" + iterationlist);
		
	    em.close();
		
	    }
	    if(seachType.equals("title"))
	    {	
	   
		Query query = em.createQuery("select c from Iteration c where  title='"+searchKey+"'");
		iterationlist=query.getResultList();
		System.out.println("the list is" + iterationlist);
		
	    em.close();
		

	    }
	    if(seachType.equals("date"))
	    {	
	   
		Query query = em.createQuery("select c from Iteration c where  startDate='"+searchKey+"'");
		iterationlist=query.getResultList();
		System.out.println("the list is" + iterationlist);
		
	    em.close();
		
		
	    }*/
	    return iterationlist; 
	}

}
