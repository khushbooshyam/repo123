package com.release.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.release.model.Iteration;
import com.release.services.IterationService;


@Controller
@RequestMapping("iteration")
public class IterationController {
	
	@Autowired
	IterationService iterationService;

  MessageSource messageSource;
	
	@RequestMapping(value="/showIteration",method = RequestMethod.GET)
	  public @ResponseBody List<Iteration> getAllIteration() throws Exception {
	    
		System.out.println("in con");
	
		
		List<Iteration> iter = iterationService.showIteration();
	
		
		if(iter.size()==0)
		{
			throw new Exception("BAD request");
		}
		else
		{
			return iter;
		}
		
		
	  }
	
	@RequestMapping(value="/editIteration",method = RequestMethod.PUT)
	  public @ResponseBody String updateIteration(@RequestBody Iteration iter) {
	    
		System.out.println("in update iteration"+iter);
		Iteration iters=iterationService.editIteration(iter);
		
		if(iters!=null)
		{
			System.out.println(iters);
			return "success";
			
		}
		else
		return "success";
		
	  }

	
	@RequestMapping(value="/addIteration",method = RequestMethod.POST)
	  public @ResponseBody String addIteration(@RequestBody Iteration iter) throws Exception {
	    
		System.out.println("in add ieteration"+iter);
		
		
		Boolean result=iterationService.addIteration(iter);
		
		
		if(result)
		{
			
		return "success";
			
		}
		else
		return "failure";
		
	  }
	
	
	@RequestMapping(value="/deleteIteration"/*{iteId}"*/,method=RequestMethod.DELETE)
  public @ResponseBody String deleteIteration(@RequestParam(value="iteId") int iteId) {
	    
		
		System.out.println(iteId);
		
		Boolean result=iterationService.deleteIteration(iteId);
		
		if(result)
		{
		return "success";
			
		}
		else
		return "failure";
		
	  }
	
	@RequestMapping(value="/hisearch",method = RequestMethod.GET)
	  public @ResponseBody List<Iteration> searchIteration(/*@RequestParam(value = "searchType") String searchType,
			    @RequestParam(value = "searchKey") String searchKey*/)
	  {
	    
		
		
		/*System.out.println(searchType);
		System.out.println(searchKey);*/
		List<Iteration> li=iterationService.searchIteration(/*searchType, searchKey*/);
		System.out.println(li);
		if(!li.isEmpty())
		{
		System.out.println(li);
			return li;
	    
		}
		else
		{
			
	 List<Iteration> lis=new ArrayList<>();	
	 lis.add(null);
		return lis ;
		}
		
	  }
	
	


@ExceptionHandler(Exception.class)	
@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="Bad REQUEST")	
public List<String> notFound()
{
    System.out.println("inside exceptions");
	@SuppressWarnings({ "rawtypes", "unchecked" })
	List<String> list=new ArrayList();
	list.add("Data not Found ...... BAD REQUEST");
	return list;
}
}


