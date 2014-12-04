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

import com.release.dao.ReleaseDao;
import com.release.model.Release;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "file:WebContent/WEB-INF/spring-servlet.xml" })
public class ReleaseDaoTest {

	@Autowired
	private ReleaseDao releaseDao;
	



	@Test
	public void testAddRelease() {

		try {
			Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-03");
			Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-19");
			Date d3 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-28");
			Release rel = new Release();
			rel.setDescription("description");
			rel.setItems("items");
			rel.setManager("manager");
			rel.setStartDate(d1);
			rel.setPlannedDate(d2);
			rel.setReleaseDate(d3);
			rel.setStatus("status");
			rel.setToo("too");
			rel.setType("type");
			rel.setVersion("verson");
			
			Boolean a = releaseDao.addRelease(rel);
			
			assertEquals(true, a);

		} catch (Exception e) { // TODO Auto-generated catch block
			fail("Not yet implemented");
			e.printStackTrace();
		}

	}

	@Test
	public void testShowRelease() {

		try {
			Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-03");
			Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-19");
			Date d3 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-28");
			Release rel = new Release();
			rel.setDescription("description");
			rel.setItems("items");
			rel.setManager("manager");
			rel.setStartDate(d1);
			rel.setPlannedDate(d2);
			rel.setReleaseDate(d3);
			rel.setStatus("status");
			rel.setToo("too");
			rel.setType("type");
			rel.setVersion("dfdf");
			rel.setRelId(9);
			rel.setTitle("title");
			
			List<Release> allReleases = releaseDao.showRelease();
			
			System.out.println(allReleases);

			List<Release> allReleasesTest = new ArrayList<Release>();
			
			allReleasesTest.add(rel);

			assertEquals(allReleasesTest.get(0).getRelId(), allReleases.get(0)
					.getRelId());
			assertEquals(allReleasesTest.get(0).getTitle(), allReleases.get(0)
					.getTitle());
/*
			List<Release> allReleases = releaseDao.showRelease();

			List<Release> allReleasesTest = new ArrayList<Release>();
			Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-03");
			Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-19");
			Date d3 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-28");
			Release releaseTestObj = new Release(1, "title", "description", "items", "manager", 1, "type", "too", "status", d1, d2, d3);
			allReleasesTest.add(releaseTestObj);

			assertEquals(allReleasesTest.get(0).getRelId(), allReleases.get(0)
					.getRelId());
			assertEquals(allReleasesTest.get(0).getTitle(), allReleases.get(0)
		.getTitle());*/
		} catch (Exception e) {
			fail("Not yet implemented");
			e.printStackTrace();
		}

	}
/*
	@Test
	public void testDeleteRelease() {

try{
		Boolean a = releaseDao.deleteRelease(1);
		
		assertEquals(true, a);
}
catch(Exception e)
{
	fail("not yet ");
}
	}
*/
	@Test
	public void testEditRelease() {

		 
		  try {
		
		
			  Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-03");
				Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-19");
				Date d3 = new SimpleDateFormat("yyyy-MM-dd").parse("2013-09-28");
				Release rel = new Release();
				rel.setDescription("description");
				rel.setItems("items");
				rel.setManager("manager");
				rel.setStartDate(d1);
				rel.setPlannedDate(d2);
				rel.setReleaseDate(d3);
				rel.setStatus("status");
				rel.setToo("too");
				rel.setType("type");
				rel.setVersion("dfdf");
		  
		  Release allReleases =  releaseDao.editRelease(rel);
		  System.out.println("in tets edited obj"+allReleases);
		  
		  assertEquals(rel.getManager(),
		  allReleases.getManager());
		  
		  } catch (Exception e) { // TODO Auto-generated catch block
		   fail("Not yet implemented"); e.printStackTrace(); 
		  }
		 
		  }
	

/*	@Test
	public void testSearchRelease() {

		//fail("Not yet implemented");
	}*/

}
