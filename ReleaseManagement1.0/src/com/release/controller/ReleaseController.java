package com.release.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.release.model.Release;
import com.release.services.ReleaseService;

@Controller
@RequestMapping("release")
public class ReleaseController {

	
		
		@Autowired
		ReleaseService releaseService;
		
		@RequestMapping(value="/showRelease",method = RequestMethod.GET)
		  public @ResponseBody List<Release> getAllRelease() throws Exception {
		    
			List<Release> rel=releaseService.showRelease();
			
			if(rel.size()==0)
			{
				throw new Exception("BAD request");
			}
			else
			{
				return rel;
			}
			
			
		  }
		
		@RequestMapping(value="/editRelease",method = RequestMethod.PUT)
		  public @ResponseBody String updateRelease(@RequestBody Release rel) {
		    
			
	
			
			Release rels=releaseService.editRelease(rel);
			
			if(rels!=null)
			{
				System.out.println(rels);
				return "success";
				
			}
			else
			return "success";
			
		  }
		
		@RequestMapping(value="/addRelease",method = RequestMethod.POST)
		  public @ResponseBody String addRelease(@RequestBody Release rel)  {
		    
			
			System.out.println("in addc release"+rel);
			
			Boolean result=releaseService.addRelease(rel);
			
			if(result)
			{
				System.out.println("i am testing" +result);
			return "success";
				
			}
			else
			return "failure";
			}
		
		
		@RequestMapping(value="/deleteRelease")
		  public @ResponseBody String deleteRelease(@RequestParam(value="relId")int relId) {
		    
			
			
			
			Boolean result=releaseService.deleteRelease(relId);
			
			if(result)
			{
			return "success";
				
			}
			else
			return "failure";
			
		  }
		
		@RequestMapping(value="/hisearch",method = RequestMethod.GET)
		  public @ResponseBody List<Release> searchIteration(/*@RequestParam(value = "searchType") String searchType,
				    @RequestParam(value = "searchKey") String searchKey*/)
		  {
		    
			
			System.out.println("hiiiiiiiii");
			
			List<Release> li=releaseService.searchRelease(/*searchType, searchKey*/);
			System.out.println(li);
			if(!li.isEmpty())
			{
			System.out.println("the release is" + li);
				return li;
		    
			}
			else
			{
		 List<Release> lis=new ArrayList<>();	
		 lis.add(null);
			return lis ;
			}
			
		  }
		
		/*@ExceptionHandler(Exception.class)	
		@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="Bad REQUEST")	
		public List<String> notFound()
		{
		    System.out.println("inside exceptions");
			List<String> list=new ArrayList();
			list.add("Data not Found ...... BAD REQUEST");
			return list;
		}*/
}
