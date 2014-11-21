package com.app.Dao;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.Model.Release;

@Repository("releaseRepository")
@Transactional
public class ReleaseDaoImpl implements ReleaseDao{

	@PersistenceContext
	  private EntityManager em;
	
	@Override
	 @Transactional(readOnly=false)
	public void insert(Release r) {
		System.out.println(r);
		em.persist(r);
	}

	@Override
	public List<Release> getAllRelease() {
		System.out.println("in dao");
		String query="FROM Release";
		List<Release> l1=em.createQuery(query,Release.class).getResultList();
		System.out.println(l1);
		 return l1;
	}

	@Override
	public List<Release> getReleaseByName(String title) {
		String query="select p from Release p where p.title like '%"+title+"%'";
		List<Release> result=em.createQuery(query, Release.class).getResultList();
		
		return result;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Release> getReleaseForDelete(String title, String v1) {
		String query="select p from Release p where p.title='"+title+"'and p.version='"+v1+"'";
		List<Release> l2=em.createQuery(query).getResultList();
		System.out.println("from dao"+l2);
		return l2;
	}

	@Override
	public void deleteRelease(int id) {
		Release r1=em.find(Release.class, id);
		em.remove(r1);
	}

	@Override
	public void edit(Release r) {
		System.out.println("in edit");
		em.merge(r);
		
	}

	@Override
	public Release getEditModel(String t) {
		System.out.println("in edit model getting");
		String query="select p from Release p where p.title='"+t+"'";
		Release result=em.createQuery(query, Release.class).getSingleResult();
		System.out.println("in dao"+result);
		return result;
		
	}

	
	}
