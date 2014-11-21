package com.app.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.Model.Release;
import com.app.service.ReleaseService;

@Controller
@RequestMapping(value={""})
public class HomeController {
	
	 @Autowired
	    private ReleaseService releaseService;
	 
	 @RequestMapping(value={"","/"})
	    public ModelAndView home() throws Exception{
	     ModelAndView mv=new ModelAndView();
	     mv.setViewName("index");
	      return mv;
	         
	    }
	 @RequestMapping(value="/home",method=RequestMethod.GET)
	 public ModelAndView showHomePage()
	 {
		 return new ModelAndView("index");
	 }
	 
	 @RequestMapping(value="/release",method=RequestMethod.GET)
	 public ModelAndView showReleasePage()
	 {
		 return new ModelAndView("release");
	 }
	 
	 @RequestMapping(value="/editview",method=RequestMethod.GET)
	 public String showEditPage()
	 {
		 return "editpage";
	 }
	 
	 
	 @RequestMapping(value="/editRelease" ,method = RequestMethod.GET)
	 public ModelAndView editReleasePOJO(@RequestParam String title)throws Exception
	 {
		Release r1= releaseService.getEditpojo(title);
		 ModelAndView mv=new ModelAndView();
		 System.out.println("in controller"+r1);
		 mv.addObject("releasePojo", r1);
		 mv.setViewName("editRelease");
		 System.out.println("in controller of edit release");
		return mv;
		 
	 }
	 
	 @RequestMapping(value="/save" ,method = RequestMethod.POST)
	 public ModelAndView createRelease(@ModelAttribute("Release") Release r)throws Exception
	 {
		 System.out.println("in controller of new release");
		releaseService.createRelease(r);
		return new ModelAndView("release");
		 
	 }
	 
	 @RequestMapping(value="/listAll" ,method = RequestMethod.GET)
	 public ModelAndView listAll()throws Exception
	 {
		 System.out.println("in controller");
		 List<Release> l1=new ArrayList<Release>();
		 l1=releaseService.getAllRelease();
		 ModelAndView mv=new ModelAndView();
		 mv.addObject("listallrelease", l1);
		 mv.setViewName("release");
		return mv;
		 
	 }

	 
	 @RequestMapping("/delete")
	    public String delete(@RequestParam int id) throws Exception{
		 System.out.println(id);
		 System.out.println("in delete Controller");
		 releaseService.ReleaseDelete(id);
		 return "release";
		 
	    }
	 
	 
	 @RequestMapping(value="/listByName", method = RequestMethod.GET)
	  public String showListByPage(Model model) {
	 
	    return "listByName";
	  }
	 
	 @RequestMapping(value="/listAllByName",method=RequestMethod.GET)
	 public String listAllByName(@RequestParam String title,Model model)
	 {
		 System.out.println("in controller"+title);
		 List<Release> l1=releaseService.getReleaseByName(title);
		 model.addAttribute("List",l1);
		 return "searchResult";
	 }

	     
	

}
