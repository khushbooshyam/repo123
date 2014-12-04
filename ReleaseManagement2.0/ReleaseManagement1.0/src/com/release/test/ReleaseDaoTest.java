package com.release.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.release.dao.ReleaseDao;
import com.release.model.Release;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring-context.xml")
public class ReleaseDaoTest {

	@Autowired
	public ReleaseDao releaseDao;
	private static Release release;
	
	@BeforeClass
	public static void setUp() throws Exception {
		release= new Release();
	}

	@Test
	public void testAddRelease() {
		releaseDao.addRelease(release);
	}

	@Test
	public void testShowRelease() {
		releaseDao.showRelease();
	}

	@Test
	public void testEditRelease() {
		releaseDao.editRelease(release);
	}

	@Test
	public void testSearchRelease() {
		releaseDao.searchRelease();
	}

}
