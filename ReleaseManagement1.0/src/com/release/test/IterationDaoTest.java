package com.release.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.release.dao.IterationDao;
import com.release.model.Iteration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:WebContent/WEB-INF/spring-servlet.xml" })
public class IterationDaoTest {

	@Autowired
	private IterationDao iterationDao;
	
	@Test
	public void testAddIteration() {
		
		try{
			Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-03");
			Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-19");
			@SuppressWarnings("unused")
			Date d3 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-28");
			Iteration iteration=new Iteration();
			//iteration.setIteId(1);
			iteration.setDescription("description");
			iteration.setEndDate(d2);
			iteration.setItems("items");
			iteration.setStartDate(d1);
			iteration.setStatus("status");
			iteration.setTitle("title");
			iteration.setType("type");
			Boolean a = iterationDao.addIteration(iteration);
			
			assertEquals(true, a);
			
			
	}catch(Exception e){
			fail("Not yet implemented");
			e.printStackTrace();
		}
	}

	@Test
	public void testShowIteration() {
		
		try{
			Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-03");
			Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-19");
			@SuppressWarnings("unused")
			Date d3 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-28");
			Iteration iteration=new Iteration();
			iteration.setIteId(1);
			iteration.setDescription("description");
			iteration.setEndDate(d2);
			iteration.setItems("items");
			iteration.setStartDate(d1);
			iteration.setStatus("status");
			iteration.setTitle("title");
			iteration.setType("type");
			List<Iteration> alliter=iterationDao.showIteration();
			System.out.println("in list" +iteration);
			List<Iteration> allitertest=new ArrayList<Iteration>();
			allitertest.add(iteration);
			/*assertEquals(allReleasesTest.get(0).getRelId(), allReleases.get(0)
					.getRelId());
			assertEquals(allReleasesTest.get(0).getTitle(), allReleases.get(0)
					.getTitle());*/
			assertEquals(allitertest.get(0).getIteId(), alliter.get(0).getIteId());
			
		}catch(Exception e)
		{
		fail("Not yet implemented");
		e.printStackTrace();
	}
	}
/*
	@Test
	public void testDeleteIteration() {
		fail("Not yet implemented");
	}
*/
	@Test
	public void testEditIteration() {
		try
		{

			  Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-03");
				Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-19");
				@SuppressWarnings("unused")
				Date d3 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-28");
				Iteration iteration=new  Iteration();
			    iteration.setDescription("description");
			    iteration.setEndDate(d2);
			    iteration.setItems("items");
			    iteration.setStartDate(d1);
			    iteration.setStatus("status");
			    iteration.setTitle("titles");
			    iteration.setType("type");
			    Iteration checkiter=iterationDao.editIteration(iteration);
			    assertEquals(iteration.getTitle(), checkiter.getTitle());
			    
			    
			
		}catch(Exception e){fail("Not yet implemented");
		e.printStackTrace();
	}
	}
/*
	@Test
	public void testSearchIteration() {
		fail("Not yet implemented");
	}
*/
}
