package com.alm.demo.group.controllers;



import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alm.demo.group.dao.GroupDao;
import com.alm.demo.group.pojos.Grouppojo;


@Controller
@RequestMapping("/")/*
*/public class Group {

	@Autowired()
	GroupDao groupdao;
	
	
	//Method to search a group by name
	@RequestMapping(value="/searchgroupbyname")
	public void search_group_by_name(@RequestParam("groupName") String name)
	{
	System.out.println("the given group name is "+name);
	groupdao.getGroupByGroupName(name);	
	
		
	}
	
	//Method to add a group in a database
	  @RequestMapping(value = "/addagroup", method = RequestMethod.POST)
	public void add_group(@ModelAttribute("group")
    Grouppojo grouppojo, BindingResult result)
	{
	System.out.println("the given group pojo is "+grouppojo.getName());
	groupdao.addGroup(grouppojo);	
	}
	
	
	//Edit a group 
	
	@RequestMapping(value="/editgroup/{id}")
	@ModelAttribute("grouppojo")
	public Grouppojo edit_group(@PathVariable("id") int gid)
	{
	 System.out.println("Inside edit group");
	 Grouppojo grouppojo=groupdao.getGroupById(gid);
	 System.out.println("the given group is "+grouppojo.getName());
	return grouppojo;
	
	}
	
	//Edit a group 
	
	@RequestMapping(value="/editgroup")
	public void edit_group(@ModelAttribute("group") Grouppojo grouppojo)
	{
	groupdao.update(grouppojo);
	System.out.println("the group pojo is updated successfully...");
	
	
	}
		
	//Remove a group 
	@RequestMapping("/removegroup")
	public void remove_group(@RequestParam("groupId") int id)
	{
		groupdao.remove(id);		
		
	}
	
	
	//Remove a group 
	@RequestMapping("/addmemberstogroup")
	public void add_members_to_group()
	{
		System.out.println("Inside add members to a group...");
		
	
		
	}
	
	
	//Display members of a  group 
	  @RequestMapping("/showmembers")
	@ModelAttribute("userslist")
		public ArrayList<Grouppojo>  display_all_members_group(@RequestParam("id") int id)
		{
			System.out.println("Inside display all members...");
			groupdao.getAllMembers(id);
			return null;
		}
	
	

	
	
	
	
	

}
