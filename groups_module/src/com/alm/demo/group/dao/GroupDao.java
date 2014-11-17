package com.alm.demo.group.dao;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;



import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Repository;


import com.alm.demo.group.pojos.Grouppojo;


@Repository("GroupDao")
@Transactional(propagation=Propagation.REQUIRED)

public class GroupDao implements IGroupDao {

	@PersistenceContext
	private EntityManager entityManager;
	 
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public EntityManager getEntityManager() {
	return entityManager;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Grouppojo> getAllGroups() {
	
		System.out.println("inside get all groups....");
	  	Query query1 = entityManager.createQuery("Select e from Grouppojo e ");	  
		ArrayList<Grouppojo> list1=(ArrayList<Grouppojo>)query1.getResultList( );
	  	System.out.println("querry executed sucessfully...");   	
	  	for( Grouppojo e:list1 )
	  	   	{
	  	   		System.out.print("Group id is"+e.getGId());
	  	   	
	  	   	}
		
		return list1;
	}

	@Override
	public ArrayList<Grouppojo> getGroupByGroupName(String name) {
		System.out.println("the given group name is "+name);
	  	Query query1 = entityManager.createQuery("Select e from Grouppojo e where e.name LIKE :code");
	  	query1.setParameter("code", name);   	
	  	List<Grouppojo> list1=(List<Grouppojo>)query1.getResultList( );
	  	System.out.println("querry executed sucessfully...");   	
	  	for( Grouppojo e:list1 )
	  	   	{
	  	   		System.out.print("Group id is"+e.getGId());
	  	   	
	  	   	}
		
		return null;
		
	}


	@Override
	public Grouppojo getGroupById(int gid) {
		System.out.println("the given group id is "+gid);
	  	Query query1 = entityManager.createQuery("Select e from Grouppojo e where e.gId =:gid");
	  	query1.setParameter("gid", gid);   	
	  	Grouppojo grouppojo=(Grouppojo)query1.getSingleResult();
	  	System.out.println("querry executed sucessfully...");   	
		return grouppojo;
	}

	@Override
	public boolean remove(int gid) {
	
		System.out.println("the given group id is "+gid);
	    entityManager.remove(entityManager.find(Grouppojo.class,gid));
	    System.out.println("query executed sucessfully....");
		
		return false;
	}

	@Override
	public boolean update(Grouppojo grouppojo) {
		
		System.out.println("the group id is"+(entityManager.find(Grouppojo.class, grouppojo.getGId()).getName()));
		entityManager.merge(grouppojo);
		System.out.println("update sucessfull");
		return true;
	}

	@Override
	public boolean addGroup(Grouppojo g) {
		entityManager.persist(g);
		System.out.println("the group value is saved in database");
		return true;
	}
	
	public ArrayList<Grouppojo> getAllMembers(int id)
	{
		System.out.println("Inside get all members of a group..");
		Query query1 = entityManager.createQuery("SELECT e FROM Grouppojo e JOIN e.gId AS a WHERE e.gId = :id");
		query1.setParameter("id", id);
		List<Grouppojo> list1=(List<Grouppojo>)query1.getResultList( );
		System.out.println("the list of users are.."+list1.toString());
	return null;
	}
	
	

}
