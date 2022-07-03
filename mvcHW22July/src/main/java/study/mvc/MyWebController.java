package study.mvc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MyWebController {
	
	//----------------------------------------------HW1----------------------------------------------------------//
	@Autowired
	JdbcTemplate template;
	
	@GetMapping(value="/input")
	public String f1()
	{
		return "input";
	}
	
	@PostMapping(value="/save")
	public String insert(Model model ,@RequestParam String fname, @RequestParam String lname, @RequestParam String dob)
	{
		template.update("insert into bdaytracker values(default,?,?,?)", fname,lname,dob);
		
		List<BdayTrackerDO> list = template.query("select id from bdaytracker where fname='"+fname+"' and lname='"+lname+"' and dob='"+dob+"'", (rs,rownum)->{return new BdayTrackerDO(rs.getInt(1));});
		
		model.addAttribute("id", list);
//		System.out.println("id = "+list);
		return "input";
	}

	//-----------------------------------------------------HW2-------------------------------------------------------//
	
	@GetMapping(value="/logininput")
	public String f2()
	{
		return "login";
	}
	
	@PostMapping(value="/verify")
	public String verify(Model model, @RequestParam String uname, @RequestParam String pwd)
	{
		if(uname.equals("iet") && pwd.equals("123"))
		{
			return "home";
		}
		else
		{
			model.addAttribute("msg", "Invalid Credentials...");
			return "login";
		}
	}
	
	//------------------------------------------------------HW3-----------------------------------------------------------//
	
	@GetMapping(value="/dateinput")
	public String f3()
	{
		return "date";
	}
	
	@GetMapping(value="/getNames")
	public String getBdayInfo(Model model, @RequestParam String dob1, @RequestParam String dob2)
	{
		List<BdayTrackerDO> list = template.query("select fname,lname from bdaytracker where dob in('"+dob1+"','"+dob2+"')", (rs,rownum)->{return new BdayTrackerDO(rs.getString(1),rs.getString(2));});
	
		model.addAttribute("list", list);
		return "showNames";
		
	}
}
