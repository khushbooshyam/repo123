package com.release.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.release.dao.IterationDao;
import com.release.model.Iteration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring-context.xml")
public class IterationDaoTest {

	@Autowired
	IterationDao iterationDao;
	public static Iteration iteration;
	
	@BeforeClass
	public static void setUp() throws Exception {
		iteration= new Iteration();
	}

	@Test
	public void testAddIteration() throws Exception {
		iterationDao.addIteration(iteration);
	}

	@Test
	public void testShowIteration() {
		iterationDao.showIteration();
	}

	
	@Test
	public void testEditIteration() {
		iterationDao.editIteration(iteration);
	}

	@Test
	public void testSearchIteration() {
		iterationDao.searchIteration();
	}

}
